package tests;

import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import models.AddToCardResponse;
import models.AuthorizationResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static filters.CustomLogsFilter.customLogFilter;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

public class CardTests {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "http://demowebshop.tricentis.com";
        Configuration.startMaximized = true;
        Configuration.baseUrl = "http://demowebshop.tricentis.com";
    }

    @Test
    void addItemToCartAsExistUserTest() {
        AddToCardResponse response =
                given()
                        .filter(customLogFilter().withCustomTemplates())
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_attribute_74_5_26=81&product_attribute_74_6_27=85&product_attribute_74_3_28=" +
                        "86&product_attribute_74_8_29=88&addtocart_74.EnteredQuantity=1")
                .cookie("Nop.customer", "e1ff71d8-07d7-48c0-abb7-b8d3121cc413")

                .when()
                .log().uri()
                .log().body()
                .post("/addproducttocart/details/74/1")

                .then()
                .statusCode(200)
                .log().body()
                .extract().as(AddToCardResponse.class);

        assertThat(response.getSuccess()).isEqualTo(true);
        assertThat(response.getMessage()).isEqualTo("The product has been added to your <a href=\"/cart\">shopping cart</a>");

    }
}

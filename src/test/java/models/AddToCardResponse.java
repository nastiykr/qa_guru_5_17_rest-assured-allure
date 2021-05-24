package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddToCardResponse {

    @JsonProperty("message")
    private String message;

    @JsonProperty("updateflyoutcartsectionhtml")
    private String updateflyoutcartsectionhtml;

    @JsonProperty("updatetopcartsectionhtml")
    private String updatetopcartsectionhtml;

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("updateflyoutcartsectionhtml")
    public String getUpdateflyoutcartsectionhtml() {
        return updateflyoutcartsectionhtml;
    }

    @JsonProperty("updateflyoutcartsectionhtml")
    public void setUpdateflyoutcartsectionhtml(String updateflyoutcartsectionhtml) {
        this.updateflyoutcartsectionhtml = updateflyoutcartsectionhtml;
    }

    @JsonProperty("updatetopcartsectionhtml")
    public String getUpdatetopcartsectionhtmle() {
        return updatetopcartsectionhtml;
    }

    @JsonProperty("updatetopcartsectionhtml")
    public void setUpdatetopcartsectionhtml(String updatetopcartsectionhtml) {
        this.updatetopcartsectionhtml = updatetopcartsectionhtml;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }
}

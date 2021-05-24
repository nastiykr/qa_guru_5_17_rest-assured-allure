package filters;

import io.qameta.allure.restassured.AllureRestAssured;

public class CustomLogsFilter {

    private static final AllureRestAssured FILTER = new AllureRestAssured();

    private CustomLogsFilter() {
    }

    public static CustomLogsFilter customLogFilter() {
        return InitLogFilter.logFilter;
    }

    public AllureRestAssured withCustomTemplates() {
        FILTER.setRequestTemplate("request.ftl");
        FILTER.setResponseTemplate("response.ftl");
        return FILTER;

    }

    private static class InitLogFilter {
        private static final CustomLogsFilter logFilter = new CustomLogsFilter();
    }
}
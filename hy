@Given("set Tokenized header with filters")
public void set_Tokenized_header_with_filters(List<String> filters) {
    for (String filterType : filters) {
        Map<String, String> headers = createBaseTokenizedHeader();
        headers.put(filterType, getFilterValue(filterType));
        GlobalCache.setScenarioValue("Filter", filterType);

        commonSteps.apiInfo.setTokenizedHeader(headers);
    }
}

@Then("validate the filter response")
public void validate_the_filter_response() {
    validateFilterResponse();
}

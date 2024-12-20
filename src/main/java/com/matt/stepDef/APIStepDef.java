package com.matt.stepDef;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIStepDef {

	@Given("I get the data based on the baseURI {string}, path {string}, and statusCode is {string}")
	public void getMethod(String baseURI, String path, String statusCode) {
		RestAssured.baseURI = baseURI;

		Response response = RestAssured.given().when().get(path);

		response.then().statusCode(Integer.valueOf(statusCode));

		System.out.println("Response: " + response.asString());
		System.out.println("Status Code: " + response.getStatusCode());
	}

}

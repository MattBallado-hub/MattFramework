package com.matt.stepDef;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIStepDef {

	@Given("I get the data based on the baseURI {string} and statusCode is {string}")
	public void getMethod(String baseURI, String statusCode) {
		RestAssured.baseURI = baseURI;
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		Response response = RestAssured.given().when().get("/users/1");

		response.then().statusCode(Integer.valueOf(statusCode));

		System.out.println("Response: " + response.asString());
		System.out.println("Status Code: " + response.getStatusCode());
	}

}

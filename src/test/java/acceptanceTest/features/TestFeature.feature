@Test
Feature: List of Interview Activities

  @TC001
  Scenario: Navigate to 'Our Locations' page and verify the Page Title is Incorrect
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    Then I validate Page Title is "Test"

  @TC002
  Scenario: Navigate to 'Our Locations' page and verify the Page Title is Correct
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    Then I validate Page Title is "Contact Us — Get In Touch"

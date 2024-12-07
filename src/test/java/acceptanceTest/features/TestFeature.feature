@Test
Feature: List of Interview Activities

  @TC001
  Scenario: Navigate to 'Our Locations' page and validate the Page Title is Incorrect
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    Then I validate Page Title is not "Test"

  @TC002
  Scenario: Navigate to 'Our Locations' page and validate the Page Title is Correct
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    Then I validate Page Title is "Contact Us — Get In Touch"

  @TC003
  Scenario Outline: Navigate to 'Our Locations' page and validate Navigation Bar links
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    Then I validate Navigation Bar "<link>" link is displayed

    Examples: 
      | link       |
      | Solutions  |
      | Products   |
      | Industries |
      | Discover   |
      | About Us   |
      | Careers    |

  @TC004
  Scenario Outline: Navigate to 'Our Locations' page and validate Footer links
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    When I click Accept all button
    Then I validate Footer "<link>" link is displayed

    Examples: 
      | link                       |
      | Explore more of Datacom    |
      | Discover                   |
      | Who we are                 |
      | Our sustainability journey |
      | Our locations              |
      | Year in review             |

  @TC005
  Scenario Outline: Navigate to 'Our Locations' page and validate Contact Us section
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    When I click Accept all button
    And I click Contact Us button
    Then I validate the Contact Us section

  @TC006
  Scenario Outline: Navigate to 'Our Locations' page and validate Contact Us section
    Given I navigate to "https://datacom.com/nz/en/contact-us"
    When I click Accept all button
    And I click Contact Us button
    Then I populate the Contact Us section

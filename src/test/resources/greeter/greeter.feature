Feature: Greeter

  Scenario: Default greeting message
    Given a greeting service
    When I say hello
    Then I am greeted with Hej

  Scenario Outline: Custom Greetings
    Given a greeting service with a greeting <message>
    When I say hello
    Then I am greeted with <message>
    Examples:
      | message   |
      | Hej       |
      | Hello     |
      | Guten Tag |
      | Bonjour   |
      | Hola      |
      | Ciao      |

  Scenario: Long Greeting
    Given a greeting service with a greeting
    """
    Hello Hello Hello Hello Hello Hello Hello Hello
    """
    When I say hello
    Then I am greeted with a long greeting


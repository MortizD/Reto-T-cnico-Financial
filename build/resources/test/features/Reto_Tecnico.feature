# Autor: Miguel Ortiz
@stories
Feature: User Register
  As a user, I want to register in the website Utest.com
  @scenario1
  Scenario: Register in the website
    Given than Miguel wants to register in Utest.com
      | strFirstname | strLastname | strEmail               | strMonth | strDay | strYear | strLanguage | strCity                       | strZipcode | strComputer | strVersion | strOSLanguage | strMobile | strModel | strSystem | strPassword | strConfirmPass |
      | Pruebaops       | Pruebas     | Pruebas8546655@gmail.com | November | 18     | 1998    | Spanish     | Cali Valle de Cauca, Colombia | 760004     | Windows     | 10         | Spanish       | Apple     | IPhone   | iOS 2.0   | Prueba100*  | Prueba100*     |
    When he search the Register option in Utest.com platform
    Then he finds the register option with the necesary fields to access.
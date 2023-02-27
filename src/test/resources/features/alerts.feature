Feature: Yo como analista de automatizacion
  Necesito interacturar con los 4 tipos de ventanas emergentes
  Para aprender a interactuar con alertas

  @1
Scenario: Interactuar con la alerta "see alert"
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de alertas
    And  da click en el Button alertButton   

  @2
Scenario: Interactuar con la alerta "alert will appear after 5 seconds"
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de alertas 
    And  da click en el Button timerAlertButton

  @3
Scenario: Interactuar con la alerta "confirm box will appear"
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de alertas 
    And da click en el Button confirmButton

  @4
Scenario Outline: Click On button click, prompt box will appear
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de alertas 
    And da clic en el Button promtButton enviando el nombre <name>
    Then visualiza el texto You entered <name>

     Examples:
    | name                         |
    | Julian Alexander Garay Rey   |
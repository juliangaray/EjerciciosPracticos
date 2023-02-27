Feature: Yo como analista de automatizacion
  Necesito seleccionar cualquier fecha en las opciones (Select Date y Date And Time)
  Para aprender a interactuar con date picker

  @1
  Scenario: Seleccionar fecha en "Select Date"
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de date picker 
    And selecciona la fecha en Select Date del archivo data.csv
    Then visualiza la fecha seleccionada del archivo data.csv

  @2
  Scenario Outline: Seleccionar fecha en "Date And Time"
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de date picker 
    And selecciona la fecha y hora en Date And Time
    | year  | <year>  |
    | month | <month> |
    | day   | <day>   | 
    | time  | <time>  | 
    Then visualiza la fecha <month> <day>, <year> y hora seleccionada <time>

    Examples:
    | day  | month   | year | time  |
    | 3    | May     | 2025 | 10:00 |
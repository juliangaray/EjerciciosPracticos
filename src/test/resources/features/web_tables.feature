Feature: Yo como analista de automatizacion
  Necesito crear y eliminar nuevo registro
  Para aprender a interactuar con tablas

  @3
  Scenario Outline: Eliminar un registro a una tabla
    Given Julian ingresa a la Home Page
    When se desplaza a la pagina de web tables 
    And elimina el registro de la tabla posicion <posicion>
    Then confirma el registro eliminado con primer nombre <firstName>

   Examples:
    | firstName  |posicion|
    | Cierra     | 1|
    | Alden      | 2|
    | Kierra     | 3|
    
  @4
  Scenario Outline: Agregar un nuevo registro a una tabla
  Given Julian ingresa a la Home Page
    When se desplaza a la pagina de web tables 
    And agrega un nuevo registro a la tabla
    |firstName | <firstName>|
    |lastName  | <lastName> |
    | email    | <email>    |
    | age      | <age>      |
    | salary   | <salary>   |
    |Department|<Department>|
    Then confirma el registro creado con primer nombre <firstName>
  
    Examples:
    | firstName | lastName | email                           | age | salary |Department|
    | Julian    | Garay    | juliangaray@sophossolutions.com | 32  | 24000  |Compliance|
    | Jenny     | Diaz     | jenny21071@sophossolutions.com  | 38  | 32000  |Compliance|
    


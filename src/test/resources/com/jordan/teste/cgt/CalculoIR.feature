Feature: Calculo do valor de imposto de renda 
    
  Scenario: Salario de 1000 reais
    Given Eu tenho um salario de 1000.0
    When Eu quero saber qual o valor do meu IR 
    Then Meu imposto deve ser 0.0
   
  Scenario: Salario de 2500 reais
    Given Eu tenho um salario de 2500.0
    When Eu quero saber qual o valor do meu IR 
    Then Meu imposto deve ser 187.5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.teste.cgt;

import com.jordan.cgt.AplCalcularIR;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Jordan-PC
 */
public class CalcularIR {
    private AplCalcularIR calcularIR;
    private double salario;
    private double imposto;
    
    public CalcularIR(){
        calcularIR = new AplCalcularIR();
    }

    @Given("^Eu tenho um salario de (\\d+\\.\\d+)$")
    public void euTenhoUmSalarioDe(double salario) throws Throwable {
        this.salario = salario;
    }

    @When("^Eu quero saber qual o valor do meu IR$")
    public void euQueroSaberQualOValorDoMeuIR() throws Throwable {
        imposto = calcularIR.CalculaImposto(this.salario);
    }

    @Then("^Meu imposto deve ser (\\d+\\.\\d+)$")
    public void meuImpostoDeveSer(double resultadoEsperado) throws Throwable {
        assertThat(imposto, is(resultadoEsperado));
    }

}

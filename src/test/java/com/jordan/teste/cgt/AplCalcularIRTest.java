/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.teste.cgt;

import com.jordan.cgt.AplCalcularIR;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jordan-Not
 */
public class AplCalcularIRTest {
    AplCalcularIR calcularIR;
    
    @Before
    public void before() {
        calcularIR = new AplCalcularIR();
    }

    /**
     * Test of CalculaImposto method, of class AplCalcularIR.
     */
    @Test
    public void testCalculaSemImposto() {
        double salarioSemImposto = 1000.0;
        double resultadoEsp = 0.0;
        double resultado = calcularIR.CalculaImposto(salarioSemImposto);
        Assert.assertEquals(resultadoEsp, resultado, 0);
    }
    
    @Test
    public void testCalculaImpostoNivel1() {
        double salarioImpostoNivel1 = 2500.0;
        double resultadoEsp = 187.5;
        double resultado = calcularIR.CalculaImposto(salarioImpostoNivel1);
        Assert.assertEquals(resultadoEsp, resultado, 0);
    }
    
}

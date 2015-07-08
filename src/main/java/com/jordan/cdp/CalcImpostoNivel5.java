/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan
 */
public class CalcImpostoNivel5 implements CalcImpostoStrategy{

    @Override
    public double CalculaImposto(double salario) {
        return salario*0.275;
    }
    
}

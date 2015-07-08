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
public class Pessoa {
    
    private String nome;
    private double salario;
    private CalcImpostoStrategy impostoRenda;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.setCalcImpostoStrategy(salario);
        this.salario = salario;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.setCalcImpostoStrategy(salario);
        this.salario = salario;
    }
    
    private void setCalcImpostoStrategy(double salario){
        if(salario < 1710.78)
            this.impostoRenda = new CalcImpostoNivel1();
        else
            if(salario >= 1710.78 && salario < 2563.91)
                this.impostoRenda = new CalcImpostoNivel2();
            else
                if(salario >= 2563.91 && salario < 3418.59)
                    this.impostoRenda = new CalcImpostoNivel3();
                else
                    if(salario >= 3418.59 && salario < 4271.59)
                        this.impostoRenda = new CalcImpostoNivel4();
                    else
                        this.impostoRenda = new CalcImpostoNivel5();                    
    }
    
    public void CalculaImposto(){
        this.impostoRenda.CalculaImposto(this.salario);
    } 
}

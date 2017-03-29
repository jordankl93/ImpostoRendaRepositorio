/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.teste.cgt;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Jordan-PC
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, snippets = SnippetType.CAMELCASE, features="src/test/resources")
public class CukesRunner {
    
}

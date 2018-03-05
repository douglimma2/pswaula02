/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_douglas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class AlunoTest {
    
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     /**
      * Teste do método Situacao
     * Teste com frequência menor que 75%
     */
    @Test
    public void testeFrequencia75Menos() {
        System.out.println("situacao");
        double p1 = 10;
        double trabalho = 8;
        double projetos = 9;
        double frequencia = 0.74;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia);
        assertEquals("Reprovado", result);
    }
    
     /**
      * Teste do método Situacao
     * Teste com frequência maior que 75%
     * e com media >= 7
     */
    @Test
    public void testeFrequencia75MaisAprovado() {
        System.out.println("situacao");
        double p1 = 10;
        double trabalho = 8;
        double projetos = 9;
        double frequencia = 0.76;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia);
        assertEquals("Aprovado", result);
    }
    
     /**
      * Teste do método Situacao
     * Teste com frequência maior que 75%
     * e média entre 3 e 7
     */
    @Test
    public void testeFrequencia75MaiorProvaFinal() {
        System.out.println("situacao");
        double p1 = 3;
        double trabalho = 4;
        double projetos = 4;
        double frequencia = 0.76;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia);
        assertEquals("Prova final", result);
    }
    
    /**
      * Teste do método Situacao
     * Teste com frequência maior que 75%
     * e média < = 3
     */
    @Test
    public void testeFrequencia75MaiorReprovado() {
        System.out.println("situacao");
        double p1 = 2;
        double trabalho = 3;
        double projetos = 2;
        double frequencia = 0.76;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia);
        assertEquals("Reprovado", result);
    }

    /**
     * Teste do método Situacao
     * Teste Prova Final com media >= 5
     */
    @Test
    public void testeProvaFinalAprovado() {
        System.out.println("situacao");
        double p1 = 7;
        double trabalho = 5;
        double projetos = 5;
        double frequencia = 0.80;
        double pf = 9;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia, pf);
        assertEquals("Aprovado na PF", result);
    }
    
     /**
      * Teste do método Situacao
     * Teste Prova Final com media < = 5
     */
    @Test
    public void testeProvaFinalReprovado() {
        System.out.println("situacao");
        double p1 = 7;
        double trabalho = 5;
        double projetos = 6;
        double frequencia = 0.76;
        double pf = 2;
        Aluno instance = new Aluno();
        String result = instance.situacao(p1, trabalho, projetos, frequencia, pf);
        assertEquals("Reprovado na PF", result);
    }
    
}

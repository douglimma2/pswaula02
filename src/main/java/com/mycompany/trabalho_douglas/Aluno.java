/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_douglas;

/**
 *
 * @author Douglas
 */
public class Aluno {
    
    
  /**
 * Todas as variáveis são do tipo double
 * p1 = nota da prova 1
 * trabalho = nota do trabalho
 * projetos = nota final dos projetos durante o curso
 * frequencia = presença na sala de aula, não pode ser menor que 75%
 * m1 = media 1, com a formula dentro do metodo situacao()
 * pf = nota da prova final, caso haja necessidade
 */
    private double p1;
    private double trabalho;
    private double projetos;
    private double frequencia = 0.75;
    private double m1;
    private double pf;
    
    /**
     * Esse método calcula se:
     * O aluno foi APROVADO direto,
     * O aluno foi REPROVADO direto,
     * O aluno foi para Prova final
     * Caso o aluno vá para Prova final, note que é necessário realizar a entrada de um novo argumento
     */
    public String situacao(double p1, double trabalho, double projetos, double frequencia){
        m1 = 0.7 * ((p1 + trabalho)/2) + projetos * 0.3;
        
        if (frequencia >= 0.75){
            if (m1 >= 7){
                return "Aprovado";
            } else if (m1 <= 3){
                return "Reprovado";
            } else {
                return "Prova final";
            }
        } else {
            return "Reprovado";
        }
        
    }
    
    /**
     * Esse método servem para os alunos que ficaram de Prova Final
     * Ele diz se:
     * O aluno foi APROVADO NA PF.
     * O aluno foi REPROVADO NA PF,
     * Note que esse método só será executado se houver a necessidade da nota da PF
     * 
     */
    public String situacao(double p1, double trabalho, double projetos, double frequencia, double pf){
        m1 = 0.7 * ((p1 + trabalho)/2) + projetos * 0.3;
        
        if (frequencia >= 0.75){
            if (m1 >= 7){
                return "Aprovado";
            } else if (m1 <= 3){
                return "Reprovado";
            } else {
                if (((pf+m1)/2) >= 5){
                    return "Aprovado na PF";
                } else {
                    return "Reprovado na PF";
                }
            
            }
        } else {
            return "Reprovado";
        }
        
    }
}

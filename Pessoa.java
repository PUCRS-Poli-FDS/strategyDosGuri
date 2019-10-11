/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

/**
 *
 * @author 14108837
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade; // pode ser null
    private int numDep; // numero de dependentes
    private double contribuicaoPrevidencia;
    private double totalRend; // total rendimentos
    
    public Pessoa(String nome){
        
    }
    public Pessoa(String nome, String cpf, int idade, 
            int numDep, double contribuicaoPrevidencia, double totalRend){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numDep = numDep;
        this.contribuicaoPrevidencia = contribuicaoPrevidencia;
        this.totalRend = totalRend;
        
    }
    public Pessoa(String nome, String cpf, int idade,
            double contribuicaoPrevidencia, double totalRend){
        
    }
}

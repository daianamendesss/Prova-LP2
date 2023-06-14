/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daianamendes
 */
abstract public class Animal {
   
     double tamanho;
     double peso;
     int idade; 
     String nome;
    
public Animal( double tamanho, double peso, int idade, String nome){
    this.tamanho = tamanho;
    this.peso = peso;
    this.idade = idade;
    this.nome = nome;
   
}
// tamanho
 abstract public double getTamanho();
 abstract public void setTamanho(double tamanho);
 
// peso
 abstract public double getPeso();
 abstract public void setPeso(double peso);
 
//idade
 abstract public int getIdade();
 abstract public void setIdade(int idade);
 
//nome 
 abstract public String getNome();
 abstract public void setNome(String nome);
 
//ações
 abstract public void movimentar();
 abstract public void comer();
 abstract public void fazerBaralho();
 abstract public void dadosAnimal();
 
 
    
}
    
  

    
    
    

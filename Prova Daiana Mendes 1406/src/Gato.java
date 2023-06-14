/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15385404608
 */
public class Gato extends Felino {
    public Gato(double tamanho, double peso, int idade, String nome) {
        super(tamanho, peso, idade, nome);
    }

    @Override
    public double getTamanho() {
       return this.tamanho;
    }

    @Override
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
        
       
    }

    @Override
    public double getPeso() {
        return this.peso;
        
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
        
    }

    @Override
    public int getIdade() {
        return this.idade;
       
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
        
    }

    @Override
    public String getNome() {
        return this.nome;
        
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
       
    }

    @Override
    public void comer() {
        System.out.println("Comendo...");
        
    }

    @Override
    public void fazerBaralho() {
        System.out.println("Gatinho miando...  miau miauuu");
        
    }

    @Override
    public void movimentar() {
        System.out.println("Movimentando...");
       
    }

    @Override
    public void dadosAnimal() {
        System.out.println("\n");
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Peso: "+this.peso);
        System.out.println("Idade: "+this.idade);
        System.out.println("Nome: "+this.nome);
      
    }
    
}
    


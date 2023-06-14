/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15385404608
 */
public class Teste {
    public static void main(String[] args){
        Lobo lobo = new Lobo(2.0,80,8, "Fofinho");
        lobo.dadosAnimal();
        lobo.movimentar();
        lobo.comer();
        lobo.fazerBaralho();
        
        Cachorro cachorro = new Cachorro(0.50, 50, 3, "Belinha");
        cachorro.dadosAnimal();
        cachorro.movimentar();
        cachorro.comer();
        cachorro.fazerBaralho();
        
        Gato gato = new Gato(0.30, 30, 2, "Floquinho");
        gato.dadosAnimal();
        gato.movimentar();
        gato.comer();
        gato.fazerBaralho();
        
        Leao leao = new Leao(3.0, 100, 5, "Reizinho");
        leao.dadosAnimal();
        leao.movimentar();
        leao.comer();
        leao.fazerBaralho();
        
        Hipopotamo hipopotamo = new Hipopotamo (150, 90,7,"Yabus");
        hipopotamo.dadosAnimal();
        hipopotamo.movimentar();
        hipopotamo.comer();
        hipopotamo.fazerBaralho();
        
        Tigre tigre = new Tigre(4.0, 120, 5, "Ulisses");
        tigre.dadosAnimal();
        tigre.movimentar();
        tigre.comer();
        tigre.fazerBaralho();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.projetobancario;

/**
 *
 * @author silverio
 */
public class AgenciaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    Conta c1=new Conta();
    
    c1.saldo=1000.00;
    c1.limite=10000.00;
    c1.numero=1234;
    
    System.out.println("Saldo é: "+c1.saldo);
    System.out.println("Seu limite é: "+c1.limite);
    System.out.println("Seu número é: "+c1.numero);
    
    c1.sacar(100.00);
    System.out.println("Seu Saldo é: "+c1.saldo);
    
    c1.deposita(200.00);
    System.out.println("Seu Saldo é: "+c1.saldo);
    
    
    }
    
    Conta1 cc1=new Conta1(5.00,10.00,111);
}

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
public class ContaCorrente extends Conta1{
    
     private double limite;
     
     public double getlimite(){
        return limite;
        
    }
    public void setnumero(double z){
        limite=z;
    }
public ContaCorrente(double v1, double v2, int v3){
    super(v1,v3);
    limite=v2;


}
}

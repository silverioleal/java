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
public class Conta {
   
    private int numero;
    private double saldo;
   
    public double GetSaldo(){
        return saldo;        
    }
    public void setSaldo(double x){
        saldo=x;
    }

    public double getnumero(){
        return numero;
    }
    public void setnumero(int z){
        numero=z;
    }
   }

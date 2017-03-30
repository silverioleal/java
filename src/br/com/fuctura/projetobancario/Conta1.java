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
public class Conta1 {

    double saldo;
    int numero;
    
    public Conta1 (double v1, int v3){
        saldo=v1;
        numero=v3;
    }
    
    public void deposita(double valor){
        saldo=saldo+valor;
    }
    
    public boolean sacar(double valor){
        if (valor<=saldo){
            saldo=saldo-valor;
            return true;         
        }
        else return false;
    }
    public boolean sacar(double valor1, double valor2){
        
        if (saldo<valor1){
            saldo=saldo-valor1;
        }
        else saldo=saldo-valor2;
        return true;
                 
        }

    public double getSaldo() {
        return saldo;
    }


    public int getNumero() {
        return numero;
    }
    }


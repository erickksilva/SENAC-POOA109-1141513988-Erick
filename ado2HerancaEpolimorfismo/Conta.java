/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopoo;

/**
 *
 * @author eric
 */
public class Conta {

    private double saldo, taxaCPMF;
    private String numero;

    Cliente titular;
    Agencia agencia;

    public Conta() {

    }

    public Conta(String numero, Cliente titular, Agencia agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void imprimirDados() {
        
        System.out.println("\t\tTitular: " + titular.getNome());
        System.out.println("\t\tCpf: " + titular.getCpf());
        System.out.println("\t\tNumero: " + agencia.getNumero());
//        System.out.println("___________________________________________________________");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaCPMF() {
        return taxaCPMF;
    }

    public void setTaxaCPMF(double taxaCPMF) {
        this.taxaCPMF = taxaCPMF;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}

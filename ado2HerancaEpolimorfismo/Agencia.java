/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopoo;

/**
 *
 * @author eric
 */
@SuppressWarnings("unused")
public class Agencia {

    private String numero;
    Banco banco;

    public Agencia(String numero, Banco banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void imprimirDados() {
        banco.imprimirDados();
        System.out.println("\t\tAgencia: " + numero);
        System.out.println("___________________________________________________________");
    }

}

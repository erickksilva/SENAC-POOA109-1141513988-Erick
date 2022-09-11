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
public class Banco {

    private String nome;
    private int numero;

    Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirDados() {
        System.out.println("\t\tNumero Banco: " + numero + "\n\t\tNome Banco: " + nome);
    }


}

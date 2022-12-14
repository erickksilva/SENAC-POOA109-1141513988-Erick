/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author eric
 */
public class Produto {

    private int codProduto;
    private String nomeProduto;
    private double preco;

    public Produto() {
    }

    public Produto(int codProduto, String nomeProduto, double preco) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Codigo Produto: " + codProduto + ", Nome produto: " + nomeProduto + ", Preco: " + preco;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eric
 */
public class ProdutoDemo {

    public static void main(String[] args) {

        InserirProdutos.cadastraProduto(new Produto(1, "Iphone 11", 3789.98));
        InserirProdutos.cadastraProduto(new Produto(2, "Notebook Dell inspiron ", 3500.98));
        InserirProdutos.cadastraProduto(new Produto(3, "Ferrari ", 2500.98));
        InserirProdutos.cadastraProduto(new Produto(4, "Redmi note 7", 1235.98));
        InserirProdutos.cadastraProduto(new Produto(5, "Redmi note 7", 1235.98));
        InserirProdutos.cadastraProduto(new Produto(6, "Redmi note 7", 1235.98));
        InserirProdutos.pesquisarProduto(3);

        System.out.println("\nUse o codigo comentado, caso queira inserir seus propios produtos.");
//        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produto a cadastrar: "));
//        for (int i = 1; i <= qtd; i++) {
//            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do produto: "));
//            String nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
//            double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco do produto: "));
//            InserirProdutos.cadastraProduto(new Produto(codigo, nome, preco));;
//            InserirProdutos.pesquisarProduto(i);
//            System.out.println();
//        }

    }
}

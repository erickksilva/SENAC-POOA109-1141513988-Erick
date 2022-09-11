/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopoo;

import java.util.Date;

/**
 *
 * @author eric
 */
public class TesteHeranca {

    public static void main(String[] args) {
        /**
         * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas
         * classes Conta e ContaEspecial
         *
         * Altere o metodo main fazendo com que sejam criadas 02 contas
         * especiais e 01 conta poupanca. Realize 1 saque na 1a. conta especial
         * cujo valor exceda o saldo mas nao ultrapasse o limite. Realize 1
         * saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
         * Realize 1 saque na conta poupanca que exceda o saldo. Imprima os
         * dados das contas para conferir se estao corretas.
         *
         * Dica: Para obter a data do sistema e transformar em String: String
         * strData = new java.util.Date().toString();
         *
         */
        Banco banco = new Banco("Inter", 6589);
        Agencia agencia = new Agencia("256987", banco);

        Cliente cliente = new Cliente("Erick Silva", "045.865.841/27");

        ContaEspecial c1 = new ContaEspecial(200, 1500, "1545", cliente, agencia);

        System.out.println("\n\t\tConta especial 1");
        c1.imprimirDados();//mostrar informacoes da conta especiais

        System.out.println("\n\t\tVocê está realizando um saque...");
        c1.saque(1550);//realiza o saque e dentro do metodo ele imprimir as informacoes

        System.out.println("\n\t\tConta especial 2");
        Banco banco2 = new Banco("Nubank", 7896541);
        Agencia agencia2 = new Agencia("458987", banco2);
        Cliente cliente2 = new Cliente("Sturt Lile", "875.451.325/49");
        ContaEspecial c2 = new ContaEspecial(800, 2000, "1785", cliente2, agencia2);

        c2.mostrarSaldo();
        c2.saque(3500);

        
        banco2 = new Banco("Santander", 96541);
        agencia2 = new Agencia("541235", banco2);
        cliente2 = new Cliente("Sturt Lile", "255.9871.712/49");

        ContaPoupanca p1 = new ContaPoupanca("03/08/1999", 1500, "45871", cliente2, agencia2);

        p1.imprimirDados();
        p1.saque(2000);

    }
}

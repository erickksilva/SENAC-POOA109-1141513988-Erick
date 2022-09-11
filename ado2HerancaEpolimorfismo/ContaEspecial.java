/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopoo;

/**
 *
 * @author eric
 */
public class ContaEspecial extends Conta {

    @SuppressWarnings("unused")
    private double limite;

    public ContaEspecial() {

    }

    public ContaEspecial(double limite, double saldoInicial, String numero, Cliente titular, Agencia agencia) {
        super(numero, titular, agencia);
        this.limite = limite;
        setSaldo(saldoInicial);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimirDados() {
        System.out.println("\t\tConta especial\n");
        agencia.imprimirDados();
        super.imprimirDados();
        titular.imprimirDados();
        System.out.printf("\t\tSaldo: %.2f\n", getSaldo());
        System.out.printf("\t\tLimite: %.2f", limite);
        System.out.println("\n___________________________________________________________");
    }

    public void mostrarSaldo() {
        super.imprimirDados();
        System.out.printf("\t\tSaldo: %.2f\n", getSaldo());
        System.out.printf("\t\tLimite: %.2f", limite);
        System.out.println("\n___________________________________________________________");

    }

    public void saque(double saque) {
        setTaxaCPMF(0.38);
        if (saque < 0) {
            System.out.println("\t\tSaque deve ser positvo");
        } else {
            System.out.printf("\t\tSolicitando saque de R$ %.2f\n", saque);
        }

        if (saque > 0) {
            if (saque > (getSaldo() + getLimite())) {
                System.out.println("\n\t\tSaldo excedido...");
                System.out.println("\t\tLimite execido...");
                System.out.println("\t\tSaque não realizado.");

            } else if ((getSaldo() - saque) < 0) {
                double resto = (saque - getSaldo());
                setLimite(getLimite() - resto);
                setSaldo(0);
                mostrarSaldo();
            } else {
                setSaldo((getSaldo() - saque) - getTaxaCPMF());
                mostrarSaldo();
            }
        }

//    public void saque(double saque) {
//
//        double taxa = 0.48;
//        if (saque > 0) {
//            System.out.printf("\t\tRealizando saque de R$ %.2f\n", saque);
//            if (getSaldo() >= saque) {
//                taxa += getTaxaCPMF();
//                setTaxaCPMF(taxa);
////                System.out.println(taxa); //para ver a taxa cumuladora descomente
//                setSaldo((getSaldo() - saque));
//            }
//            if (saque <= limite) {
//                System.out.println("\t\tAgora está sacando do limite.");
//                setLimite(limite - saque);
//            } else {
//                System.out.println("\t\tSaldo e limite insuficiente.");
//            }
//        }
//    }
    }
}

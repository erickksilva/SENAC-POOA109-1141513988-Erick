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
public class ContaPoupanca extends Conta {

    private String dataAniversario;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String dataAniversario, double saldoInical, String numero, Cliente titular, Agencia agencia) {
        super(numero, titular, agencia);
        setSaldo(saldoInical);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void imprimirDados() {
        String data = new java.util.Date().toString();
        System.out.println("\n___________________________________________________________");
        System.out.println("\n\t\tConta Poupança");
        agencia.imprimirDados();
        System.out.println("\t\tData de hoje: " + data);
        System.out.println("\n\t\tData aniversario: " + this.dataAniversario);
        super.imprimirDados();
        titular.imprimirDados();
        System.out.println("\t\tSaldo:" + getSaldo());
        System.out.println("\n___________________________________________________________");
    }

    public void mostrarSaldo() {
        super.imprimirDados();
        System.out.printf("\t\tSaldo: %.2f\n", getSaldo());
        System.out.println("\n___________________________________________________________");

    }

    public void saque(double saque) {

        if (saque < 0) {
            System.out.println("\t\tSaque deve ser positvo");
        } else {
            System.out.printf("\t\tSolicitando saque de R$ %.2f", saque);
        }

        if (saque > 0) {
            if (saque > (getSaldo())) {
                System.out.println("\n\t\tSaldo excedido...");
                System.out.println("\t\tSaque não realizado.");

            } else if ((getSaldo() - saque) < 0) {
                double resto = (saque - getSaldo());
                setSaldo(0);
                mostrarSaldo();
            } else {
                setSaldo((getSaldo() - saque) - getTaxaCPMF());
                mostrarSaldo();
            }
        }

    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vlrSaldo = 237.48;
        int numero;
        String agencia;
        String nomeCliente;

        System.out.println("Olá, prazer em telos conosco.n\n Para que eu consiga identificar me informe os seguintes dados");
        System.out.println("Informe o número da Agência:");
        agencia = entrada.nextLine();
        System.out.println("\n");
        System.out.println("Informe o número da sua Conta: ");
        numero = entrada.nextInt();
        System.out.println("Agora nos Informe seu Nome:");
        nomeCliente = entrada.nextLine();

        System.out.println("\nObrigado pelas informações.\nProcessando. . .");

        System.out.println("\nÓtimo!\n");

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,\n" +
                " sua agência é "+agencia+", conta "+numero+" e seu saldo de R$ "+vlrSaldo+" já está disponível para saque!");


    }
}
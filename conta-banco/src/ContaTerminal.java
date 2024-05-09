import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira abaixo as informações necessarias para abertura da conta");
        
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Deposito inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + 
                            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                             + ", conta " + numeroConta + " e seu saldo "
                            + String.format("%.2f", saldo) + " já está disponível para saque.");

    }
}

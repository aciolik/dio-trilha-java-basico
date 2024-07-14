
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome");
            String nomeCliente = scanner.nextLine();

            System.err.println("Digite o número da sua Agência");
            int numeroAgencia = scanner.nextInt();

            System.out.println("Digite o número da sua conta");
            int numeroConta = scanner.nextInt();

            double saldoConta = 237.50;


            //Imprimindo dados inseridos pelo usuário

            System.out.println("Olá " + nomeCliente + "!");
            System.out.println("Obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", e sua conta " + numeroConta + ".");
            System.out.println("Seu saldo de R$ " + saldoConta + " já está disponível para saque.");
    
        }
        
        
    }

}

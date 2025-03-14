// utilizando Locale para formatar padrões regionais
import java.util.Locale;

// importando Scanner para capturar entradas do usuário
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // solicitando o nome do cliente
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        // solicitando ao usuário o numero da sua conta
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        // solicitando a agência
        System.out.println("Por favor nos informe o número da sua agência: ");
        String agencia = scanner.next();

        // mostrando seu saldo.
        System.out.println("Seu saldo bancário seria: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados referente a conta bancaria
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +  String.format("%.2f", saldo) + " já está disponível para saque. ");



    }
}

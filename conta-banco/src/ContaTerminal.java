import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu numero da conta:");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a agencia da conta:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Deposite um valor na conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque");

    }
}

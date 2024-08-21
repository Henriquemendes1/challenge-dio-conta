import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int numeroAgencia = 1000 + random.nextInt(9000);
        int numeroConta = 1000 + random.nextInt(9000);

        System.out.println("Olá, digite o seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Olá, " + nome + " Seja bem vindo(a) ao nosso banco, vamos criar sua conta !");
        System.out.println("Qual valor gostaria de depositar: ");
        Double deposito = leitura.nextDouble();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",
                nome, numeroAgencia, numeroConta, deposito
        );
        System.out.println(mensagem);


    }
}
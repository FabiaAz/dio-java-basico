import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite sua agência");
        String agencia = sc.nextLine();
        System.out.println("Digita seu número da conta");
        int numeroConta = sc.nextInt();
        System.out.println("Entre com o seu saldo");
        double saldo = sc.nextDouble();

        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível");

        sc.close();
    }

}

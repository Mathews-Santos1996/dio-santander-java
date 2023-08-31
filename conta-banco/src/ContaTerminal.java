import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Banco S!");

        Scanner numeroAgencia = new Scanner(System.in);
        System.out.println("Digite o número da Agência:");

        String numeroDaAgencia = numeroAgencia.nextLine();

        Scanner numeroConta = new Scanner(System.in);
        System.out.println("Digite o número da conta:");

        int numeroDaConta = numeroConta.nextInt();

        Scanner nomeCliente = new Scanner(System.in);
        System.out.println("Digite o seu nome:");

        String nomeDoCliente = nomeCliente.nextLine();

        Scanner saldoConta = new Scanner(System.in);
        System.out.print("Digite o seu saldo:");

        float saldoDaConta = saldoConta.nextFloat();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroDaAgencia + ", conta " + numeroDaConta + " e " + "seu saldo R$ " + saldoDaConta
                + " já está disponível para saque.");

    }
}

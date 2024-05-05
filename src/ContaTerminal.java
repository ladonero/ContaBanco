import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        int numero;
        String agencia;
        float saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à Agência Digital DIO. Qual o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("Certo. Somos um banco moderno e deixamos você escolher o próprio número de agência. \nPor mais que isso não faça sentido, qual número de agência você deseja?");
        agencia = scanner.nextLine();
        System.out.println("Entendido. Qual vai ser o número da conta? A gente deixa você escolher esse também.");
        numero = scanner.nextInt();
        System.out.println("Por fim, qual o saldo inicial da conta? É tudo dinheiro de Monopoly. Pode falar.");
        saldo = scanner.nextFloat();
        scanner.close();
        System.out.println("Entendido. Processando...");
        Thread.sleep(1000);
        System.out.println("1%");
        Thread.sleep(1000);
        System.out.println("2%");
        Thread.sleep(1000);
        System.out.println("2.01%");
        Thread.sleep(5000);
        System.out.println("100%. Era só brincadeirinha. Não tinha nada acontecendo.");
        Thread.sleep(500);
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));    
    }
}

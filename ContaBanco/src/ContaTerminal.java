import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner texto = new Scanner(System.in);
        
        System.out.println("Como podemos te chamar?");
        String titular = texto.nextLine();

        System.out.println("Qual o número da sua conta?");
        int numeroConta = texto.nextInt();

        System.out.println("Por último, qual o número da sua Agência sem o traçado?");
        int numeroAgencia = texto.nextInt();

        double saldoInicial = 237.48;

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco.%n", titular);
        System.out.printf("Sua agência é: %04d%n", numeroAgencia); // Usando %04d para garantir que tenha 4 dígitos, se necessário.
        System.out.printf("Conta: %04d%n", numeroConta); // Usando %04d para garantir que tenha 4 dígitos, se necessário.
        System.out.printf("E seu saldo R$%.2f já está disponível para saque.%n", saldoInicial);

        texto.close();
    }
}

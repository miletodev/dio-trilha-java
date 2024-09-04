import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
       // o nome é Mario Andrade

        Scanner texto = new Scanner(System.in);
        String titular;
        System.out.println("Como podemos te chamar?");
        titular = texto.nextLine();

        // a conta é 1021

        System.out.println("Qual o número da sua conta?");
        int numeroConta = texto.nextInt();

        // a gência é 067-8

        System.out.println("Por último, qual o número da sua Agência?");
        int numeroAgencia = texto.nextInt();
       
        String saldoInicial = ("237.48");


        System.out.println("Olá, " + titular + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("E seu saldo R$" + saldoInicial + "já está disponível para saque.");
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados

        //Exibir a mensagem conta criada
    }
}

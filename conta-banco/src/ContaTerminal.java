import java.util.Scanner; // Importação da classe Scanner
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // TODO:Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal.
        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!";
        System.out.println(mensagem);


        scanner.close();
    
    }
}

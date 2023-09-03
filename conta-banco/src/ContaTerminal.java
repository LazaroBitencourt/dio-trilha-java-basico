import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
      
        Scanner entrada = new Scanner(System.in) ;
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número de sua conta!");
        numero = entrada.nextInt();

        System.out.println("Digite o número de sua Agência!");
        agencia = entrada.next();

        System.out.println("Digite o seu nome completo!");
        entrada.nextLine();
        nomeCliente = entrada.nextLine();
        
        System.out.println("Digite um saldo para sua conta!");
        saldo = Double.parseDouble(entrada.nextLine());

       System.out.println("Olá " 
       + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
       + agencia + ", conta " 
       + numero + " e seu saldo de " 
       + saldo + " já está disponível para saque."
       );

       entrada.close();
    }
}
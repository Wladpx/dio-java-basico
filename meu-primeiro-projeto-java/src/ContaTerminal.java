import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        //Uma String para o usuario inserir o seu nome

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        //Uma String para o usuario inserir a Agencia
        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = scanner.nextInt();
        //Utilizar int para número inteiro e respectivamente ".nextInt"
        System.out.println("Digite o Saldo na conta !");
        double saldo = scanner.nextDouble();
        //Utilizar double para número decimal e respectivamente ".nextDouble"

        System.out.print("\"Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + "e seu saldo " + saldo + " já está disponível para saque\".");
    }

}

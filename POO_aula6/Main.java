package POO_aula6;
import java.util.Scanner;

public class Main {
private static final Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        PratcObjCONTA c1 = new PratcObjCONTA(null, null, null);
    
        /*Você só precisa chamar set antes do get se você quer alterar o valor antes de ler/imprimir. */

        c1.setNumConta("6666");
        c1.getNumConta();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        c1.setDono(nome);
        c1.getDono();

        c1.setTipo("cp");
        c1.getTipo();


        c1.abrir_Conta();

        c1.setSaldo(500.0f);
        c1.getSaldo();

        c1.Sacar(10.0f);
        c1.pagar_Mensal();

        //c1.fechar_Conta();

                c1.Estatus();

    }
}

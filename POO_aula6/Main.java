package POO_aula6;

public class Main {
    public static void main(String [] args){
        PratcObjCONTA c1 = new PratcObjCONTA(null, null, null);
    
        /*Você só precisa chamar set antes do get se você quer alterar o valor antes de ler/imprimir. */

        c1.setNumConta("1111");

        c1.setDono("Joao");

        c1.setTipo("cc");

        c1.abrir_Conta(c1.getTipo());

        c1.Depositar(300.0f);

        //c1.Sacar(10.0f);
        c1.pagar_Mensal();
        c1.Estatus();

                //c1.fechar_Conta();
                //c1.Estatus();

        PratcObjCONTA c2 = new PratcObjCONTA(null, null, null);
    
        /*Você só precisa chamar set antes do get se você quer alterar o valor antes de ler/imprimir. */

        c2.setNumConta("2222");

        c2.setDono("Creusa");

        c2.setTipo("cp");

        c2.abrir_Conta(c2.getTipo());

        c2.Depositar(500.0f);

        //c2.Sacar(10.0f);
        c2.pagar_Mensal();
        c2.Estatus();

                //c2.fechar_Conta();
                //c2.Estatus();
    }
}

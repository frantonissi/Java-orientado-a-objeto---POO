package POO_aula6;

import java.util.Scanner;

public class PratcObjCONTA {
//Creusa cc Joao cp
    private final Scanner scanner = new Scanner(System.in);
    public String numConta;
    protected String tipo;  //cc -> conta corrente cp -> conta poupanca
    private String dono;
    private Float saldo; //cc ganha 50 reais, cp ganha 150
    private boolean status;

    public PratcObjCONTA(String n, String t, String d){
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        this.saldo = 0.0f;
        this.status = false;
    }

    void abrir_Conta(){
       if(this.tipo == "cc"){
        this.saldo = this.saldo + 50.0f;
       }else if(this.tipo == "cp"){
        this.saldo = this.saldo + 150.0f;
       }
       this.status = true;
    }

    void fechar_Conta(){
        if (this.saldo == 0){
            System.out.println("Conta fechada!");
                this.status = false;
        }else if(this.saldo < 0){
            System.out.println("Safadinho(a), voce esta devendo, a conta nao pode ser fechada");
        }else{
            System.out.println("Ainda tem dinheiro na sua conta, retire-o!");
        }
    }

    Float Depositar(){
        //status tem que ta = 1
        if(this.status == true){
            System.out.println("Digite quanto vc quer depositar: ");
            Float valorDeposito = scanner.nextFloat();
            return valorDeposito;
        }else{
            return 0f;
        }

    }

    void Sacar(Float s){
        if(this.status == true && this.saldo > 0.0){
            System.out.println("Digite quanto voce quer sacar: ");
            this.saldo = this.saldo - s;
        }else{
            System.out.println("Conta inativa ou saldo invalido");
        }
        }
    

    void pagar_Mensal(){
        if(this.status == true && this.saldo > 12.0 && this.tipo == "cc"){
            this.saldo = this.saldo - 12.0f;
            System.out.println("Pagamento realizado;");
        }else if(this.status == true && this.saldo > 20.0 && this.tipo == "cp"){
            this.saldo = this.saldo - 20.0f;
            System.out.println("Pagamento realizado;");
        }
    }
    ///////////////////////////////////
    public String getNumConta() {
        return this.numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    ////////////////////////////////////
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    ////////////////////////////////////
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    ////////////////////////////////////
    public Float getSaldo() {
        return this.saldo;
    }
    public void setSaldo() {
        this.saldo = this.saldo + Depositar();
    }

    void Estatus(){
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + (this.status ? "Ativa" : "Inativa"));
    }
    

}

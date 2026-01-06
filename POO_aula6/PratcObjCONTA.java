package POO_aula6;

public class PratcObjCONTA {
//Creusa cc Joao cp
    public String numConta;
    public String tipo;  //cc -> conta corrente cp -> conta poupanca
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

    void abrir_Conta(String t){
        this.setTipo(t);
       if ("cc".equals(t)){
        this.setSaldo(50.0f);
       }else if("cp".equals(t)){
        this.setSaldo(150.0f);
       }
       this.status = true;
    }

    void fechar_Conta(){
        if (this.saldo == 0){
            System.out.println("Conta fechada!");
            this.setStatus(false);
        }else if(this.saldo < 0){
            System.out.println("Safadinho(a), voce esta devendo, a conta nao pode ser fechada");
        }else{
            System.out.println("Ainda tem dinheiro na sua conta, retire-o!");
        }
    }

    void Depositar(Float valorDeposito){
        //status tem que ta = 1
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+valorDeposito);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Conta inexistente");
        }

    }

    void Sacar(Float s){
        if(this.getStatus() && this.getSaldo() >= s){
            this.setSaldo(this.getSaldo()-s);
            System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Conta inativa ou saldo invalido");
        }
        }
    
    void pagar_Mensal(){
        if(this.getStatus() && this.getSaldo() > 12.0 && this.getTipo() == "cc"){
            this.setSaldo(this.getSaldo()-12);
            System.out.println("Pagamento realizado;");
        }else if(this.getStatus() && this.getSaldo() > 20.0 && this.getTipo() == "cp"){
            this.setSaldo(this.getSaldo()-20);
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
    public void setSaldo(Float valor) {
        this.saldo = valor;
    }
    /////////////////////////////////////
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    void Estatus(){
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + (this.status));
    }
    

}

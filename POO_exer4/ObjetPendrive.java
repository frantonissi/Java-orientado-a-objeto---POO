package POO_exer4;

public class ObjetPendrive {
    private String tamanho;
    private String cor;
    private int espaco;
    private boolean funcionando;

    public ObjetPendrive(String t, String c, int e, boolean f){
        this.tamanho = t;
        this.cor = c;
        this.espaco = e;
        //this.perfeitoEstado();
        this.funcionando = f;
    }

    public String getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(String t){
        this.tamanho = t;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public int getEspaco(){
        return this.espaco;
    }

    public void setEspaco(int e){
        this.espaco = e;
    }

    public boolean getFuncionando(){
        return this.funcionando;
    }

    public void setFuncionando(boolean b){
        this.funcionando = b;
    }

    public void quebrado(){
        this.funcionando = false;
    }

    public void perfeitoEstado(){
        this.funcionando = true;
    }

    public void status(){
        System.out.println("tamanho " + this.tamanho);
        System.out.println("Cor " + this.cor);
        System.out.println("Espaco " + this.espaco + "Gb");
        System.out.println("Funcionando " + this.funcionando);
    }

}

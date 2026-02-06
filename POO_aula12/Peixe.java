package POO_aula12;

public class Peixe extends Animal {

    private String corEscama;
    private boolean soltarBolha;

    

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public boolean isSoltarBolha() {
        return soltarBolha;
    }

    public void setSoltarBolha(boolean soltarBolha) {
        this.soltarBolha = soltarBolha;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando! ");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo minhoca ");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe nao faz som");
    }

    public void soltarBolha(){
        if(this.isSoltarBolha()){
        System.out.println("Soltando bolha ");
        }else{
            System.out.println("O peixe nao esta a fim de soltar bolha ");
        }
    }

    @Override
    public String toString() {
        return "Peixe [peso=" + peso + ", corEscama=" + corEscama + ", idade=" + idade + ", soltarBolha=" + soltarBolha
                + ", membros=" + membros + "]";
    }
    
    
}

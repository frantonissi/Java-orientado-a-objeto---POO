package POO_aula12;

public class Ave extends Animal{
    
    private String corPena;
    private boolean fazerNinho;
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public boolean isFazerNinho() {
        return fazerNinho;
    }
    public void setFazerNinho(boolean fazerNinho) {
        this.fazerNinho = fazerNinho;
    }

    @Override
    public void locomover(){
        System.out.println("Voando! ");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo frutas doces ");
    }

    @Override
    public void emitirSom(){
        System.out.println("Cantarolar do passaro gordo");
    }

}

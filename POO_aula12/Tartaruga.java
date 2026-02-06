package POO_aula12;

public class Tartaruga extends Reptil{

    @Override
    public void locomover(){
        System.out.println("Beeeeeeeeeeeeeeem devagar! ");
    }

    @Override
    public String toString() {
        return "Tartaruga [" + "Idade " + this.idade + " Peso " + this.peso + " Membros " + this.membros + "]";
    }
    
}

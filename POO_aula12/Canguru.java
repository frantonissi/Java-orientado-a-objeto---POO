package POO_aula12;

public class Canguru extends Mamifero {

    public void usarBolsa(){
        System.out.println("Usando bolsa! ");
    }

    @Override
    public void locomover(){
        System.out.println("Pulando");
    }

    @Override
    public String toString() {
        return "Canguru [" + "Idade " + this.idade + " Peso " + this.peso + " Membros " + this.membros + "]";
    }

    
    
}

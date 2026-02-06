package POO_aula12;

public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("osso sendo enterrado...");
        System.out.println("Osso enterrado! ");
    }

    public void abanarRabo(){
        System.out.println("[]   ->    []");
        System.out.println(" []   ->  []");
        System.out.println("  []  -> []");
        
    }

     @Override
    public String toString() {
        return "Cachorro [" + "Idade " + this.idade + " Peso " + this.peso + " Membros " + this.membros + "]";
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au Au!!!");
    }

    
}

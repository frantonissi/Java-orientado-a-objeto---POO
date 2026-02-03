package POO_aula10e11;


public class Tecnico extends Pessoa {
    
    private String registroprofissional;

    public String getRegistroprofissional() {
        return registroprofissional;
    }

    public void setRegistroprofissional(String registroprofissional) {
        this.registroprofissional = registroprofissional;
    }
    
    public void praticar(String a){
        System.out.println("Praticando " + a);
    }

    @Override
    public String toString() {
        return "Tecnico [nome=" + nome + ", registroprofissional=" + registroprofissional + ", idade=" + idade
                + ", sexo=" + sexo + "]";
    }

    

}

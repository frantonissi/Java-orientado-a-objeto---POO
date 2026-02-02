package POO_aula10e11;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    //Metodos especiais:

    public Funcionario(String se, boolean tr){
        this.setSetor(se);
        this.setTrabalhando(tr);
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(String a){
        System.out.println("Setor sera mudado: ");
        this.setSetor(null);
        this.setSetor(a);
    }

    @Override
    public String toString() {
        return "Funcionario [setor=" + setor + ", trabalhando=" + trabalhando + " Nome = " + getNome() + " Idade = " + getIdade() + " Sexo = " + getSexo() + "]";
    }

    /*public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Trabalhando: " + this.getTrabalhando());
    }*/

        
    
    
}

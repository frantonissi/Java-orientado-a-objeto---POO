package POO_aula10;

public class Funcionario {

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


    
    
}

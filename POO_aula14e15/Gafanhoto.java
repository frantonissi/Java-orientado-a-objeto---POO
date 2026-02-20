package POO_aula14e15;

public class Gafanhoto extends Pessoa{
    private String login;
    private  int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisum(){
        this.setTotalAssistido(this.getTotalAssistido()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto " + super.toString() + " [login=" + login + ", totalAssistido=" + totalAssistido + "]";
    }
}

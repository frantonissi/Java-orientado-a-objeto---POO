package POO_aula12;

public abstract class Animal {
    protected  Float peso;
    protected  int idade;
    protected  int membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    @Override
    public String toString() {
        return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
    }

    

    

    
}

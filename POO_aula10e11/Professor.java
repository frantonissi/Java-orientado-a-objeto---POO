package POO_aula10e11;

public class Professor extends Pessoa{
    
    private String especialidade;
    private Float salario;

    //Metodos especiais:
    public Professor(String es, Float sa){
        this.setEspecialidade(es);
        this.setSalario(sa);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especi) {
        this.especialidade = especi;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public void receberAumento(int valor){
        System.out.println("Aumento será aplicado: ");
        this.setSalario(this.getSalario() + valor);
    }

    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + " Nome = " + getNome() + " Idade = " + getIdade() + " Sexo = " + getSexo() + "]";
    }


    /*public void status(){
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Sexo " + this.getSexo());
        System.out.println("Salario " + this.getSalario());
        System.out.println("Especialidade " + this.getEspecialidade());
    }*/

}

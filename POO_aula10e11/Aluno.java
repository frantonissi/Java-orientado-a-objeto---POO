package POO_aula10e11;

public class Aluno extends Pessoa {
    private boolean matric;
    private String curso;
    private float mensalidade;

    //Metodos especiais:

    public boolean getMatric(){
        return matric;
    }
    public void setMatric(boolean m){
        this.matric = m;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
    public float getMensalidade(){
        return mensalidade;
    }
    public void setMensalidade(float mensal){
        this.mensalidade = mensal;
    }

    public void cancelarMatric(){
        if(this.getMatric()){
            this.setMatric(false);
            this.setCurso(null);
        }else{
            System.out.println("Voce nao esta matriculado! ");
        }
    }

    public void pagarMensalidade(){
        if(this.getMatric()){
        float Matricula = this.getMensalidade();
        System.out.println("Você que nao é bolsista deverá pagar de matricula: " + Matricula);
        System.out.println("Processando ...");
        System.out.println("Matricula paga! ");
        }
    }

    @Override
    public String toString() {
        return "Aluno [matricula = " + matric + ", curso = " + curso + ", Nome = " + getNome() + ", Idade = "
                + getIdade() + ", Sexo = " + getSexo() + "]";
    }

   

    

    /*public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matriculado: " + this.getMatric());
    }*/

    

}

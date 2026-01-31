package POO_aula10;

public class Aluno extends Pessoa {
    private boolean matric;
    private String curso;

    //Metodos especiais:

    public Aluno(boolean ma, String cu){
        this.setCurso(cu);
        this.setMatric(ma);
    }

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

    public void cancelarMatric(){
        if(this.getMatric()){
            this.setMatric(false);
            this.setCurso(null);
        }else{
            System.out.println("Voce nao esta matriculado! ");
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

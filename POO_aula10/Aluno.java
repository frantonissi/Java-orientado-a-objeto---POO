package POO_aula10;

public class Aluno {
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
            this.setCurso("NULL");
        }else{
            System.out.println("Voce nao esta matriculado! ");
        }
    }

}

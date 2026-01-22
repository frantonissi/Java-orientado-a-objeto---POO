package POO_aula9;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodo construtor: 
    public Livro(String t, String au, int tp, Pessoa le){

        this.titulo = t;
        this.autor = au;
        this.totalPag = tp;
        this.leitor = le;
        this.aberto = false;
        this.pagAtual = 0;

    }
    //Metodos especiais:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("---- DETALHES DO LIVRO ----");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de paginas: " + getTotalPag());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("Aberto: " + isAberto());
        System.out.println("sendo lido por: " + leitor.getNome());
    }
    @Override
    public void abrir() {

        this.setAberto(true);
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("A pagina atual do livro é: " + this.getPagAtual());
        
    }
    @Override
    public void fechar() {

        this.setAberto(false);
        System.out.println("Bye, Bye");
       
    }
    @Override
    public void folhear(int p) {

        if(this.isAberto() == true && p <= this.getTotalPag()){
        this.setPagAtual(this.getPagAtual() + p);
        System.out.println("Voce está na pagina: " + this.getPagAtual());
        }else{
            System.out.println("Vc nao pode ir para essa pagina!!!");
        }
       
    }
    @Override
    public void avancarPag() {
        
        if(this.isAberto() == true && this.getPagAtual() < this.getTotalPag()){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Voce esta na pagina: " + this.getPagAtual());
        }

    }
    @Override
    public void voltarPag() {

        if(this.isAberto() == true && this.getPagAtual() >= 0){
            this.setPagAtual(this.getPagAtual() - 1);
        }
        
    }
    



}

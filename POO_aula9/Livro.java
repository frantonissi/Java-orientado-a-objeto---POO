package POO_aula9;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
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
    }
    @Override
    public void abrir() {

        
        
    }
    @Override
    public void fechar() {
       
    }
    @Override
    public void folhear() {
       
    }
    @Override
    public void avancarPag() {
        
    }
    @Override
    public void voltarPag() {
        
    }
    



}

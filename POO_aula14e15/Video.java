package POO_aula14e15;

public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0.0f;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float novaAva;
        novaAva = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = novaAva;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        if(this.isReproduzindo() == false) {
            this.reproduzindo = true;
        }else{
            System.out.println("Seu video ja esta reproduzindo! ");
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo() == true){
            this.reproduzindo = false;
        }else{
            System.out.println("Seu video ja está parado");
        }
    }

    @Override
    public void like() {
    this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}

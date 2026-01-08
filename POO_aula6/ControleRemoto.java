package POO_aula6;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean stream;
    private boolean netflix;
    private boolean amazon;
    private boolean hbomax;
    //Metodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private int getVolume(){
        return this.volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getLigado(){
        return this.ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setStream(boolean stream){
        this.stream = stream;
    }
    private boolean getStream(){
        return this.stream;
    }
    private void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }
    private boolean getNetflix(){
        return this.netflix;
    }
    public void setAmazon(boolean amazon) {
        this.amazon = amazon;
    }
    public boolean getAmazon(){
        return this.amazon;
    }
    public void setHbomax(boolean hbomax) {
        this.hbomax = hbomax;
    }
    public boolean getHBOmax(){
        return this.hbomax;
    }
    //Metodos abstratos
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("-----------Menu-----------");
        System.out.println("Esta ligado: " + this.getLigado());
        System.out.println("Esta tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i < this.getVolume();i += 10){
            System.out.print("🔊");
        }
        System.out.println();
        if(getNetflix()){
            System.out.println("Bem vindo a Netflix!");
        }else if(getAmazon()){
            System.out.println("Bem vindo a Amazon");
        }else if(getHBOmax()){
            System.out.println("Bem vindo a HBOmax!!!");
        }else{
            System.out.println("Nenhum sistema de stream selecionado");
        }

    }
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume()+1);
        }
    }
    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume()-1);
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    public void play(){
        if(getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    public void pause(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

    public void AcessarStreams(){
        if (this.getLigado()){
            this.setStream(true);
            System.out.println("Acessando os serviços de stream...");
        }
    }
    public void Netflix(){
        if (this.getLigado() && this.getStream() && !this.getAmazon() && !this.getHBOmax()){
            this.setNetflix(true);
        }else{
            this.setNetflix(false);
        }
    }
    public void Amazon(){
        if (this.getLigado() && this.getStream() && !this.getNetflix() && !this.getHBOmax()){
         this.setAmazon(true);
    }
}
    public void HBOmax(){
        if (this.getLigado() && this.getStream()&& !this.getAmazon() && !this.getNetflix()){
            this.setHbomax(true);
    }
}
    }

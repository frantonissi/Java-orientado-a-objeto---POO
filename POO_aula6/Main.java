package POO_aula6;//encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.AcessarStreams();
        c.HBOmax();
        c.abrirMenu();
        c.fecharMenu();
    }
}


//interface sempre tem só metodos abstratos
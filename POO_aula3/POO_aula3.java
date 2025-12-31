package POO_aula3;
public class POO_aula3{
    public static void main(String[] args){
        Caneta c1 = new Caneta(); //objeto c1 que usa a classe caneta
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
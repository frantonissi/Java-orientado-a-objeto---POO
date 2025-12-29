package POO_aula2;
public class POO_aula2{
    public static void main(String[] args){
        Caneta c1 = new Caneta(); //objeto c1 que usa a classe caneta
        c1.cor = " Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;  
        c1.modelo = " BIC";
        c1.tampar(); //o tampar vai da false se eu nao por isso, pq se nao chamar o atributo, sempre vai ser false
        c1.rabiscar();
        //c1.status();
    }
}
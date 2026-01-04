package POO_exer4;

public class POO_exer4 {
    public static void main(String[] args){
        System.out.println("Usando o metodo construtor: ");
        ObjetPendrive pd0 = new ObjetPendrive("Pequeno", "Prateado", 64, true);
                ObjetPendrive pd1 = new ObjetPendrive("Pequeno", "Vermelho", 128, false);
        pd0.status();
        pd1.status();





        /*System.out.println("Abaixo nao é usando metodo construtor: ");
        pd.setTamanho("Pequeno");
        pd.setCor("prateado");
        pd.setEspaco(64);
        pd.setFuncionando(true);

        pd.status();*/
    }
}

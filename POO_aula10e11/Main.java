package POO_aula10e11;

public class Main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();

        v1.setIdade(18);
        v1.setNome("Carlos Roberto");
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        System.out.println("/////////////////////////////////////\n");

        a1.setIdade(20);
        a1.setNome("Francisco");
        a1.setSexo("Masculino");
        a1.setMatric(true);
        a1.setCurso("Computacao");
        a1.setMensalidade(1000);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("/////////////////////////////////////\n");


        b1.setIdade(15);
        b1.setNome("Lorena");
        b1.setSexo("Feminino");
        b1.setMatric(true);
        b1.setCurso("Moda");
        b1.setBolsa(30);
        b1.setMensalidade(1000);
        b1.setBolsaRenovada(true);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}


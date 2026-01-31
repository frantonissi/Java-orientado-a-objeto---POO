package POO_aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno(false, null);
        Professor p3 = new Professor(null, null);
        Funcionario p4 = new Funcionario(null, true);

        p3.setNome("Carlos maia");
        p3.setEspecialidade("Programacao Objeto");;
        p3.setSalario(10000.0f);
        p3.receberAumento(100);
        System.out.println(p3.toString());
        System.out.println(p3.toString());
    }
}

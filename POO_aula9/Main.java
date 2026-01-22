package POO_aula9;

public class Main{
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Maria", 22, "Feminino");
        p[1] = new Pessoa("Pedro", 25, "Masculino");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Gustavo Guanabara", 800, p[0]);

        l[0].abrir();
        l[0].folhear(298);
        l[0].avancarPag();
        l[0].detalhes();
    }
}
package POO_aula14e15;

public class Main {
    public static void main (String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aprendendo POO");
        v[1] = new Video("Aprendendo Ciberseguranca");
        v[2] = new Video("Aprendendo Java");

        v[2].like();
        v[2].play();
        System.out.println(v[2].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Francisco", 19, "Masculino", "Francis");
        g[1] = new Gafanhoto("Laura", 33, "Feminino", "Laurinha123");
        System.out.println(g[0].toString());
    }
}

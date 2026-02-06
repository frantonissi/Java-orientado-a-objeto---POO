package POO_aula12;

public class Main {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

        m.setIdade(12);
        m.setMembros(4);
        m.setPeso(222.2f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.emitirSom();
        System.out.println(m.toString());
        System.out.println("///////////////////////////////\n");

        r.setIdade(8);
        r.setMembros(4);
        r.setPeso(50.5f);
        r.alimentar();
        r.emitirSom();
        System.out.println(r.toString());
        System.out.println("///////////////////////////////\n");

        p.setIdade(3);
        p.setMembros(0);
        p.setPeso(15.0f);
        p.alimentar();
        p.emitirSom();
        System.out.println(p.toString());
        System.out.println("///////////////////////////////\n");

        a.setIdade(5);
        a.setMembros(2);
        a.setPeso(1.5f);
        a.alimentar();
        a.emitirSom();
        System.out.println(a.toString());
        System.out.println("///////////////////////////////\n");

        c.setIdade(14);
        c.alimentar();
        c.setMembros(4);
        c.setPeso(100.0f);
        System.out.println(c.toString());
        System.out.println("///////////////////////////////\n");


        d.setIdade(5);
        d.setPeso(30.0f);
        d.setCorPelo("Branco");
        d.setMembros(4);
        d.alimentar();
        d.emitirSom();
        d.abanarRabo();
        System.out.println(d.toString());
        System.out.println("///////////////////////////////\n");

        s.setIdade(6);
        s.setPeso(5.0f);
        s.setMembros(0);
        s.setCorEscama("Verde");
        s.alimentar();
        s.emitirSom();
        System.out.println(s.toString());
        System.out.println("///////////////////////////////\n");

        t.setIdade(50);
        t.setPeso(80.0f);
        t.setMembros(4);
        t.setCorEscama("Marrom");
        t.alimentar();
        t.emitirSom();
        System.out.println(t.toString());
        System.out.println("///////////////////////////////\n");

        g.setIdade(2);
        g.setPeso(0.5f);
        g.setMembros(0);
        g.setCorEscama("Laranja");
        g.alimentar();
        g.emitirSom();
        g.setSoltarBolha(true);
        g.soltarBolha();
        System.out.println(g.toString());
        System.out.println("///////////////////////////////\n");

        ar.setIdade(10);
        ar.setPeso(2.0f);
        ar.setMembros(2);
        ar.setCorPena("Azul e Amarelo");
        ar.alimentar();
        ar.emitirSom();
        ar.fazerNinho();
        System.out.println(ar.toString());
        System.out.println("///////////////////////////////\n");



    }
    
}

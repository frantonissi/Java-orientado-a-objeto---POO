package POO_exer2;

public class Imagem {
    //ATRIBUTOS:
    String titulo;
    int tamanho;
    String cor;
    String nome;
    Float valor;
    boolean quebrada;

    //METODOS
    void condicao(){
        if(this.quebrada == false){
            System.out.println("Da pra rezar");
        }else{
            System.out.println("Esta quebrada, foi mal");
        }
    }

    //ESTADO:
    void status(){
        System.out.println("Titulo: " + this.titulo);
                System.out.println("Tamanho em cm: " + this.tamanho);
                        System.out.println("Cor: " + this.cor);
                                System.out.println("Nome: " + this.nome);
    }

}



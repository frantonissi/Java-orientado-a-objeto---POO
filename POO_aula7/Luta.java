package POO_aula7;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    private Resultado aposta;

    //Metodos especiais:
    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Resultado getAposta(){
        return aposta;
    }

    public void setAposta(Resultado aposta){
        this.aposta = aposta;
    }

    //////////////////////////////////////////////
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategorias().equals(l2.getCategorias()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    

    public void lutar(){
        if(this.aprovada){
            System.out.println("##########DESAFIADO##########");
            desafiado.apresentar();
            System.out.println("##########DESAFIANTE##########");
            desafiante.apresentar();
            Random aleatorio  = new Random();
            Resultado vencedor = Resultado.values()[aleatorio.nextInt(Resultado.values().length)];
            
                        switch (vencedor) {
                case EMPATE:
                    System.out.println("======================================== \n");
                    System.out.println("Empatou \n");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    System.out.println("========================================");
                    if(getAposta() == Resultado.EMPATE){
                        System.out.println("Parabens, voce acertou a aposta no empate! \n");
                    } else {
                        System.out.println("Voce errou a aposta! \n");
                    }
                    break;
                case DESAFIADO:
                    System.out.println("======================================== \n");
                    System.out.println(desafiado.getNome() + " ganhou a luta! \n");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("======================================== ");
                    if(getAposta() == Resultado.DESAFIADO){
                        System.out.println("Parabens, voce acertou a aposta no " + desafiado.getNome() + "! \n");
                    } else {
                        System.out.println("Voce errou a aposta! \n");
                    }
                    break;
                case DESAFIANTE:
                    System.out.println("======================================== \n");
                    System.out.println(desafiante.getNome() + " ganhou a luta \n");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    System.out.println("========================================");
                    if(getAposta() == Resultado.DESAFIANTE){
                        System.out.println("Parabens, voce acertou a aposta no " + desafiante.getNome() + "! \n");
                    } else {
                        System.out.println("Voce errou a aposta! \n");
                    }
                    break;
            
                default:
                    break;
            }

            
        }
    }

      
}

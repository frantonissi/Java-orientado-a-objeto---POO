package POO_aula10e11;

public class Bolsista extends Aluno{
        private int bolsa;
        private boolean bolsaRenovada;

        //Metodos especias:
        
        public int getBolsa() {
            return bolsa;
        }

        public void setBolsa(int bolsa) {
            this.bolsa = bolsa;
        }

        public boolean isBolsaRenovada() {
            return bolsaRenovada;
        }

        public void setBolsaRenovada(boolean bolsaRenovada) {
            this.bolsaRenovada = bolsaRenovada;
        }

        public void renovarBolsa(){
            if(this.getMatric() & this.getBolsa() > 0){
                this.setBolsaRenovada(true);
                System.out.println("Renovando bolsa! ");
            }
        }

        @Override
        public void pagarMensalidade(){
            if(this.getMatric() & this.isBolsaRenovada()){
                
                float novaMatricula = (this.getBolsa()/100) * this.getMensalidade();
                System.out.println("Você que é bolsista deverá pagar de matricula: " + novaMatricula);
                System.out.println("Processando ...");
                System.out.println("Matricula paga! ");
            }
        }

        
    
}

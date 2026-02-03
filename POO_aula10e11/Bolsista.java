package POO_aula10e11;

public class Bolsista extends Aluno{
        private float bolsa;
        private boolean bolsaRenovada;

        //Metodos especias:
        
        public float getBolsa() {
            return bolsa;
        }

        public void setBolsa(int b) {
            this.bolsa = b;
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
                
                System.out.println("Você que é bolsista deverá pagar de matricula: " + (this.mensalidade - (this.mensalidade * (this.bolsa/100))));
                System.out.println("Processando ...");
                System.out.println("Matricula paga! ");
            }
        }

        
    
}

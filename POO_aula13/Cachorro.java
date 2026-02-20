package POO_aula13;

public class Cachorro extends Lobo {
        public void emitirSom(){
            System.out.println("Au Au Au");
        }

        public void reagir(String frase){
            if(frase.equals("Oi totozinho, fofinho demais") || frase == "Ola"){
                System.out.println("Abanar rabo e ficar feliz :)");
            }else{
                System.out.println("Rosnar e rasgar a carne");
            }
        }

        public void reagir(int hora, int min){
            if(hora < 12){
                System.out.println("Abanar ");
            }else if(hora >=18){
                System.out.println("Ignorar");
            }else{
                System.out.println("Abanar e latir");
            }
        }

        
        public void reagir(boolean dono){

            if(dono){
                System.out.println("Te amo dono");
                this.emitirSom();
            }else{
                System.out.println("Morra! invasor");
            }
        }

        public void reagir(int idade, float peso){
            if(idade < 5){
                if(peso < 10){
                    System.out.println("Abanar");
                }else{
                    System.out.println("Latir");
                }
            }else{
                if(peso > 10){
                    System.out.println("Rosnar");
                }else{
                    System.out.println("Ignorar");
                }
            }
        }
}

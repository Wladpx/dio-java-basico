public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);
        
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume para: " + volume);
    }

    public void ligar(){
        ligada= true;
    }
    public void desligar(){
        ligada= false;
    }


}
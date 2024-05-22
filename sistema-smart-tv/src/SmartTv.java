public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVol(){
        volume++;
        System.out.println("Aumentando Volume para: "+volume);
    }

    public void diminuirVol(){
        volume--;
        System.out.println("Diminuindo Volume para: "+volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirrCanal(){
        canal--;
    }


}
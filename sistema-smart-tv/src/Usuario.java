public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVol();
        smartTv.diminuirVol();
        smartTv.aumentarVol();

        smartTv.mudarCanal(5);

        System.out.println(smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);

        smartTv.diminuirrCanal();
        System.out.println(smartTv.canal);

        System.out.println(smartTv.volume);

        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);
    
        smartTv.ligar();
        System.out.println("TV Ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? "+smartTv.ligada);
    
    
    }
}

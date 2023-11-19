public class CursoJava {
    public static void main(String[] args)
    {
        Carro c1=new Carro("Uno");
        CarroCombate cc1=new CarroCombate("Leopard", 100,30);
        CarroCombate cc2=new CarroCombate("Pantera",80,45);

        c1.setLigado(true);
        cc1.setLigado(true);
        cc2.setLigado(true);
        c1.info();
        cc1.info();
        cc2.info();
        cc2.atirar();
        cc2.atirar();
        cc2.atirar();
        cc2.atirar();
        cc2.info();



    }
}

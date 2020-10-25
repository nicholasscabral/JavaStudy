public class main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        Cachorro cachorro = new Cachorro();

        // teste classe peixe
        peixe.setNome("pirarucu");
        peixe.setPeso(12.32);
        peixe.setTipoHabitat("agua doce");
        System.out.println(peixe);

        // teste classe cachorro
        cachorro.setNome("chico");
        cachorro.setPeso(10.00);
        cachorro.setRaca("shitzu");
        System.out.println(cachorro);
    }
}

public class main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        Cachorro cachorro = new Cachorro();

        peixe.setNome("nnnn");
        peixe.setPeso(12.32);
        peixe.setTipoHabitat("agua doce");

        cachorro.setNome("chico");
        cachorro.setPeso(10.00);
        cachorro.setRaca("shitzu");

        System.out.println(peixe);
        System.out.println(cachorro);
    }
}

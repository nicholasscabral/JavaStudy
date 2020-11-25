import java.util.ArrayList;

public class Supermercado {
    public static void main(String[] args) {
        ArrayList<Shampoo> ListaShampoo = new ArrayList<>();
        ArrayList<Biscoito> ListaBiscoito = new ArrayList<>();
        ArrayList<Leite> ListaLeite = new ArrayList<>();

        Shampoo dove = new Shampoo();
        dove.setNome("dove");
        dove.setPreco(8);
        dove.setIrritabilidade(20);

        Shampoo pantene = new Shampoo();
        pantene.setNome("pantene");
        pantene.setPreco(9);
        pantene.setIrritabilidade(40);

        ListaShampoo.add(dove);
        ListaShampoo.add(pantene);

        ///////////////////////////

        Biscoito amori = new Biscoito();
        amori.setNome("amori");
        amori.setPreco(2);
        amori.setComponentesCancer(10);

        Biscoito oreo = new Biscoito();
        oreo.setNome("oreo");
        oreo.setPreco(3);
        oreo.setComponentesCancer(30);

        ListaBiscoito.add(amori);
        ListaBiscoito.add(oreo);

        ////////////////////////////

        Leite jaguaribe = new Leite();
        jaguaribe.setNome("jaguaribe");
        jaguaribe.setPreco(3);
        jaguaribe.setValidade(30);

        Leite itambe = new Leite();
        itambe.setNome("itambe");
        itambe.setPreco(4);
        itambe.setValidade(40);

        ListaLeite.add(jaguaribe);
        ListaLeite.add(itambe);

        ///////////////////////////////

        System.out.println("Biscoistos: " + ListaBiscoito);
        System.out.println("Leites: " + ListaLeite);
        System.out.println("Shampoos: " + ListaShampoo);

    }
}

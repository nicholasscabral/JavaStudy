public class Personagem {
    int vida, xp, nivel;
    double altura, mana, velocidade, stamina;
    String raca, nome, classe, genero;

    public void atacar() {
        System.out.println("tirou " + dano(100.54, 500.89) + " de dano");
    }

    public double dano(double danoMinimo, double danoMaximo) {
        double dano = danoMaximo * Math.random();
        while(dano<danoMinimo){
            dano = danoMaximo * Math.random();
        }
        return dano;
    }

    public void correr(){


    }

    public void andar(){


    }

    @Override
    public String toString() {
        return "Personagem: " +
                "vida=" + vida +
                ", altura=" + altura +
                ", mana=" + mana +
                ", velocidade=" + velocidade +
                ", stamina=" + stamina +
                ", raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", xp=" + xp +
                ", genero='" + genero + '\'' +
                ", nivel=" + nivel;
    }


}

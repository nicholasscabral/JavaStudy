public class jogo {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.atacar();
        personagem.velocidade = 12.5;
        personagem.stamina = 78.96;
        personagem.mana = 102.65;
        personagem.raca = "Humana";
        personagem.classe = "Mago";
        personagem.altura = 1.89;
        personagem.nome = "Kratos";
        personagem.genero = "Masculino";
        personagem.nivel = 1;
        personagem.vida = 100;
        personagem.xp = 0;
        System.out.println(personagem);
    }
}

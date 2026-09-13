public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Luna", "Maga", 3, 100, 0);
        Personagem p2 = new Personagem("Kael", "Guerreiro", 2, 100, 1);
        Personagem p3 = new Personagem("Nina", "Arqueira", 1, 90, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        p1.atacar();
        p2.receberDano(35);

        p2.recuperarVida(15);

        p1.registrarVitoria();

        p1.subirNivel();

        p3.setTipo("Caçadora");
        System.out.println();

     
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
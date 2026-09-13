public class Personagem {

    private String nome;
    private String tipo;
    private int nivel;
    private int vida;
    private int vitorias;

    
    public Personagem(String nome, String tipo, int nivel, int vida, int vitorias) {
        this.nome = nome;
        this.tipo = tipo;
        setNivel(nivel);
        setVida(vida);
        setVitorias(vitorias);
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        if (vitorias >= 0) {
            this.vitorias = vitorias;
        }
    }

    
    public void atacar() {
        System.out.println(nome + " realizou um ataque!");
    }

    public void receberDano(int dano) {
        vida = vida - dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void recuperarVida(int pontos) {
        vida = vida + pontos;
        if (vida > 100) {
            vida = 100;
        }
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nome + " subiu de nível!");
    }

    
    @Override
    public String toString() {
        return "Personagem: " + nome 
             + " | Tipo: " + tipo 
             + " | Nível: " + nivel 
             + " | Vida: " + vida 
             + " | Vitórias: " + vitorias;
    }
}
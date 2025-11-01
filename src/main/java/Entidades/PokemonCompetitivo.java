package Entidades;

/**
 *
 * @author Usuario
 */
public class PokemonCompetitivo {
    public int Ataque;
    public int AtaqueEsp;
    public int Defensa;
    public int DefensaEsp;
    public int Velocidad;
    public int Habilidad;

    public PokemonCompetitivo(int Ataque, int AtaqueEsp, int Defensa, int DefensaEsp, int Velocidad, int Habilidad) {
        this.Ataque = Ataque;
        this.AtaqueEsp = AtaqueEsp;
        this.Defensa = Defensa;
        this.DefensaEsp = DefensaEsp;
        this.Velocidad = Velocidad;
        this.Habilidad = Habilidad;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getAtaqueEsp() {
        return AtaqueEsp;
    }

    public void setAtaqueEsp(int AtaqueEsp) {
        this.AtaqueEsp = AtaqueEsp;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getDefensaEsp() {
        return DefensaEsp;
    }

    public void setDefensaEsp(int DefensaEsp) {
        this.DefensaEsp = DefensaEsp;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(int Habilidad) {
        this.Habilidad = Habilidad;
    }

    @Override
    public String toString() {
        return "PokemonCompetitivo{" + "Ataque=" + Ataque + ", AtaqueEsp=" + AtaqueEsp + ", Defensa=" + Defensa + ", DefensaEsp=" + DefensaEsp + ", Velocidad=" + Velocidad + ", Habilidad=" + Habilidad + '}';
    }
}

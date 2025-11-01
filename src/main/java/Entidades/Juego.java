package Entidades;

/**
 *
 * @author Usuario
 */
public class Juego {
    public String Nombre;
    public String Consola;
    public String Region;
    public int PokesDisp;

    public Juego(String Nombre, String Consola, String Region, int PokesDisp) {
        this.Nombre = Nombre;
        this.Consola = Consola;
        this.Region = Region;
        this.PokesDisp = PokesDisp;
    }   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getConsola() {
        return Consola;
    }

    public void setConsola(String Consola) {
        this.Consola = Consola;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getPokesDisp() {
        return PokesDisp;
    }

    public void setPokesDisp(int PokesDisp) {
        this.PokesDisp = PokesDisp;
    }

    @Override
    public String toString() {
        return "Juego{" + "Nombre=" + Nombre + ", Consola=" + Consola + ", Region=" + Region + ", PokesDisp=" + PokesDisp + '}';
    }
}

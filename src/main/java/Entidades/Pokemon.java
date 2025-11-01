package Entidades;

/**
 *
 * @author Usuario
 */
public class Pokemon {
    public String Nombre;
    public int NumeroDex;
    public String TipoMain;
    public String TipoSec;
    public String Region;
    public String Descripcion;
    public String Debilidades;
    public String Handicap;
    public String Megaevo;

    public Pokemon(String Nombre, int NumeroDex, String TipoMain, String TipoSec, String Region, String Descripcion, String Debilidades, String Handicap) {
        this.Nombre = Nombre;
        this.NumeroDex = NumeroDex;
        this.TipoMain = TipoMain;
        this.TipoSec = TipoSec;
        this.Region = Region;
        this.Descripcion = Descripcion;
        this.Debilidades = Debilidades;
        this.Handicap = Handicap;
    }

    public Pokemon(String Nombre, int NumeroDex, String TipoMain, String TipoSec, String Region, String Descripcion, String Debilidades) {
        this.Nombre = Nombre;
        this.NumeroDex = NumeroDex;
        this.TipoMain = TipoMain;
        this.TipoSec = TipoSec;
        this.Region = Region;
        this.Descripcion = Descripcion;
        this.Debilidades = Debilidades;
    }

    public Pokemon(String Nombre, String TipoMain, String TipoSec, String Region, String Descripcion, String Debilidades, String Handicap, String Megaevo) {
        this.Nombre = Nombre;
        this.TipoMain = TipoMain;
        this.TipoSec = TipoSec;
        this.Region = Region;
        this.Descripcion = Descripcion;
        this.Debilidades = Debilidades;
        this.Handicap = Handicap;
        this.Megaevo = Megaevo;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDex() {
        return NumeroDex;
    }

    public void setNumeroDex(int NumeroDex) {
        this.NumeroDex = NumeroDex;
    }

    public String getTipoMain() {
        return TipoMain;
    }

    public void setTipoMain(String TipoMain) {
        this.TipoMain = TipoMain;
    }

    public String getTipoSec() {
        return TipoSec;
    }

    public void setTipoSec(String TipoSec) {
        this.TipoSec = TipoSec;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDebilidades() {
        return Debilidades;
    }

    public void setDebilidades(String Debilidades) {
        this.Debilidades = Debilidades;
    }

    public String getHandicap() {
        return Handicap;
    }

    public void setHandicap(String Handicap) {
        this.Handicap = Handicap;
    }

    public String getMegaevo() {
        return Megaevo;
    }

    public void setMegaevo(String Megaevo) {
        this.Megaevo = Megaevo;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Nombre=" + Nombre + ", NumeroDex=" + NumeroDex + ", TipoMain=" + TipoMain + ", TipoSec=" + TipoSec + ", Region=" + Region + ", Descripcion=" + Descripcion + ", Debilidades=" + Debilidades + ", Handicap=" + Handicap + ", Megaevo=" + Megaevo + '}';
    }
}

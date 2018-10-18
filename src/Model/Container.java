package Model;
public class Container {



    private String Codigo ;
    private String Nombre;
    private String Peso;
    private String Altura;
    private String Color;
    private String FSalidaCont;
    private String FInspeccFisica;
    private String FrevisionLic;
    private String Fimportacion;

    public Container(String Codigo, String Nombre, String Peso, String Altura, String Color, String FSalidaCont, String FInspeccFisica, String FrevisionLic, String Fimportacion) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Color = Color;
        this.FSalidaCont = FSalidaCont;
        this.FInspeccFisica = FInspeccFisica;
        this.FrevisionLic = FrevisionLic;
        this.Fimportacion = Fimportacion;
    }

    public String getFSalidaCont() {
        return FSalidaCont;
    }

    public void setFSalidaCont(String FSalidaCont) {
        this.FSalidaCont = FSalidaCont;
    }

    public String getFInspeccFisica() {
        return FInspeccFisica;
    }

    public void setFInspeccFisica(String FInspeccFisica) {
        this.FInspeccFisica = FInspeccFisica;
    }

    public String getFrevisionLic() {
        return FrevisionLic;
    }

    public void setFrevisionLic(String FrevisionLic) {
        this.FrevisionLic = FrevisionLic;
    }

    public String getFimportacion() {
        return Fimportacion;
    }

    public void setFimportacion(String Fimportacion) {
        this.Fimportacion = Fimportacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}

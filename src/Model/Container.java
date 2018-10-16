package Model;
public class Container {
    private String Codigo;
    private String Nombre;
    private String Peso;
    private String Altura;
    private String Color;

    public Container(String Codigo, String Nombre, String Peso, String Altura, String Color) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Color = Color;
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

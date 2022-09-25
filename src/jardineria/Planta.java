package jardineria;

public class Planta {

    public int id;
    public String nombre;
    public String cuidados;
    public String tipoMata;
    public int cantidad;
    public double precio;

    public Planta(String nombre, String cuidados, String tipoMata, int cantidad, double precio) {
        this.nombre = nombre;
        this.cuidados = cuidados;
        this.tipoMata = tipoMata;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public void setTipoMata(String tipoMata) {
        this.tipoMata = tipoMata;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuidados() {
        return cuidados;
    }

    public String getTipoMata() {
        return tipoMata;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}

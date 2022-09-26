package jardineria;

public class Accesorios {

    public int id;
    public String nombre;
    public String descripcion;
    public String utilidad;
    public int cantidad;
    public double precio;

    public Accesorios(String nombre, String descripcion, String utilidad, int cantidad, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.utilidad = utilidad;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre de la Mata: " + nombre + "\nDescripcion: " + descripcion + "\nUtilidad: " + utilidad + "\nCantidad: " + cantidad + "\nPrecio por Unidad: " + precio ;
    }
}

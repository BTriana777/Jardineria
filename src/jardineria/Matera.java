package jardineria;

public class Matera {

    public int id;
    public String nombre;
    public String material;
    public String tamano;
    public int cantidad;
    public double precio;

    public Matera(String nombre, String material, String tamano, int cantidad, double precio) {
        this.nombre = nombre;
        this.material = material;
        this.tamano = tamano;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
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

    public String getMaterial() {
        return material;
    }

    public String getTamano() {
        return tamano;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

}

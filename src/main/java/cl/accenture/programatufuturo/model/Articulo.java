package cl.accenture.programatufuturo.model;

public class Articulo {

    private int id, precio, stock;
    private String nombre;

    public Articulo(int id, int precio, int stock, String nombre) {
        this.id = id;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o){

    }
}

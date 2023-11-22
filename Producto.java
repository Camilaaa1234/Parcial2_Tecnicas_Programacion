import java.util.Locale;

public class Producto {
    public String nombre;
    public String descripcion;
    public double precio;
 
  public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("COLOMBIA"));

        String precioFormateado = formatoColombiano.format(this.precio);
        return precioFormateado;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + getPrecio());
    }

    

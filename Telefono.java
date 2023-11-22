public class Telefono extends Producto {
    public String marca;
    public boolean nuevo;
    public String color;
    public double tamano;

    public Telefono(String nombre, double precio, int cantidadInventario, String marca, boolean nuevo, String color, double tamano) {
        this.marca = marca;
        this.nuevo = nuevo;
        this.color = color;
        this.tamano = tamano;
    }

        public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Marca: " + marca);
        System.out.println("Inventario: " + nuevo);
        System.out.println("Inventario: " + antiguo);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamano);
        if (nuevo){
            System.out.println("Categoria: Nuevo--Antiguo");
        } else 
           }

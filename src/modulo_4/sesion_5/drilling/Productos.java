package modulo_4.sesion_5.drilling;

public class Productos {
    private String nombre ;
    private Integer valor;
    private String descripcion;

    
    // arreglos para listado de productos
    String[] nombre = new Strin[7] ;
    Integer[] valor = new Integer[7];
    String[] descripcion = new String[7];

    //inicializacion de listado de productos proporcionados
    nombre[0] = "chocolate";
    nombre[1] = "leche";
    nombre[2] = "arroz";
    valor[0] = 500;
    valor[1] = 800;
    valor[2] = 900;
    descripcion[0] = "Chocolate amargo, 500 gr.";
    descripcion[1] = "Leche entera, 1 litro.";
    descripcion[2] = "Arroz granado 2, 1 kilo";

    public Productos() {
    }

    public Productos(String nombre, int valor, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }


    
    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

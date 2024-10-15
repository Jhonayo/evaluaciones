package modulo_4.sesion_4.drilling;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido = false;
    private int velocidadActual = 0;

    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }
    //Se instancia mensajes para usar el menu de tiempo
    Mensajes mensaje = new Mensajes();

    // Metodo para encender el auto
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Se esta encendiendo el auto...");
            mensaje.menuTimeResponse();
            System.out.println("Se ha encendido su auto.\n");
        } else {
            System.out.println("No se ha podido realizar la acción; su auto ya se encuentra encendido. \n");
        }
    }

    // Metodo para apagar el auto
    public void apagar() {
        if (encendido && velocidadActual !=0) {
            System.out.printf("Su auto se encuentra en movimiento a una velocidad de %d km/h... \ndeteniendo el vehiculo\n", velocidadActual);
            mensaje.menuTimeResponse();
            velocidadActual = 0;
            System.out.printf("Su velocidad actual es %d km/h...\n apagando el auto\n", velocidadActual);
            encendido = false;
            System.out.println("El auto ha sido apagado.");
        } else if (encendido && velocidadActual == 0) {
            System.out.println("Apagando el auto...");
            encendido = false;
            mensaje.menuTimeResponse();
            System.out.println("El auto ha sido apagado.");
        }else {
            System.out.println("El auto ya está apagado.");
        }
    }

    // Metodo para acelerar el auto
    public void acelerar(int incremento) {
        if (encendido) {
            if (velocidadActual + incremento <= velocidadMaxima) {
                velocidadActual += incremento;
                System.out.println("El auto está acelerando a " + velocidadActual + " km/h.");
            } else {
                System.out.println("No se puede acelerar más allá de la velocidad máxima (" + velocidadMaxima + " km/h).");
            }
        } else {
            System.out.println("No se puede acelerar, el auto está apagado.");
        }
    }

    // Mostrar la información del auto
    public void mostrarInformacion() {
        System.out.println("Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", encendido=" + encendido +
                ", velocidadActual=" + velocidadActual +
                '}');
    }

    public boolean isEncendido() {
        return encendido;
    }
}


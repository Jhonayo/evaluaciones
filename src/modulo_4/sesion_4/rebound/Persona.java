package modulo_4.sesion_4.rebound;

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private double imc;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void calculoImc (){
        System.out.printf("%s :",nombre);
        System.out.printf("\nCalculando su IMC ...");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        imc = peso/ (altura * altura);
        System.out.printf("\nSu indice de masa muscular es: %.2f\n", imc);
        categoria(imc);
        calculoEdad(edad);
    }

    public void categoria(double imc){
        if(imc < 18.5){
            System.out.println("Usted se encuentra con bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Usted se encuentra con peso normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Usted se encuentra sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Usted se encuentra con obesidad grado I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Usted se encuentra con obesidad grado II");
        }else {
            System.out.println("Usted se encuentra con obesidad grado III");
        }
    }

    public void calculoEdad(int edad){
        if(edad >=18){
            System.out.printf("\nSu edad es: %d\n", edad);
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.printf("\nSu edad es: %d\n", edad);
            System.out.println("Usted es menor de edad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

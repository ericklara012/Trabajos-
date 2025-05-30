package U1_T1_05_IndiceMasa;

public class Persona {
    private String nombre;
    private double altura;
    private double peso;


    public double calcularIMC() {
        return peso / (altura * altura);
    }


    public String clasificarIMC() {
        double imc = calcularIMC();
        if (imc >= 30) {
            return "Obesidad";
        } else if (imc >= 25) {
            return "Sobrepeso";
        } else if (imc >= 18.5) {
            return "Normal";
        } else {
            return "Bajo peso";
        }
    }


    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

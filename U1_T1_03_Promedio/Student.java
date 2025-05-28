
package U1_T1_03_Promedio;

public class Student {

    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        return this.notas[i];
    }

    public void setNota(int i, double valor) {
        this.notas[i] = valor;
    }


    public double calcularPromedio() {
        double promedio = 0;
        for (int e = 0; e < 5; e++) {
            promedio += notas[e];
        }
        return promedio / 5;
    }

    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }
}



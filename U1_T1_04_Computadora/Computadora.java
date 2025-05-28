package U1_T1_04_Computadora;

public class Computadora {

    private String marca;
    private String modelo;
    private boolean encendida;

    public void encender() {
        if (!encendida == true) {
            System.out.println("Encendiendo");
        }
    }

    public void apagar() {
        if (encendida == false) {
            System.out.println("Apagando");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


package U2_T2_09_Vehiculo_Garage;

public class Coche extends Vehiculo {
    public int numPuertas;

    public Coche(String placa, String marca, int numPuertas) {
        super(placa, marca);
        this.numPuertas = numPuertas;
    }
}
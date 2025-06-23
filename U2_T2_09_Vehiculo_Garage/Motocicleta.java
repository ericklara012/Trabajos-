package U2_T2_09_Vehiculo_Garage;

public class Motocicleta extends Vehiculo {
    public boolean tieneCaja;

    public Motocicleta(String placa, String marca, boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = tieneCaja;
    }
}
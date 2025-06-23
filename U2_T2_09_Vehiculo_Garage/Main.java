package U2_T2_09_Vehiculo_Garage;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);

        Coche coche1 = new Coche("2023FR", "Toyota", 4);
        Coche coche2 = new Coche("2024FR", "Nissan", 5);
        Motocicleta motocicleta1 = new Motocicleta("2025FR", "Yamaha", true);
        Motocicleta motocicleta2 = new Motocicleta("2026FR", "Pulsar", false);

        garage.estacionar(coche1);
        garage.estacionar(coche2);
        garage.estacionar(motocicleta1);
        garage.estacionar(motocicleta2);

        System.out.println("Vehículos en el garage: " + garage.contarVehiculos());

        garage.retirar("2024FR");
        System.out.println("Vehículos en el garage después de retirar: " + garage.contarVehiculos());
    }
}
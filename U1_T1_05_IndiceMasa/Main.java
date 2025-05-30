package U1_T1_05_IndiceMasa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Dame tu nombre");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Dame tu altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Dame tu peso"));


        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setAltura(altura);
        persona.setPeso(peso);

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();


        System.out.print(persona.getNombre());
        System.out.print("Tu indice ");
        System.out.print(imc);
        System.out.println("Estas en " + clasificacion);


    }
}


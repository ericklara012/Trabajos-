package U1_T1_06_ContraseñaSegura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usuario = new UsuarioSeguro();


        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        usuario.setNombreUsuario(nombre);

        String pass = JOptionPane.showInputDialog("Ingrese la contraseña:");
        usuario.setPassword(pass);


            if (usuario.autenticar(pass)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        String validar = JOptionPane.showInputDialog("Ingrese la contraseña para autenticar:");
        if (usuario.autenticar(validar)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Contraseña no coincide");
        }
        }
    }


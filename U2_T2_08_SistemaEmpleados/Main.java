package U2_T2_08_SistemaEmpleados;


public class Main {
    public static void main(String[] args) {


        EmpleadoTiempoCompleto Empleado1 = new EmpleadoTiempoCompleto("20243ds" , "Erick",100, "0");
        System.out.println(Empleado1.calcularSalario());

        EmpleadoPorHoras Empleado2 = new EmpleadoPorHoras("20242ds","Lara",100,8);
        System.out.println(Empleado2.calcularSalario());



        }
    }

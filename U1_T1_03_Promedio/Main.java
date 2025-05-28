package U1_T1_03_Promedio;
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setNombre("Erick");
        student2.setNombre("David");
        student3.setNombre("Itzel");
        student4.setNombre("Perla");
        student5.setNombre("Valeria");

        for (int e = 0; e < 5; e++) {
            student1.setNota(e, 70 + e);
        }
        for (int e = 0; e < 5; e++) {
            student2.setNota(e, 70 + e);
        }
        for (int e = 0; e < 5; e++) {
            student3.setNota(e, 70 + e);
        }
        for (int e = 0; e < 5; e++) {
            student4.setNota(e, 70 + e);
        }
        for (int e = 0; e < 5; e++) {
            student5.setNota(e, 70 + e);
        }
        System.out.println(student1.getNombre() + ": Promedio " + student1.calcularPromedio() + ", Aprobado: " + student1.aprobado());
        System.out.println(student2.getNombre() + ": Promedio " + student2.calcularPromedio() + ", Aprobado: " + student2.aprobado());
        System.out.println(student3.getNombre() + ": Promedio " + student3.calcularPromedio() + ", Aprobado: " + student3.aprobado());
        System.out.println(student4.getNombre() + ": Promedio " + student4.calcularPromedio() + ", Aprobado: " + student4.aprobado());
        System.out.println(student5.getNombre() + ": Promedio " + student5.calcularPromedio() + ", Aprobado: " + student5.aprobado());

    }
}
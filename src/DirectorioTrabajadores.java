import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTrabajadores {
    private Map<String, Double> trabajadores = new HashMap<>();

    public void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
        System.out.println("Trabajador agregado/actualizado.");
    }

    public void mostrarTrabajadores() {
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores.");
        } else {
            System.out.println("Trabajadores y salarios:");
            for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }
        }
    }

    public void actualizarSalario(String nombre, double salario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, salario);
            System.out.println("Salario actualizado.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    public void salarioPromedio() {
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores.");
        } else {
            double suma = 0;
            for (double salario : trabajadores.values()) {
                suma += salario;
            }
            System.out.printf("Salario promedio: $%.2f\n", suma / trabajadores.size());
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        DirectorioTrabajadores directorio = new DirectorioTrabajadores();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar trabajador\n2. Mostrar trabajadores\n3. Actualizar salario\n4. Salario promedio\n0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del trabajador: ");
                    String nombre = sc.nextLine();
                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();
                    directorio.agregarTrabajador(nombre, salario);
                    break;
                case 2:
                    directorio.mostrarTrabajadores();
                    break;
                case 3:
                    System.out.print("Nombre del trabajador: ");
                    String nombreAct = sc.nextLine();
                    System.out.print("Nuevo salario: ");
                    double salarioAct = sc.nextDouble();
                    directorio.actualizarSalario(nombreAct, salarioAct);
                    break;
                case 4:
                    directorio.salarioPromedio();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

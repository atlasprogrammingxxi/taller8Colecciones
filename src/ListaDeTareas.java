import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTareas {
    private ArrayList<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 1 && indice <= tareas.size()) {
            tareas.remove(indice - 1);
            System.out.println("Tarea completada y eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarNumeroTareas() {
        System.out.println("Tareas pendientes: " + tareas.size());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar tarea\n2. Mostrar tareas\n3. Completar tarea\n4. Mostrar número de tareas\n0. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String tarea = sc.nextLine();
                    lista.agregarTarea(tarea);
                    break;
                case 2:
                    lista.mostrarTareas();
                    break;
                case 3:
                    lista.mostrarTareas();
                    System.out.print("Ingrese el número de tarea a completar: ");
                    int num = sc.nextInt();
                    lista.completarTarea(num);
                    break;
                case 4:
                    lista.mostrarNumeroTareas();
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


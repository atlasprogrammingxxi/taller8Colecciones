import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Biblioteca biblioteca = new Biblioteca();
        DirectorioTrabajadores directorio = new DirectorioTrabajadores();
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Lista de Tareas");
            System.out.println("2. Biblioteca");
            System.out.println("3. Directorio de Trabajadores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcionPrincipal) {
                case 1:
                    menuTareas(listaDeTareas, sc);
                    break;
                case 2:
                    menuBiblioteca(biblioteca, sc);
                    break;
                case 3:
                    menuDirectorio(directorio, sc);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcionPrincipal != 0);

        sc.close();
    }

    // Submenú para la lista de tareas
    private static void menuTareas(ListaDeTareas lista, Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- Lista de Tareas ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Mostrar número de tareas");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

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
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // Submenú para la biblioteca
    private static void menuBiblioteca(Biblioteca biblioteca, Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Verificar libro");
            System.out.println("4. Mostrar número de libros");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String libro = sc.nextLine();
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    System.out.print("Ingrese el título a verificar: ");
                    String buscar = sc.nextLine();
                    biblioteca.verificarLibro(buscar);
                    break;
                case 4:
                    biblioteca.mostrarNumeroLibros();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // Submenú para el directorio de trabajadores
    private static void menuDirectorio(DirectorioTrabajadores directorio, Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- Directorio de Trabajadores ---");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Mostrar trabajadores");
            System.out.println("3. Actualizar salario");
            System.out.println("4. Salario promedio");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
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
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}

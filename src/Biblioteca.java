import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Biblioteca {
    private Set<String> libros = new HashSet<>();

    public void agregarLibro(String libro) {
        if (libros.add(libro)) {
            System.out.println("Libro agregado.");
        } else {
            System.out.println("El libro ya existe.");
        }
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (String libro : libros) {
                System.out.println("- " + libro);
            }
        }
    }

    public void verificarLibro(String libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro está disponible.");
        } else {
            System.out.println("El libro NO está disponible.");
        }
    }

    public void mostrarNumeroLibros() {
        System.out.println("Total de libros únicos: " + libros.size());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar libro\n2. Mostrar libros\n3. Verificar libro\n4. Mostrar número de libros\n0. Salir");
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
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

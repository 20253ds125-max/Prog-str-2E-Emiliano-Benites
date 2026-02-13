import java.util.Scanner;

class Persona {
    int id;
    String nombre;
    boolean activa;

    Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.activa = true;
    }
}

public class Main {
    static Persona[] personas = new Persona[20];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> alta();
                case 2 -> buscarActivaPorId();
                case 3 -> bajaLogicaPorId();
                case 4 -> listarActivas();
                case 5 -> actualizarNombreActivaPorId();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }

            System.out.println(); // salto de línea
        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("===== MENÚ =====");
        System.out.println("1) Alta");
        System.out.println("2) Buscar por ID");
        System.out.println("3) Baja lógica por ID");
        System.out.println("4) Listar activas");
        System.out.println("5) Actualizar nombre por ID ");
        System.out.println("0) Salir");
    }

    static void alta() {
        if (estaLleno()) {
            System.out.println("No hay espacio: el arreglo de personas está lleno (20).");
            return;
        }

        int id = leerEnteroPositivo("ID (>0): ");
        if (existeId(id)) {
            System.out.println("No se puede dar de alta: el ID ya existe.");
            return;
        }

        String nombre = leerNombreNoVacio("Nombre (no vacío): ");

        int idx = primerLibre();
        personas[idx] = new Persona(id, nombre);
        System.out.println("Alta exitosa  (ID=" + id + ", Nombre=" + nombre + ")");
    }

    static void buscarActivaPorId() {
        int id = leerEnteroPositivo("ID a buscar: ");
        Persona p = obtenerActivaPorId(id);

        if (p == null) {
            System.out.println("No encontrada o inactiva.");
        } else {
            System.out.println("Encontrada  -> ID=" + p.id + ", Nombre=" + p.nombre);
        }
    }

    static void bajaLogicaPorId() {
        int id = leerEnteroPositivo("ID a dar de baja: ");
        Persona p = obtenerPorId(id);

        if (p == null) {
            System.out.println("No encontrada.");
            return;
        }
        if (!p.activa) {
            System.out.println("La persona ya estaba inactiva.");
            return;
        }

        p.activa = false;
        System.out.println("Baja lógica exitosa  (ID=" + id + ")");
    }

    static void listarActivas() {
        boolean hay = false;
        System.out.println("=== Personas activas ===");
        for (Persona p : personas) {
            if (p != null && p.activa) {
                System.out.println("ID=" + p.id + " | Nombre=" + p.nombre);
                hay = true;
            }
        }
        if (!hay) System.out.println("No hay personas activas.");
    }

    static void actualizarNombreActivaPorId() {
        int id = leerEnteroPositivo("ID a actualizar: ");
        Persona p = obtenerActivaPorId(id);

        if (p == null) {
            System.out.println("No encontrada o inactiva.");
            return;
        }

        String nuevoNombre = leerNombreNoVacio("Nuevo nombre (no vacío): ");
        p.nombre = nuevoNombre;
        System.out.println("Actualización exitosa  (ID=" + id + ", NuevoNombre=" + nuevoNombre + ")");
    }

    static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido.");
            }
        }
    }

    static int leerEnteroPositivo(String msg) {
        while (true) {
            int n = leerEntero(msg);
            if (n > 0) return n;
            System.out.println("El ID debe ser mayor a 0.");
        }
    }

    static String leerNombreNoVacio(String msg) {
        while (true) {
            System.out.print(msg);
            String nombre = sc.nextLine().trim();
            if (!nombre.isEmpty()) return nombre;
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    static boolean existeId(int id) {
        for (Persona p : personas) {
            if (p != null && p.id == id) return true;
        }
        return false;
    }

    static Persona obtenerPorId(int id) {
        for (Persona p : personas) {
            if (p != null && p.id == id) return p;
        }
        return null;
    }

    static Persona obtenerActivaPorId(int id) {
        for (Persona p : personas) {
            if (p != null && p.id == id && p.activa) return p;
        }
        return null;
    }

    static int primerLibre() {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) return i;
        }
        return -1;
    }

    static boolean estaLleno() {
        return primerLibre() == -1;
    }
}
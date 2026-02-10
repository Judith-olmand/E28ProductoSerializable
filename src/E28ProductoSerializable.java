import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E28ProductoSerializable {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Producto> productos = new ArrayList<>();

        productos.add(new Producto("Televisión", 399.55, 3));
        //USO DE GEMINI
        productos.add(new Producto("Televisión", 399.55, 3));
        productos.add(new Producto("Laptop Pro", 1250.99, 5));
        productos.add(new Producto("Smartphone S24", 899.00, 10));
        productos.add(new Producto("Auriculares Bluetooth", 59.90, 25));
        productos.add(new Producto("Monitor 4K 27\"", 280.50, 7));
        productos.add(new Producto("Teclado Mecánico", 115.00, 15));
        productos.add(new Producto("Ratón Gamer", 45.25, 30));
        productos.add(new Producto("Impresora Láser", 199.95, 4));
        productos.add(new Producto("Disco SSD 1TB", 85.00, 20));
        productos.add(new Producto("Cámara Web HD", 65.40, 12));

        System.out.println("La lista contiene estos productos");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() );
            System.out.println("        Precio: " + producto.getPrecio() + "€" );
            System.out.println("                Cantidad: " + producto.getCantidad() + " unidades");
        }

        System.out.println();
        System.out.println("¿Quiere añadir más?S/N");
        String respuesta = sc.nextLine();


        while (!respuesta.equalsIgnoreCase("N")) {
            System.out.println("Introduce el nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce el precio del producto: ");
            double precio = sc.nextDouble();
            System.out.println("Introduce el cantidad del producto: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            productos.add(new Producto(nombre, precio, cantidad));

            System.out.println();
            System.out.println("¿Quiere añadir más?S/N");
            respuesta = sc.nextLine();
        }


        System.out.println();
        System.out.println("Introduce el nombre del fichero: ");
        String fichero = sc.nextLine();

        CrearFichero.crearFichero(productos,fichero);

        List<Producto> productos2 = new ArrayList<>();
        productos2 = LeerFichero.leerFichero(fichero);

        System.out.println();
        for (Producto p : productos2) {
            System.out.println("Nombre: " + p.getNombre() );
            System.out.println("        Precio: " + p.getPrecio() + "€" );
            System.out.println("                Cantidad: " + p.getCantidad() + " unidades");
        }
    }
}
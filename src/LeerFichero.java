import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerFichero {
    public static List<Producto> leerFichero(String fichero) {
        List<Producto> productos2 = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

            productos2 = (List<Producto>) ois.readObject();

            /*for (Producto p : productos2) {
                System.out.println("Nombre: " + p.getNombre() );
                System.out.println("        Precio: " + p.getPrecio() + "€" );
                System.out.println("                Cantidad: " + p.getCantidad() + " unidades");
            }*/

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }

        return productos2;
    }
}

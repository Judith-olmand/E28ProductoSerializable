import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class CrearFichero {
    public static void crearFichero(List<Producto> producto, String fichero) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(producto);
            System.out.println("Objeto Persona serializado y guardado en persona.ser");

        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " +
                    e.getMessage());
        }
    }
}

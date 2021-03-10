package ficheros;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Clase para gestionar una agenda.
 *  
 *  Esta clase deriva de ArrayList<Contact> y a�ade:
 *  
 *  � Alta de contacto. 
    � Baja de contacto. 
    � Busca un contacto. Devuelve el contacto que coincida con la b�squeda, en caso de no encontrar coincidencia se devuelve un valor nulo.
    � Reduce el tama�o de la agenda. Cambia el n�mero m�ximo de contactos a otro valor inferior a 100, si se diera un valor mayor lanza una excepci�n, si reducimos el tama�o de la agenda a un valor inferior al n�mero de contactos que hay lanza una excepci�n.
    � Exporta a fichero CSV. Lanza una excepci�n si no podemos escribir en el fichero.
    � Importa de fichero CSV. Cada contacto importado llama al m�todo que da de alta. Lanza una excepci�n si no podemos leer del fichero.
El control del tama�o de la agenda se hace sobre esta clase.
Una agenda est� formada por una colecci�n de de contactos, que a su vez son objetos de la clase Contacto. 
 */

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("serial")
public class AddressBook extends ArrayList<Contact> {
  
  public void save(String fileName) throws FileNotFoundException, IOException {
    var file = new ObjectOutputStream(new FileOutputStream(fileName));
    file.writeObject(this);
    file.close();
  }
  
  static public AddressBook load(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
    var file = new ObjectInputStream(new FileInputStream(fileName));
    AddressBook addressBook = (AddressBook) file.readObject();
    file.close();
    return addressBook;
  }
  
  public void saveCSV(String fileName) throws IOException {
    /**
     * 1.Crear el archivo.
     * 2.Crear la cabecera del CSV
     * 3.Leer cada contacto de la agenda y escribirlo
     * 4.Cerrar el archivo
     */
    
    var file = Files.newBufferedWriter(Paths.get(fileName), StandardOpenOption.CREATE);
    
    saveHeadCSV(file);
    
    // Contactos de mi agenda
    for (Contact contact: this) {
      saveContact(contact, file);
    }
    file.close();
  }

  private void saveHeadCSV(BufferedWriter file) throws IOException {
    // Cabecera CSV
    file.write("Nombre,Apellidos,Direcci�n,Email,Tel�fono");
    file.newLine();
  }
  
  private void saveContactCSV (Contact contact, BufferedWriter file) {
    //Guardar nombre (Escapamos comillas)
    file.write("\"" + contact.getName() + "\",");
    file.write("\"" + contact.getSurname() + "\",");
    file.write("\"" + contact.getAddress() + "\",");
    file.write("\"" + contact.getEmail() + "\",");
    file.write("\"" + contact.getPhone() + "\"");
    file.newLine();
  }
  
  
  @Override
  public String toString() {
    AddressBook addressBook = (AddressBook) this.clone();
    String toString = "[\n";
    
    Collections.sort(addressBook);
    for (Contact c: addressBook) {
      toString += "[ " + c.getName() + ", " + c.getSurnames() + ", " + c.getAddress()
               + ", " + c.getEmail() + ", " + c.getPhone() + "],\n";    
    }
    toString += "]";
    return toString;
  }
  
}
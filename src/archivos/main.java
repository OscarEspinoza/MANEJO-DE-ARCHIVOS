
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;

/**
 *
 * @author anon
 */
public class main {
    

public static String ARCHIVO = "C://Users//anon//Documents//datos.data";

public void guardar(Persona persona) { 
try{
FileOutputStream fast = new FileOutputStream(main.ARCHIVO);
ObjectOutputStream oos = new ObjectOutputStream(fast);
oos.writeObject(persona);
oos.close();
}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}
}
public void guardar(){
try{
FileOutputStream fast = new FileOutputStream(main.ARCHIVO);
ObjectOutputStream oos = new ObjectOutputStream(fast);
oos.writeObject(new Persona(1, "Alejandro", 22));
oos.writeObject(new Persona(2, "Roberto", 21));
oos.writeObject(new Persona(3, "Juan", 18));
oos.writeObject(new Persona(4, "Rodrigo", 23));
oos.writeObject(new Persona(5, "Ernesto", 22));
oos.writeObject(new Persona(6, "Maria", 21));
oos.writeObject(new Persona(7, "Oscar", 20));
oos.writeObject(new Persona(8, "Jose", 19));
oos.close();
}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}
}
public void leer(){
Persona resultado = null;
try{
FileInputStream fist = new FileInputStream(main.ARCHIVO);
ObjectInputStream ois = new ObjectInputStream(fist);
while(true){
resultado = (Persona)ois.readObject();
System.out.println(resultado);
}
}catch(EOFException e){
System.out.println("EOF");
}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}catch(ClassNotFoundException e){
e.printStackTrace();
}
}
public static void main(String[] args) {
main ma = new main();
// ma.guardar();
ma.guardar();
ma.leer();
}
}
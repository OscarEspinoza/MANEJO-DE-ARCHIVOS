/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;


import java.io.Serializable;

/**
 *
 * @author anon
 */

public class Persona implements Serializable{
private Integer id;
private String nombre;
private Integer edad;
private static final long serialVersionUID = 1L;
Persona(){}
Persona(Integer id, String nombre, Integer edad){
this.id = id;
this.nombre = nombre;
this.edad = edad;
}
public Integer getId(){
return this.id;
}
public void setId(Integer id){
this.id = id;
}
public String getNombre(){
return this.nombre;
}
public void setNombre(String nombre){
this.nombre = nombre;
}
public Integer getEdad(){
return this.edad;
}
public void setEdad(Integer edad){
this.edad = edad;
}
@Override
public String toString(){
return "ID:"+id+" Nombre:"+nombre+" Edad:"+edad;
}
}
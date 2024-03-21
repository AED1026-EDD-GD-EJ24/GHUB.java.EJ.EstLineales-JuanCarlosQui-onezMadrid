package miPrincipal;

import java.util.Enumeration;

public class DemoTablaDispersion {
    public static void menu(){
        System.out.println("************************");
        System.out.println("      DELIMITADORES     ");
        System.out.println("************************");
        System.out.println();
        //Instanciamos varias personas 
        Persona p1 = new Persona("Pablo",23,"Argentino");
        Persona p2 = new Persona("Juan",25,"Mexicano");
        Persona p3 = new Persona("Pedro",18,"Español");
        //creo la tabla hash
        Hash<String,Persona> tabla = new Hashtable<String,Persona>();

        //Agregamos a las personas tomando su nombre como clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);

        //Acceso a cada uno delos elementos de la tabla por su clave
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        //En este caso regresa un null ya que no hay ningun objeto asociado a la clave rolando
        System.out.println(tabla.get("Rolando"));
        /*
         * Obtengo una enumeracion de las claves existentes en la 
         * tabla se recorre por cada una se accede al alemento asosciad par mostrar "clave-valor"
         */
        
        String aux;
        Enumeration<String> keys = tabla.keys();

        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
        }
    }
}
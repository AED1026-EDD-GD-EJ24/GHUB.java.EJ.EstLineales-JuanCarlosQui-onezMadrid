package miPrincipal;
/*
 * Proposito: crear un ArrayList de objetos Personas
 * Crearemos 1000 personas de forma aleatoria
 * considerando que sus alturas flucturen entre 100 y 200 cm
 * finalmente mostrar por consola toda los objetos personas creados asi como la medio de sus alturas.
 */

 import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
import personas.Persona;

public class DemoArrayListPersonas {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("          ArrayList        ");
        System.out.println("          Personas       ");
        System.out.println("************************");
        System.out.println();

        try{
            List<Persona> lp = new ArrayList<Persona>();
            Random r = new Random();
            Persona temp = null;
            int sumaaltura = 0;
            for(int i = 0; i < 1000; i++){
                lp.add(new Persona(i, "Persona"+i, r.nextInt(bound:100)+100));
            }
            Iterator<Persona> it = lp.iterator();
            while(it.hasNext()){
                temp = it.next();
                System.out.println(temp);
                sumaaltura += temp.getAltura();
            }
            System.out.println("Media de alturas = "+sumaaltura/1000);
        }catch(Exception e){
           e.printStackTrace();
        }












    }
}

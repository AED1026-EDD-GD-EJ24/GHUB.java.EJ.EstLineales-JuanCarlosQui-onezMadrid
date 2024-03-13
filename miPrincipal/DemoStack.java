package miPrincipal;
import java.util.Stack;

public class DemoStack {

    public static void main(String[] args){
        //Crear mi pila con elementos tipo entero
        Stack<Integer> pila = new Stack <Integer>();
        //Apilar elementos
        pila.push(item;2);
        pila.push(item;5);
        pila.push(item;7);
        pila.push(item;10);
        //Consultar la posicion del elemento
        System.out.println("Posicion del elemento buscado 2:"+pila.search(o:2));
        System.out.println("Posicion del elemento buscado 10:"+pila.search(o:10));
        System.out.println("Posicion del elemento buscado 3:"+pila.search(o:3));
        //consultar el elmento de la cima
        System.out.println("El elemento del tope ="+pila.peek());
        //Desapilamos
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek);
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek);
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek);
    }



}
package miPrincipal;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.collection;
import java.util.Vector;
public class HashTable2<T>{
    private HashTable<String, LinkedList<T>> tabla;
    private Vector<String> claves;
    public HashTable2(){
        tabla = new Vector<String, LinkedList<T>>();
        claves = new Vector<String>();

    }
    public void put(String key, T ele){
        LinkedList<T> lst = tabla.get(key);
        if(lst == null){
            lst = new LinkedList<T>();
            tabla.put(key,lst);
            claves.add(key);
        }
        lst.addLast(elm);
    }
    public LinkedList<T> get(String key){
        return tabla.get(key);

    }

    public collection<String> keys(){
        retunrn claves;
    }



}
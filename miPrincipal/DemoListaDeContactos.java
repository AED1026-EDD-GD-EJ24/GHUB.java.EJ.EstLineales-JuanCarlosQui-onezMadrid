package miPrincipal;

public class DemoListaDeContactos throws PosicionIlegalException{
    System.out.println("************************");
    System.out.println("      DELIMITADORES     ");
    System.out.println("************************");
    System.out.println();
    ListaDeContactos lista = new ListaDeContactos();
    //Agregamos algunos contactos
    ldc.agregarContacto("Fernando", "Castro", "C11 No. 12 Culiacan",
     "fernandocastro@gmail.com", "6677160732", "0987654321");
    ldc.agregarContacto("Maria Andrea", "Vargas", "C11 No. 705 Culiacan",
     "Mariv@gmail.com", "6677870732", "0987657861");
    ldc.agregarContacto("Carolina", "Sanchez", "C11 No. 17 Culiacan",
      "CarolSanchezSa@gmail.com", "6677121212", "0987563321");
      ldc.agregarContacto("Federica", "Cardenas", "C11 ,No. 12 Culiacan",
      "FedericaCar@gmail.com", "667767892", "098908921");

    //Mostramos todos los contactos
    System.out.println("Mostrando todos los contactos");
    Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
    System.out.println("--- Listado despues de la agregacion ---");
    for(int i = 0; i < listado.getTamanio(); i++){
        System.out.println("listado.getValor(i)");
    }
    if(ldc.eliminarContacto("Fernando", "Castro")){
        System.out.println("Contacto eliminado");    
    }
    System.out.println("--- Listado despues de la eliminacion ---");
    for(int i = 0; i < listado.getTamanio(); i++){
        System.out.println("listado.getValor(i)");
    }
        
}

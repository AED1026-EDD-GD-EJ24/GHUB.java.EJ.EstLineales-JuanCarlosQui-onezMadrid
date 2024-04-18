package miPrincipal;

public class ListaDeContactos {
    //Atributos
    private Lista<Contacto> contactos;
    //Metodos
    //constructor
    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }
    //metodos
    public Lista mostrarTodosLosContactos(){
    /*
    * Retorna una lista de todos los contactos
    */

        return contactos;
    }
        /*
        * Agrega un contacto a la lista de contactos si todavia no hay
         ningun contacto con los nombes y apellidos dados
        */
    public void agregarContacto(String nombres, String apellidos, String direccion,
     String correo, String telefono, String celular)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);

        if(con == null){//Se puede agregar el contacto
            contactos.agregar(new Contacto(nombres, apellidos, direccion, correo, telefono, celular));
            contactos.agregar(nuevo);
            return true;
        }else{
            System.out.println("Ya existe un contacto con esos nombres y apellidos");
            return false;
        }


     }
     public Contacto buscarContacto(String nombres, String apellidos)throws PosicionIlegalException{
         /*
         * Busca un contacto dados nombres y apellidos
         * @return el contacto si lo encuentra
         * Retorna null si no lo encuentra
         * throws PosicionIlegalException si la lista esta vacia
           */
         for(int i = 0; i < contactos.Tamanio(); i++){
                Contacto con = contactos.getValor(i);
                if(nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())){
                    return con;
                }
     }
        return null;//No lo encontro, devuelve nulo
    }
    /*
     * Elimina un contacto de la lista de contactos dados sus nombres y sus atributos
     * si el usuario existe en al lissta lo elimina y retorna true si se pudo eliminar
     * false si no se pudo eliminar
     */
    public boolean eliminarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con != null){
           // contactos.eliminar(con);
            //return true;
}

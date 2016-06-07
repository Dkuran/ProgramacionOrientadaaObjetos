/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesa;

/**
 *
 * @author Dkuran
 */
public class ClsUsuario {
    
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String usr;
    private String pass;

    public ClsUsuario(){
    
    
    }
    
    
    public ClsUsuario(int id, String cedula, String nombre, String apellido){
    
        this.id = id;
        this.cedula = cedula;
        this.apellido =apellido;
        this.nombre = nombre;
        this.usr = "usr"+id;
        this.pass = cedula;
        
    }
    
    public boolean pass(String pass, String usr){
        if(this.pass.equals(pass) && this.usr.equals(usr)){
            return true;
        }else{
            return false;
        }
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the usr
     */
    public String getUsr() {
        return usr;
    }

    /**
     * @param usr the usr to set
     */
    public void setUsr(String usr) {
        this.usr = usr;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    
}

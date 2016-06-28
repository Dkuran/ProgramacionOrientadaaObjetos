/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Dkuran
 */
public class ClsPersonaje {
    
    private int id;
    private String nombre;
    private double vida;
    private double ataque;
    private double stamina;
    private String imagen;
    
    
    public ClsPersonaje(){
    
    }
    
    public ClsPersonaje(int id, String nombre, double vida, double ataque, double stamina, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.stamina = stamina;
        this.imagen = imagen;
    }
    
    public double ataqueLiviano(){
        return 0.00;
    }
    
    public double ataquePesado(){
        return 0.00;
    }
    
    public double ataqueFinal(){
        return 0.00;
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
     * @return the vida
     */
    public double getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(double vida) {
        this.vida = vida;
    }

    /**
     * @return the ataque
     */
    public double getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the stamina
     */
    public double getStamina() {
        return stamina;
    }

    /**
     * @param stamina the stamina to set
     */
    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    
    
    
    
}

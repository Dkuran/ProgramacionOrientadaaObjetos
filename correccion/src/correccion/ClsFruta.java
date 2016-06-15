/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccion;

/**
 *
 * @author Dkuran
 */
public class ClsFruta {
    
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private double total;
    
    
    public ClsFruta(){
    
    }
    
    public ClsFruta(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
        this.total = 0;
       
    }
    
    public void precioTotal(){
        this.total = this.precio * this.cantidad;
    }
    
    public String imprimir(){
        String texto = "";
        texto = this.nombre+" "+this.cantidad+" "+this.precio+" "+this.total;
        
        
        return texto;
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
}

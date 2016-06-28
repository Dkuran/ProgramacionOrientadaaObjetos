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
public class ClsAgua extends ClsPersonaje{
    
    
    private String mensaje;
    
    public ClsAgua(){
        super();
    }
    
    public ClsAgua(int id, String nombre, double vida, double ataque, double stamina, String imagen){
        super(id, nombre, vida, ataque, stamina, imagen);
    }
    
    @Override
    public double ataqueLiviano(){
        
        this.setMensaje("cañon de agua");
        if(this.getStamina() > 50){
            this.setStamina(this.getStamina() - 50);
            return this.getAtaque() * 0.5;
        }else{
            return 0;
        }
        
    }
    
    @Override
    public double ataquePesado(){
        
        this.setMensaje("hydrobomba");
        if(this.getStamina() > 90){
            this.setStamina(this.getStamina() - 90);
            return this.getAtaque() * 1.35;
        }else{
            return 0;
        }
    }
        
    @Override
    public double ataqueFinal(){
        
        this.setMensaje("dragon de agua");
        if(this.getStamina() > 120){
            this.setStamina(this.getStamina() - 120);
            return this.getAtaque() * 2;
        }else{
            return 0;
        }
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}

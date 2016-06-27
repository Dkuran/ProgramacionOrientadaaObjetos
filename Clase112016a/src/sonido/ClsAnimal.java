/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonido;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
/**
 *
 * @author Dkuran
 */
public class ClsAnimal {
    
    private int id;
    private String nombre;
    private String ubicacion;
    
    
    public ClsAnimal(){
    
    }
    
    public ClsAnimal(int id, String nombre, String ubicacion){
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    
    public void sonido(){
        //Creamos el FileInputStream con la ruta del fichero de audio
        try(FileInputStream fis=new FileInputStream(this.ubicacion)){
            //Creamos el objeto Player
            Player player=new Player(fis);
            //Reproducimos el fichero, una vez lo haga no podremos hacer nada hasta que termine<br /><br />
            player.play();
        }catch (JavaLayerException e1) {
            JOptionPane.showMessageDialog(null, "No es un fichero de audio");
        }catch (IOException ex) {
            System.out.println("error: "+ex);
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}

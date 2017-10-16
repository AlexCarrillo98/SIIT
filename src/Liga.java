
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Carrillo 15/10/17
 */
public class Liga {
    String NOMBRE, NOCONTROL, NIP;
    int SEMESTRE;
    Double PROMEDIO;
    
    public Liga Next;

    
    //Constructor con parámetros
    public Liga(String nombre, String nocontrol, String NIP,
            int semestre, double promedio){
    NOMBRE = nombre;
    NOCONTROL = nocontrol;
    SEMESTRE = semestre;
    PROMEDIO = promedio;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nombre: "+ NOMBRE+
                "\n No. de Control: "+NOCONTROL+
                "\n Semestre: "+SEMESTRE+
                "\n Promedio: "+PROMEDIO);
        System.out.println("Entro");
    }
    
    public String toString(){
        return "Nombre: "+ NOMBRE+
                "\n No. de Control: "+NOCONTROL+
                "\n Semestre: "+SEMESTRE+
                "\n Promedio: "+PROMEDIO;
    }
    
}

    


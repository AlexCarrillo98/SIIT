
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
public class TestLiga {
    public static void main (String[] args){
    Lista algo = new Lista();
    
    algo.insertarUltimo("Alecaño", "16041213", 3, Math.random());
    algo.insertarUltimo("Bernie","16042312", 3, Math.random());
    algo.insertarUltimo("Donaldo","16043212", 2, 76.5);
    algo.imprimir();
        System.out.println("*********************BÚSQUEDA************************\n\n");
        String control = JOptionPane.showInputDialog(null,"NoControl a buscar: ");
        System.out.println("A buscar: "+control);
        if(algo.buscar(control)==null){
            System.out.println(control+ " NOOOO ENCONTRADO");
        }else{
            System.out.println(control+ " ENCONTRADOOOOO\n"+algo.buscar(control));
        }
        
        System.out.println("\n\n******************ELIMINACIÓN************************\n\n");
        if(algo.eliminarNodo(control)==null){
            System.out.println(control+ " NOOOO ENCONTRADO");
        }else{
            System.out.println(control+ " ENCONTRADOOOOO\n");
        }
        algo.imprimir();
    
    
    }
}

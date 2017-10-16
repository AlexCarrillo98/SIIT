
import javax.swing.JOptionPane;




/**
 *
 * @author Alejandro Carrillo 15/10/17
 */
public class Lista {
    //Referencia al primer enlace en la lista
    
    public Liga primerLiga;
    public Liga ultimaLiga;
    
    Lista(){
        //Primer liga siempre null
        primerLiga = null;
    }

    //Retorna verdadero si la lista está vacía
    public boolean esVacia(){
        return(primerLiga == null);
    }
    
    public void insertarUltimo(String nombre, String nocontrol, String nip,
            int semestre, double promedio){
        //Crear nuevo nodo
        Liga Nodo = new Liga(nombre, nocontrol, nip, semestre, promedio);
        //Asignarlo como primero
        Nodo.Next = primerLiga;
        primerLiga = Nodo;
    }
    
    public Liga eliminarUltimo(){
        Liga apoyo = primerLiga;
        if(!esVacia()){
            //Elimina el nodo de la lista
            primerLiga = primerLiga.Next;
        } else{
            JOptionPane.showMessageDialog(null,"Lista vacía",
                    "Aviso!",JOptionPane.WARNING_MESSAGE);
        }
        return apoyo;
    }
    
    public void imprimir(){
        Liga algo = primerLiga;
        //Recorrer lista hasta que Next retorne null
        while(algo != null){
            algo.imprimir();
            System.out.println("Siguiente liga: "+algo.Next+"\n");
            algo = algo.Next;
        }
    }
    
    public Liga buscar(String nocontrol){
        Liga algo = primerLiga;
        if(!esVacia()){
            //Recorrer la lista para buscar
            while(!(algo.NOCONTROL.equals(nocontrol))){
                //Checa si ya se recorrió
                if(algo.Next == null){
                    // Fin de la lista
                    return null;
                } else {
                    // Continua recorriendo
                    algo = algo.Next; 
                }
            }
        } else{
            JOptionPane.showMessageDialog(null,"Lista vacía",
                    "Aviso",JOptionPane.WARNING_MESSAGE);
        }
        //algo.imprimir();
        return algo;
    }
    
    public Liga eliminarNodo(String nocontrol){
        Liga A1 = primerLiga;
        Liga A2 = primerLiga;
        
        //Continua buscando hasta que no encuentre coincidencias
        while(!(A1.NOCONTROL.equals(nocontrol))){
            //Checar si ya se recorrió
            if(A1.Next == null){
                //Lista recorrida, bye
                return null;
            }else{
                //Continua recorriendo lista
                A2 = A1;
                A1 = A1.Next;
            }
        }
        
        if(A1 == primerLiga){
            primerLiga = primerLiga.Next;
        }else{
            System.out.println("Encontrado");
            System.out.println("Current: " + A1);
            System.out.println("Primero: " + primerLiga);
            
            A2.Next = A1.Next;
        }
        return A1;
    }
    
}

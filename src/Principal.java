
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bernardo
 */
public class Principal {

    Plantilla p;
    Plantilla f;
    public  void main() {
        int op=1;
        do{
          if(p==null){
              Plantilla q=new Plantilla();
              q.nombre();
              q.liga=null;
              p=q;
              f=q;
          }else{
              Plantilla q=new Plantilla();
              q.nombre();
              q.liga=null;
              f.liga=q;
              f=q;
          }
          op=Integer.parseInt(JOptionPane.showInputDialog("Quieres seguir añadiendo \n1.-Si\n2.-No"));
        }while(op==1);
        int op2=Integer.parseInt(JOptionPane.showInputDialog("quieres mostrar la lista \n1.-Si\n2.-No"));
        if(op2==1){
            if(p!=null){
                Plantilla r=p;
                String res="";
                do{
                    res+=r.nombre+"\n";
                    r=r.liga;
                }while(r!=null);
                JOptionPane.showMessageDialog(null, res);
            }else{
                JOptionPane.showMessageDialog(null,"La lista no tiene nodos");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Gracias");
        }
    }
    
    public static void main(String [] args){
        Principal ref=new Principal();
        ref.main();
    }
    
}

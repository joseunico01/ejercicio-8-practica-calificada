
package ejer8;

import javax.swing.JOptionPane;

public class Ejer8 {

    public static void main(String[] args) {
        
        int opcion, n_alumnos;
        int m;
        
        n_alumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número total de alumnos: "));
        
        int codigo[] = new int[n_alumnos];
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+
                    "\n1. Ingreso de códigos"+
                    "\n2. Buscar por código."+
                    "\n3. Mostrar códigos."+
                    "\n4. Salir."));
            
            switch(opcion){
                
                case 1:
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        
                        codigo[i]=Integer.parseInt(JOptionPane.showInputDialog( (i+1) + ". Digite el código del alumno: "));    
                    }
                                   
                    break;
                    
                case 2:
                    
                    
                    m = Integer.parseInt(JOptionPane.showInputDialog("Digite el código del alumno buscado: "));
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        
                        if( codigo[i] == m ){ 
                            
                            JOptionPane.showMessageDialog(null,"El código está registrado"+
                                    "\nCódigo -->"+ codigo[i]);
                            
                        }  
                        else{
                            JOptionPane.showMessageDialog(null,"El código no esta registrado");
                            
                        }
                    }
                    
                    break;
                    
                case 3:
                    //Mostramos los codigos
                    System.out.println("");
                    System.out.println("LOS CÓDIGOS SON:");
                    
                    for (int i=0 ; i<n_alumnos ; i++){
                        
                        System.out.println("Alumno "+(i+1)+". "+codigo[i]);
                        
                    }
                    
                    break;
                    
                
            }
              
        }while(opcion != 4);
        
        
        
    }
    
}

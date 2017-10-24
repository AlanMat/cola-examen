/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class OrdenarCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cola[] = {90,80,70,60,-10,89,-33,25,-70,-5,-12,55,45};
        int aux1;
        
        System.out.print("\n cola base \n");
         for (int i = 0; i < cola.length; i++) {
          System.out.print(cola[i] + " ");
       }
       
        for (int i = 0; i < cola.length ; i++) {
            for (int j = 0; j < cola.length; j++) {
                if (cola[i] < cola[j]) {
                    aux1 = cola[i];
                    cola[i] = cola[j];
                    cola[j] = aux1;
                }
            }
        }
        System.out.print("\n cola menor a mayor  \n ");
         for (int i = 0; i < cola.length; i++) {
          System.out.print(cola[i] + " ");
       }
         for (int i = 0; i < cola.length ; i++) {
            for (int j = 0; j < cola.length; j++) {
                if (cola[i] > cola[j]) {
                    aux1 = cola[i];
                    cola[i] = cola[j];
                    cola[j] = aux1;
                }
            }
        }
         System.out.print("\n cola mayor a menor  \n ");
         for (int i = 0; i < cola.length; i++) {
          System.out.print(cola[i] + " ");
       }
    }
    
}

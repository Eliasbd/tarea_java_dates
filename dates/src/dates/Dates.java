/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dates;

import java.util.Scanner;


public class Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int mes,fecha,anio;
        Scanner tec = new Scanner (System.in);
        
        System.out.println("Ingrese fecha");
        fecha = tec.nextInt();
        
        System.out.println("Ingrese mes");
        mes = tec.nextInt();
        
        System.out.println("Ingrese anio");
        anio = tec.nextInt();
        
        
        if(mes == 1 && fecha > 31 || mes == 3 && fecha > 31 || mes == 5 && fecha > 31 || mes == 7 && fecha > 31 || mes == 10 && fecha > 31  || mes == 12 && fecha > 31 ){
            System.out.println("Fecha Invalida");
                
            
        }else if(mes == 4 && fecha > 30 || mes == 6 && fecha > 30  || mes == 8 && fecha > 30 || mes == 9 && fecha > 30 || mes == 11 && fecha > 30 ){
            System.out.println("FEcha Invalida");
        }else {
            
            if ((anio % 4 == 0)  && fecha <= 29){
                System.out.println(" anio biciesto");
                 System.out.println("FEcha valida");
            }
            
            else{
                 System.out.println("no es anio bisiesto se serio");
                  System.out.println("FEcha Invalida");
            }
           
            
                    
                
                
                
            
        }
        
        
        
        
    }
    
}

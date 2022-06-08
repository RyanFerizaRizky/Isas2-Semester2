/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isas.pkg2.smester.pkg2;

import java.util.Arrays;



/**
 *
 * @author DAVA
 */
public class Isas2Smester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
        float arr[] = { (float)2.5, (float)2.1, (float)2.3, (float)3.0,
                        (float)-3.2, (float)10.1, (float)4.3, (float)5.0,
                        (float)4.9, (float)5.1, (float)2.5, (float)2.1, (float)2.3, (float)3.0,
                        (float)3.2, (float)10.1, (float)4.3, (float)5.0,
                        (float)4.9, (float)5.1 };
        
        System.out.println("unsorted price : ");
        for (float unsorted : arr)
            System.out.print( unsorted + " ");
               
        int n = arr.length ;
        Bucketsort.bucketSort (arr, n);
        
        System.out.println();
              
        System.out.println("Sorted Price : ");
        for (float  sorted : arr) {
            System.out.print(sorted + " ");
        }
        
        System.out.println();

        
        
        
    }
    
}

package belajarsendiri;

import java.util.Arrays;

public class tugasstrukturdata1 {
    public static void main(String[] args) {
        
        System.out.println("Class array : ");
        byte [] a = {1,2,3,4};
        System.out.println(Arrays.toString (a));
        
        System.out.println("Index : ");
        short [] b = {5,6,7};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        
        System.out.println("For each : ");
        int [] c = {1,2,3,4,5};
        for(int d : c){
            System.out.println(d);
            
    }
        System.out.println("For : ");
        long [] e = {6,7,8,9,10};
        for(int i = 0; i < e.length; i++){
            System.out.println(e[i]);
            
        }
        System.out.println("Biasa : ");
        float [] f = {1,2,3};
        System.out.println(f.length);
        
        System.out.println("Class Array : ");
        double [] g = {5,6,7,8};
        System.out.println(Arrays.toString(g));
        
        System.out.println("Biasa : ");
        boolean [] h = {true,false,true,false};
        System.out.println(h[1]);
        
        System.out.println("For : ");
        char [] i = {'E','N','H','Y','P','E','N'};
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);
            
        }
      
          System.out.println("");  
        }
        
    }
    


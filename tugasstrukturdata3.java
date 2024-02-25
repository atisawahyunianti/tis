package belajarsendiri;

import java.util.Arrays;

public class tugasstrukturdata3 {
    public static void main(String[] args) {
        byte [][] a = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(a));
        
        short [][] b = {{4,5},{6,7}};
        for(int i = 0; i < b.length; i++){
            System.out.println(b.length);
        }
        int [][] c = {{11,12},{13,14}};
        System.out.println(c[1][1]);
        
        long [][] d = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(d));
        
        float [][] e = {{1},{2}};
        System.out.println(Arrays.deepToString(e));
        
        double [][] f = {{20,21,22},{23,24,25}};
        System.out.println(f[1][2]);
        
        boolean [][] g = {{true},{false}};
        System.out.println(Arrays.deepToString(g));
        
        char [][] i = {{'A'},{'B'}};
        System.out.println(Arrays.deepToString(i));
            
        }
}
    
    


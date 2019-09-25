/*
 * This program add number to collection(I use ArrayList) and sort from largest to smallest.
 */
package javacollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Robert Masiuk robert@masiuk.pl
 */
public class JavaCollections {
    public static int i = 1;
    public static void print(){
        
        System.out.println("give " + i + " number's; ");
        i++;
    }

    public static void main(String[] args) throws IOException {
        ArrayList list = new ArrayList();
        double a, b, c, d, e, f;

        InputStreamReader data = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(data);
        
        for(int j = 0; j < 10; j++){
        print();
        list.add(Double.parseDouble(br.readLine()));
        }

     
        
        
    }


}

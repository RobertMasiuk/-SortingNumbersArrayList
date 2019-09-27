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

        InputStreamReader data = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(data);
        
        for(int j = 0; j < 10; j++){
        print();
        list.add(Double.parseDouble(br.readLine()));
        }

        for(int g = 0; g < list.size(); g++){
            if(i < list.size()-1)
                System.out.println(list.get(i) + ", ");
            else
                System.out.println(list.get(i) + ". ");
        }
        
        
    }


}

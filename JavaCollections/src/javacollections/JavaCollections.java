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
        System.out.println("test");
        print();
        list.add(Double.parseDouble(br.readLine()));
        System.out.println(list.get(j};
    
        }
     //   for (Object list1 : list) {
     //       if(i < (list.size()-1))
     //           System.out.println(list.get(i) + ", ");
     //       else
     //           System.out.println(list.get(i) + ". ");
     //   }
        
        
    }


}

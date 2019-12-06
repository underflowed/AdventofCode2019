import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("input.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(reader);
        String input = " ";
        int integerinput;
        int sum = 0;
        int sum2 = 0;
        double holder;     
        while(input != null) {
            try {
                // Part 1
                input = bufferedreader.readLine();
                integerinput = Integer.parseInt(input);  
                sum += Math.floor(integerinput/3) - 2;
                System.out.println(sum);
                // Part 2
                holder = integerinput;
                while(holder > 0) {
                    holder = Math.floor(holder/3) - 2;
                    if(holder >= 0) {
                        sum2 += holder;
                        System.out.println(sum2);                    
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
                //not sure why this isnt thrown when parseInt() runs into the null in BufferedReader but ok
            }
        }
        bufferedreader.close();
    }
}
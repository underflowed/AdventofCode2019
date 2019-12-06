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
        while(input != null) {
            try {
                input = bufferedreader.readLine();
                integerinput = Integer.parseInt(input);  
                sum += Math.floor(integerinput/3) - 2;
                System.out.println(sum);  
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
                //not sure why this isnt thrown when parseInt() runs into the null in BufferedReader but ok
            }
        }
        bufferedreader.close();
    }
}
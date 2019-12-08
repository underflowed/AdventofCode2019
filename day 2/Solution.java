// Day 2 Advent of Code 2019, Author: Jose Oliver
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException, NumberFormatException {
        File file = new File("input.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String input = bufferedReader.readLine();
        String[] filteredinput = input.split(",",0);
        // Replacement of position 1 and 2 as per request of the challenge
        int[] opcode = new int[filteredinput.length];
        int position1;
        int position2;
        int position3;
        int sum;
        int multiplied;
        int noun;
        int verb; 
        for(int i = 0; i < filteredinput.length; i++) {
            opcode[i] = Integer.parseInt(filteredinput[i]);           
        }
        for(int i = 0; i < 100; i++){
            noun = i;
            for(int j = 0; j < 100; j++){
                verb = j;
                for(int k = 0; k < opcode.length;) {
                    opcode[1] = noun;
                    opcode[2] = verb;
                    if(opcode[k] == 1) {
                        position1 = opcode[k + 1]; 
                        position2 = opcode[k + 2];
                        position3 = opcode[k + 3];
                        sum = opcode[position1] + opcode[position2];
                        opcode[position3] = sum;
                        k += 4;              
                    } else if(opcode[k] == 2) {
                        position1 = opcode[k + 1];
                        position2 = opcode[k + 2];
                        position3 = opcode[k + 3];
                        multiplied = opcode[position1] * opcode[position2];
                        opcode[position3] = multiplied;
                        k += 4;                
                    } else if(opcode[k] == 99) {
                        break;
                    }
                 
                }
                if(opcode[0] == 19690720){
                    System.out.println(100 * noun + verb);
                    break;
                } else {
                    opcode = reset(opcode, filteredinput);
                }
            }
        }
        bufferedReader.close();
    }

    static int[] reset(int[] intarray, String[] stringarray) {
        for(int i = 0; i < stringarray.length; i++) {
            intarray[i] = Integer.parseInt(stringarray[i]);
        }
        return intarray;
    }
}
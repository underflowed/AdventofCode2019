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
        filteredinput[1] = "12";
        filteredinput[2] = "2";
        int[] opcode = new int[filteredinput.length];
        int position1;
        int position2;
        int position3;
        int sum;
        int multiplied; 
        for(int i = 0; i < filteredinput.length; i++) {
            opcode[i] = Integer.parseInt(filteredinput[i]);           
        }
        for(int i = 0; i < opcode.length;) {
            if(opcode[i] == 1) {
                position1 = opcode[i + 1]; 
                position2 = opcode[i + 2];
                position3 = opcode[i + 3];
                sum = opcode[position1] + opcode[position2];
                opcode[position3] = sum;
                i += 4;              
            } else if(opcode[i] == 2) {
                position1 = opcode[i + 1];
                position2 = opcode[i + 2];
                position3 = opcode[i + 3];
                multiplied = opcode[position1] * opcode[position2];
                opcode[position3] = multiplied;
                i += 4;                
            } else if(opcode[i] == 99) {
                break;
            } 
        }
        System.out.println(opcode[0]);
        bufferedReader.close();
    }
}
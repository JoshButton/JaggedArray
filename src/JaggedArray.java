/** 
 This prints a triangular matrix. The user chooses the 
 height and a Jagged Array is constructed.
 @author Joshua Button
 @version 1.0
 @date 16/01/2019
 @website www.joshuabutton.co.uk
*/

import java.util.*;

public class JaggedArray 
{
    public static void main(String args[])
   {
       int n; //initalize variable to hold users height choice
       System.out.println("-=JOSH'S TRIANGULAR MATRIX BUILDER=-"); //Prints title
       System.out.println("How tall we building this thing? (input a number)"); //Prompts user to input the "height" of the matrix
       Scanner kb = new Scanner(System.in); //initialise keyboard
       do {
        while (!kb.hasNextInt()) { //input validation
            System.out.println("That's not a number!"); //informs user that is not a number
            kb.next(); //prompts for keyboard input again
        }
            n = kb.nextInt(); //save keyboard input to n
        } while (n <= 0);
        System.out.println(); //leaves a gap
        n++; //increments user input due to problem with printing the final row
               
       int[][] triArray = new int[n][]; //initalize array
       int number = 1; //counter for putting numbers into array
       
       for(int i = 0; i < n ; i++){ //for loop to create array with n so it creates the desired amount of rows
           triArray[i] = new int[i+1]; //this creates the "Triangle" by adding i+1 columns each loop will have 1 more column than the last
           for(int j = 0; j < i; j++){ // for loop to add numbers
               triArray[i-1][j] = number++; //incremnents counter and adds to the array
           }
       }
       
        for(int p = 0; p < n-1; p++){ //loops through the array collumns and prints them accept for the final collumn because this is the extra one we added at the start
               System.out.println(Arrays.toString(triArray[p]).replace("[", "").replace("]", "")); //prints each column and removes the brackets to match the lab text
       }
   }
}

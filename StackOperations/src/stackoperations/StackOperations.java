/* 
* In this program we create two classes FixedStack and VariableStack & implment stack interface, working of both class is pretty much same,
* Except that the VariableStack can accept variable no. of integers while FixedStack can only accept fixed no. of integers
*
 */
package stackoperations;                                                        //package declaration

import java.util.Scanner;                                                       //importing java util package
import myPack.Stack;                                                            // used defined package imported

public class StackOperations {                                                  // main class 

    Scanner scan = new Scanner(System.in);                                      //Scanner object initialization to take input 

    public static void main(String[] args) {
        int[] valProducerOne = {0, 1, 2, 3, 4, 6};                                // an array vairable of length 5
        int[] valProducerTwo = {0, 1, 2, 3, 4, 5, 6, 7};                   // an array variable of lenth 11
        FixedStack objFStack = new FixedStack(5);                             // object initialization with array sized 5 for FixedStack class
        VariableStack objVStack = new VariableStack(4);                       // object initialization with array sized 11 for VariableStack class

        System.out.print("Determining FixedStack size  =>  ");
        objFStack.push(valProducerOne);                                      // calling push method         
        objFStack.pop();                                                     //calling pop method

        objVStack.push(valProducerTwo);                                      // calling push method
        objVStack.pop();                                                     // calling pop method
    }

}

class FixedStack implements Stack {                                             // FixedStack implmenting Stack class present in myPack

    int[] input;                                                               // array variable input declared    

    public FixedStack(int size) {                                               // default constructor for  defining array
        this.input = new int[size];                                              // assigning value to input passed by default constructor
        System.out.println("input[] length(FixedStack) : " + input.length);                // output array length
    }

    @Override                                                                   // override annotation for push method
    public void push(int[] valConsumer) {                                       // push method to assign array values to input
        if (this.input.length < valConsumer.length) {                             // output oveflow if array passed greater then input length
            this.input = new int[0];                                              // make the input array length 0 , we will use it to determine whether
            System.out.println(" Stack Overflow ");                                // input has any values
        } else {
            for (int index = 0; index < valConsumer.length; index++) {
                this.input[index] = valConsumer[index];                           // copy over values passed to input array
            }

        }

    }

    @Override                                                                   //override annotation for pop method
    public void pop() {                                                         // we use this method to display values
        if (input.length != 0) {
            for (int item : this.input) {                                               // for each to access array values
                System.out.println("Value :" + item);                                // output array values
            }
        }
    }

}

class VariableStack implements Stack {                                          //VariableStack class implementing Stack interface

    int[] input;                                                                // input variable declaration 

    public VariableStack(int size) {                                            // default constructor to initialize array 
        this.input = new int[size];                                              // assigning array size passed at object initialization        
        System.out.println("input[] length (VariableStack) : " + this.input.length);            // output size of input array variable
    }

    @Override                                                                   //override annotates push method
    public void push(int[] valConsumer) {                                       // push method to consume passed array into input array
        if (this.input.length < valConsumer.length) {                              //Re initialize input array if valConsumer is bigger
            this.input = new int[valConsumer.length];
            System.out.println("----------------------------------------------");
            System.out.println("input[] length (VariableStack) : " + this.input.length);
            for (int index = 0; index < valConsumer.length; index++) {                  // traverse through array and do assignment to input[index]
                input[index] = valConsumer[index];
            }
        }
    }

    @Override                                                                   // override annotates pop method
    public void pop() {                                                         // pop method to traverse and display output
        if (input.length != 0) {
            for (int item : this.input) {
                System.out.println("Value :" + item);
            }
        }
    }

}

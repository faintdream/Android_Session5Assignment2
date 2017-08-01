/*
 *  In this class we create an interface Stack and build the project, after which the Stack.jar will get created,
 *  the resultant Stack.jar can be imported to any other project
 */
package myPack;                                                             // declaring package name 


public interface Stack {                                                   // declaring public interface
                                                                           // we make it public to make it acessible outside myPack also

             void push ( int[] i);
             void pop ();
    
}

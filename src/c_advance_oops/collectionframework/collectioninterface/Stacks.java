package c_advance_oops.collectionframework.collectioninterface;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        characterStack.push('A');
        characterStack.push('B');
        characterStack.push('C');
        characterStack.push('D');

        System.out.println(characterStack);

        System.out.println(characterStack.lastElement());       // D
        System.out.println(characterStack);                     // No change

        System.out.println(characterStack.pop());               // D
        System.out.println(characterStack);                     // Changed

        System.out.println(characterStack.peek());              // C
        System.out.println(characterStack);                     // No change

        System.out.println(characterStack.empty());             // false
    }
}

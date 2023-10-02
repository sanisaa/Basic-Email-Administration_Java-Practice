//remove occurence of a given character from a string
package practice;

public class RemoveCharacterFromString {


    public static void main(String[] args) {
        String input = "Hello, World!";
        String target = "l";
        System.out.println("Original string: " + input);
        input = input.replace(target,"");
        System.out.println("new string " + input);
    }
}

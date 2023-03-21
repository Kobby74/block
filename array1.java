import java.util.ArrayList;
public class array1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //accessing elements in the Arraylist
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);
        System.out.println("The first number is " + firstNumber);
        System.out.println("The second number is " + secondNumber);
        
        numbers.remove(2);
        System.out.println("The updated ArrayList is: "+numbers);
        
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    private static void assertEquals(String string, Object whoLikesIt) {
    }
}

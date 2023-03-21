import java.util.Scanner;
public class fblikes{
    public static void main(String[] args) {
        String[] names = getInput();
        String result = fbLikes(names);
        System.out.println(result);
    }

    public static String[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people who like the fb post");
        int totalNumber = scanner.nextInt();
        String[] names = new String[totalNumber];
        System.out.println("Enter the names ");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }
        scanner.close();
        return names;
    }

    public static String fbLikes(String[] names) {
        int n = names.length;
        if (n == 0) {
            return "No one likes this";
        }
        if (n == 1) {
            return names[0] + " likes this";
        }
        if (n == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (n == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        return names[0] + ", " + names[1] + " and " + (n - 2) + " others like this";
    }
}


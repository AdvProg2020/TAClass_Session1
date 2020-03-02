import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder("The fox jumps over the dog.");
        int foxIndex = builder.indexOf("fox");
        builder.insert(foxIndex, scanner.nextLine().trim() + " ");
        int dogIndex = builder.indexOf("dog");
        builder.insert(dogIndex, scanner.nextLine().trim() + " ");
        System.out.println(builder);
    }
}

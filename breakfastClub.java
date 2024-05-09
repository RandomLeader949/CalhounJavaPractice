import java.util.Scanner;
public class breakfastClub
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many friends? ");
        int numberOfFriends = scanner.nextInt();
        numberOfFriends++;
        int total1 = numberOfFriends * 3;
        total1 += 12;
        int total2 = total1 * 5;
        total2 += total1;
        System.out.println(String.valueOf(total2));
    }
}
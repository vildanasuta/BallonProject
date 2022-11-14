import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite riječ: ");
        Scanner myObj = new Scanner(System.in);
        String S = myObj.nextLine();

        System.out.println("Iz date riječi je moguće formirati riječ BALLOON " +
                Solution.solution(S)+"x.");
    }
}
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Scanner;

public class CheckInputTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void testCheckInputWord() {
        exceptionRule.expect(NotUppercaseException.class);
        exceptionRule.expectMessage("Inputted word is not UPPERCASE.");
        CheckInput.CheckInputWord("Inputted Word");
    }
    @Rule
    public ExpectedException exceptionRule1 = ExpectedException.none();
    @Test
    public void testCheckInputWord1() {
        exceptionRule.expect(WordTooLongException.class);
        exceptionRule.expectMessage("Inputted word is too long. ");
        Scanner scanner=new Scanner("src/main/java/tooLongFile.txt");
        CheckInput.CheckInputWord(scanner.nextLine());
    }
}


import java.io.*;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MainTest {

    @Test
    public void testReadAndWrite() throws IOException {
        Scanner scanner = new Scanner(new File("src/main/java/inText.txt"));
        FileWriter writer = new FileWriter("src/main/java/outText.txt");
        Main.readAndWrite(scanner, writer, "BALLOON");
        File outFile = new File("src/main/java/outText.txt");
        assertTrue(outFile.exists());
    }

    @Test
    public void testMakeInputFile() {
        File obj = Main.getInputFile();
        assertTrue(obj.exists());
        assertTrue(obj.isFile());
    }

    @Test
    public void testMakeScanner() throws FileNotFoundException {
        File obj = Main.getInputFile();
        Scanner reader = Main.makeScanner(obj);
        assertTrue(reader.hasNextLine());
    }
    @Test
    public void testMakeOutText() throws IOException {
        FileWriter outText=Main.makeFileWriter();
        assertTrue(outText != null);
    }
}


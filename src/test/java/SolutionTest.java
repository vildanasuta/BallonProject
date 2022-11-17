import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class SolutionTest {
    static Logger logger=Logger.getLogger(InTextFileNotFound.class.getName());
    @BeforeClass
    public static void beforeClass(){
        logger.log(Level.INFO, "Testing for class Solution has started.");
    }
    @BeforeTest
    public static void beforeEach(){
        logger.log(Level.INFO, "Test has started. ");
    }
    @Test
    public void testSolution1() throws IOException {
        File obj=new File("src/main/java/inText.txt");
        assertTrue(obj.exists());
        Scanner reader=new Scanner(obj);
        FileWriter fileWriter=new FileWriter("src/main/java/outText.txt");
        while(reader.hasNextLine()) {
            String S = reader.nextLine();
            fileWriter.write("From the word given, inputted word can be formed " +
                    Solution.solution("BALLOON",S)+"x. ");
            fileWriter.write(System.getProperty( "line.separator" ));
        }
        fileWriter.close();
    }
    @Test
    public void testSolution2() throws FileNotFoundException {
        String outTextExpected="From the word given, inputted word can be formed 1x. \n" +
                "From the word given, inputted word can be formed 2x. \n" +
                "From the word given, inputted word can be formed 0x. \n" +
                "From the word given, inputted word can be formed 1x. \n" ;
        File outText=new File("src/main/java/outText.txt");
        Scanner reader1=new Scanner(outText);
        String S="";
        while(reader1.hasNextLine()){
            S+=reader1.nextLine()+"\n";
        }
        assertFalse(S.isEmpty());
        assertEquals(outTextExpected,S);
    }
    @Test
    public void testSolution3(){
        File outText=new File("src/main/java/outText.txt");
        assertTrue(outText.exists());
    }
    @AfterTest
    public static void afterEach(){
        logger.log(Level.INFO, "Test has ended.");
    }
    @AfterClass
    public static void afterClass(){
        logger.log(Level.INFO, "Testing for class Solution has ended.");
    }

}


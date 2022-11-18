import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ReadAndWriteTest {
    static Logger logger=Logger.getLogger(ReadAndWriteTest.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Testing process has started.");
    }
    @BeforeEach
    public void beforeEach(){logger.log(Level.INFO, "Test has started.");}
    @Test
    public void testGetInputFile() {
        File obj=ReadAndWrite.getInputFile();
        assertEquals("src\\main\\java\\inText.txt",obj.getPath());
    }
    @SuppressWarnings("unchecked")
    @Test
    public void testReadAndWrite() throws IOException {
        File obj= mock(File.class);
        when(obj.exists()).thenReturn(true);
        ReadAndWrite.readAndWrite(obj, "BALLOON");
        File outText=new File("src/main/java/outText.txt");
        assertTrue(outText.exists());
    }
    @AfterEach
    public void afterEach(){logger.log(Level.INFO, "Test has ended.");}
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Testing process has ended.");
    }
}


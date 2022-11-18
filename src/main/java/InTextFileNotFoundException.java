import java.io.FileNotFoundException;

public class InTextFileNotFoundException extends FileNotFoundException {
    public InTextFileNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}

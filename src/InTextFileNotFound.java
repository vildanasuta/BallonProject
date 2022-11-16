import java.io.FileNotFoundException;

public class InTextFileNotFound extends FileNotFoundException {
    public InTextFileNotFound(String errorMessage) {
        super(errorMessage);
    }

}

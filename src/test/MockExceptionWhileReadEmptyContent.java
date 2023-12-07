import java.io.IOException;

public class MockExceptionWhileReadEmptyContent extends FileReadWriteContent{
    @Override
    protected String readFileFromDisk() throws IOException {
        return "";
    }
}

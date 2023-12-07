import java.io.IOException;

public class MockIOExceptionWhileRead extends FileReadWriteContent{
    @Override
    protected String readFileFromDisk() throws IOException {
        throw new IOException();
    }
}

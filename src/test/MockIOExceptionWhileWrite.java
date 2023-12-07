import java.io.IOException;

public class MockIOExceptionWhileWrite extends FileReadWriteContent{

    @Override
    protected String readFileFromDisk() {
        return "my test string";
    }

    @Override
    protected void writeFileToDisk(String content) throws IOException {
        throw new IOException();
    }
}

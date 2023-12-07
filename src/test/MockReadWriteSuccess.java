import java.io.IOException;

public class MockReadWriteSuccess extends FileReadWriteContent{

    @Override
    protected String readFileFromDisk(){
        return "my test string";
    }

    @Override
    protected void writeFileToDisk(String content) {
        //do nothing
    }
}

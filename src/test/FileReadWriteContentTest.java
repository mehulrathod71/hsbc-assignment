import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileReadWriteContentTest {
    FileReadWriteContent mockIOExceptionWhileRead = new MockIOExceptionWhileRead();
    FileReadWriteContent mockExceptionWhileReadEmptyContent = new MockExceptionWhileReadEmptyContent();
    FileReadWriteContent mockIOExceptionWhileWrite = new MockIOExceptionWhileWrite();
    FileReadWriteContent mockReadWriteSuccess = new MockReadWriteSuccess();

    @Test
    public void test_if_files_not_available_while_reading() {
        Assert.assertThrows(IOException.class, () -> { mockIOExceptionWhileRead.run();});
    }

    @Test
    public void test_if_files_having_empty_contents() {
        Exception exception = Assert.assertThrows(Exception.class, () -> { mockExceptionWhileReadEmptyContent.run();});
        Assert.assertEquals("file content is empty", exception.getMessage());
    }

    @Test
    public void test_read_files_success_but_exception_while_writing_to_disk() {
        Assert.assertThrows(IOException.class, () -> { mockIOExceptionWhileWrite.run();});
    }

    @Test
    public void test_read_files_success_and_write_file_success() {
        try{
            String returnedMesasage = mockReadWriteSuccess.run();
            Assert.assertEquals("Content written to MyOutputFile.txt",returnedMesasage);
        }catch(Exception ex){
            Assert.assertTrue(false);
        }
    }

}

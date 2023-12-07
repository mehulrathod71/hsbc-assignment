import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWriteContent {

    protected String run() throws Exception {
        return wirteContentToOutputFile(
                new StringBuilder(getContentFromInputFile())
                        .reverse().toString());
    }
    protected String wirteContentToOutputFile(String content) throws IOException {
        try {
            writeFileToDisk(content);
            return "Content written to MyOutputFile.txt";
        } catch (IOException ioException) {
            throw ioException;
        }
    }

    protected void writeFileToDisk(String content) throws IOException {
        Files.writeString(Paths.get("src/main", "MyOutputFile.txt"), content);
    }

    protected String readFileFromDisk() throws IOException {
        return Files.readString(Paths.get("src/main", "MyInputFile.txt"));
    }

    protected String getContentFromInputFile() throws Exception {
        try {
            String content = readFileFromDisk();
            if (content.isEmpty() || content.isBlank()){
                throw new Exception("file content is empty");
            } else{
                return content;
            }
        }catch (Exception ex) {
            throw ex;
        }
    }

}

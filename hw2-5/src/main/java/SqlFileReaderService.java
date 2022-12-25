import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SqlFileReaderService {
    public StringBuilder read(File file) throws IOException {
        String baseLine;
        StringBuilder resultSQL = new StringBuilder();
        BufferedReader input =
                new BufferedReader(new FileReader(file));
        while ((baseLine = input.readLine()) != null) {
            resultSQL.append(baseLine).append(" ");
        }
        input.close();
        return resultSQL;
    }
}

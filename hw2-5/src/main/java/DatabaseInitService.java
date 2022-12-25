import java.io.*;
import java.sql.*;

public class DatabaseInitService {
    public static void main(String[] args) throws SQLException {

        //Execute this method first!

        Connection conn = Database.getInstance().getConnection();

        try {
            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.INITDBSCRIPT);
            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);

            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.commit();
            ps.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

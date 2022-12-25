import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException {

        //Before executing this method execute DatabaseInitService (1) first!
        try {
        Connection conn = Database.getInstance().getConnection();

            PreparedStatement psForWorker = conn.prepareStatement(PopulateDBQueries.insertWorkerQuery);
            PreparedStatement psForClient = conn.prepareStatement(PopulateDBQueries.insertClientQuery);
            PreparedStatement psForProject = conn.prepareStatement(PopulateDBQueries.insertProjectQuery);
            PreparedStatement psForProjectWorker = conn.prepareStatement(PopulateDBQueries.insertProjectWorkerQuery);

            for(String[] worker: PopulateDBValues.workers) {
                psForWorker.setString(1, worker[0]);
                psForWorker.setDate(2, Date.valueOf(worker[1]));
                psForWorker.setString(3, worker[2]);
                psForWorker.setInt(4, Integer.parseInt(worker[3]));
                psForWorker.addBatch();
            }
            psForWorker.executeBatch();

            for(String client: PopulateDBValues.clients) {
                psForClient.setString(1, client);
                psForClient.addBatch();
            }
            psForClient.executeBatch();

            for(String[] project: PopulateDBValues.projects) {
                psForProject.setDate(1, Date.valueOf(project[0]));
                psForProject.setDate(2, Date.valueOf(project[1]));
                psForProject.setString(3, project[2]);
                psForProject.addBatch();
            }
            psForProject.executeBatch();

            for(String[] projectWorker: PopulateDBValues.projectWorkers) {
                psForProjectWorker.setInt(1, Integer.parseInt(projectWorker[0]));
                psForProjectWorker.setString(2, projectWorker[1]);
                psForProjectWorker.addBatch();
            }
            psForProjectWorker.executeBatch();

            conn.commit();

            psForWorker.close();
            psForClient.close();
            psForProject.close();
            psForProjectWorker.close();

            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

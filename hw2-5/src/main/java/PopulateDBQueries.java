public class PopulateDBQueries {

    public static final String insertWorkerQuery = "INSERT INTO worker( NAME, BIRTHDAY, LEVEL, SALARY ) " +
                                                    " VALUES( ?, ?, ?, ? )";

    public static final String insertClientQuery = "INSERT INTO client( NAME ) VALUES( ? )";

    public static final String insertProjectQuery = "INSERT INTO " +
                                                    "project( CLIENT_ID, START_DATE, FINISH_DATE ) " +
                                                    "SELECT ID, ?, ? FROM client WHERE NAME = ?";

    public static final String insertProjectWorkerQuery = "INSERT INTO " +
                                                          "project_worker( PROJECT_ID, WORKER_ID ) SELECT TOP 1 ?, ID " +
                                                          "FROM worker WHERE NAME = ?";

}

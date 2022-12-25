import ObjectForQueries.*;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    Connection conn = Database.getInstance().getConnection();
    public DatabaseQueryService() throws SQLException {
    }
    List<LongestProject> findTheLongestProject() throws SQLException {

        List<LongestProject> resultList = new ArrayList<>();
        try {

            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.FINGLONPROJ);
            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            conn.commit();

            while (rs.next()) {
                LongestProject lp = new LongestProject();
                lp.setProjectName(rs.getString(SystemNames.ID));
                lp.setProjectDuration(rs.getInt(SystemNames.MONTHCOUNT));
                resultList.add(lp);
            }

            ps.close();

        } catch (Exception e) {
            conn.rollback();
        }
        return resultList;

    }
    List<MaxProjectCountClient> findMaxProjectsClient() throws SQLException {

        List<MaxProjectCountClient> resultList = new ArrayList<>();
        try {
            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.FINDMINMAXPROJCLI);
            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                MaxProjectCountClient mpcc = new MaxProjectCountClient();
                mpcc.setName(rs.getString(SystemNames.NAME));
                mpcc.setProjectCount(rs.getInt(SystemNames.PROJCOUNT));
                resultList.add(mpcc);
            }
            ps.close();
        } catch (Exception e) {
            conn.rollback();
        }
        return resultList;

    }
    List<MaxSalaryWorker> findMaxSalaryWorker() throws SQLException {
        List<MaxSalaryWorker> resultList = new ArrayList<>();
        try {
            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.FINDMAXSALWORKER);
            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            conn.commit();

            while (rs.next()) {
                MaxSalaryWorker msw = new MaxSalaryWorker();
                msw.setName(rs.getString(SystemNames.NAME));
                msw.setSalary(rs.getInt(SystemNames.SALARY));
                resultList.add(msw);
            }

            ps.close();

        } catch (Exception e) {
            conn.rollback();
        }
        return resultList;

    }
    List<YoungestEldestWorkers> findYoungestEldestWorkers() throws SQLException {
        List<YoungestEldestWorkers> resultList = new ArrayList<>();
        try {
            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.FINDYOUNGOLDWOKER);

            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            conn.commit();

            while (rs.next()) {
                YoungestEldestWorkers yew = new YoungestEldestWorkers();
                yew.setName(rs.getString(SystemNames.NAME));
                yew.setType(rs.getString(SystemNames.TYPE));
                yew.setBirthday(rs.getDate(SystemNames.BDAY));
                resultList.add(yew);
            }

            ps.close();

        } catch (Exception e) {
            conn.rollback();
        }
        return resultList;

    }
    List<ProjectsAndPrices> printProjectsAndPrices() throws SQLException {
        List<ProjectsAndPrices> resultList = new ArrayList<>();
        try {
            SqlFileReaderService sqlFileReader = new SqlFileReaderService();
            File file = new File(SystemNames.PRINTPROJPRICES);

            StringBuilder resultSQL = sqlFileReader.read(file);

            String query = String.valueOf(resultSQL);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            conn.commit();

            while (rs.next()) {
                ProjectsAndPrices pap = new ProjectsAndPrices();
                pap.setId(rs.getInt(SystemNames.ID));
                pap.setPrice(rs.getInt(SystemNames.PROJPRICE));
                resultList.add(pap);
            }

            ps.close();

        } catch (Exception e) {
            conn.rollback();
        }
        return resultList;

    }

}

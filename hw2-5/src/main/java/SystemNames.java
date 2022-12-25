import java.nio.file.FileSystems;

public class SystemNames {

    static String separator = FileSystems.getDefault().getSeparator();

    public static final String INITDBSCRIPT = "sql" + separator + "init_db.sql";
    public static final String FINGLONPROJ = "sql" + separator + "find_longest_project.sql";
    public static final String FINDMINMAXPROJCLI = "sql" + separator + "find_max_projects_client.sql";
    public static final String FINDMAXSALWORKER = "sql" + separator + "find_max_salary_worker.sql";
    public static final String FINDYOUNGOLDWOKER = "sql" + separator + "find_youngest_eldest_workers.sql";
    public static final String PRINTPROJPRICES = "sql" + separator + "print_project_prices.sql";

    public static final String ID = "ID";
    public static final String NAME = "NAME";
    public static final String MONTHCOUNT = "MONTH_COUNT";
    public static final String PROJCOUNT = "PROJECT_COUNT";
    public static final String SALARY = "SALARY";
    public static final String TYPE = "TYPE";
    public static final String BDAY = "BIRTHDAY";
    public static final String PROJPRICE = "PROJECT_PRICE";

}

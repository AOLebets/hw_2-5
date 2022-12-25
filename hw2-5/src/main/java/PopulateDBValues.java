public class PopulateDBValues {
    public static final String [][] workers = {
                    { "Mike", "2005-08-04", "Trainee", "500" },
                    { "Clara", "2005-08-04", "Trainee", "520" },
                    { "Keith", "2002-06-18", "Junior", "800"  },
                    { "Bill", "1997-02-25", "Junior", "850"  },
                    { "Amurta", "1996-05-07", "Junior", "900"  },
                    { "Diona", "1978-12-08", "Junior", "900"  },
                    { "Henry", "1987-04-01", "Middle", "2000"  },
                    { "Klavier", "1998-10-24", "Middle", "2500"  },
                    { "Key", "1999-01-05", "Middle", "4500"  },
                    { "Phoenix", "1978-12-08", "Senior", "7000"  }
    } ;

    public static final String[] clients = {"Kaeya", "Layla", "Cyno", "Jean", "Lisa" };

    public static final String[][] projects = {
                    { "2020-01-01", "2020-02-03", "Kaeya" },
                    { "2020-01-01", "2021-01-01", "Layla" },
                    { "2020-01-01", "2020-02-03", "Layla" },
                    { "2020-01-05", "2020-08-03", "Layla" },
                    { "2020-07-08", "2021-07-01", "Cyno" },
                    { "2021-08-01", "2021-09-07", "Cyno" },
                    { "2021-08-01", "2021-12-15", "Jean" },
                    { "2021-12-25", "2022-02-03", "Lisa" },
                    { "2022-01-08", "2022-02-09", "Lisa" },
                    { "2022-02-25", "2022-11-11", "Lisa" }
    };

    public static final String[][] projectWorkers= {
        {"1", "Phoenix"},
        {"2", "Mike"}, {"2", "Amurta"}, {"2", "Bill"},
        {"3", "Clara"}, {"3", "Keith"}, {"3", "Bill"},
        {"4", "Amurta"}, {"4", "Bill"}, {"4", "Keith"}, {"4", "Clara"},
        {"5", "Amurta"}, {"5", "Bill"}, {"5", "Keith"},
        {"6", "Diona"}, {"6", "Amurta"}, {"6", "Keith"},
        {"7", "Phoenix"}, {"7", "Bill"}, {"7", "Keith"},
        {"8", "Bill"}, {"8", "Amurta"}, {"8", "Clara"}, {"8", "Keith"},
        {"9", "Henry"}, {"9", "Diona"}, {"9", "Amurta"},
        {"10", "Phoenix"}, {"10", "Key"}, {"10", "Klavier"}, {"10", "Henry"}, {"10", "Diona"}
    };
    
}

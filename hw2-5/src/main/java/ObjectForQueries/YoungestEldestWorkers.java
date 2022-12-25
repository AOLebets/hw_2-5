package ObjectForQueries;

import java.sql.Date;

public class YoungestEldestWorkers {
        private String name;
        private String type;
        private Date birthday;
        public void setName(String name) { this.name = name; }
        public void setType(String type) { this.type = type; }
        public void setBirthday(Date birthday) { this.birthday = birthday; }
        public String getName() { return name; }
        public String getType() { return type; }
        public Date getBirthday() { return birthday; }

        @Override
        public String toString(){
            return "Name: " + this.getName() + ", Type: " + this.getType() + ", Birthday: " + this.getBirthday() + "\n";
        }
    }
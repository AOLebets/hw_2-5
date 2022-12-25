package ObjectForQueries;

public class MaxProjectCountClient {
        private String name;
        private int projectCount;
        public void setName(String name) { this.name = name; }
        public void setProjectCount(int projectCount) { this.projectCount = projectCount; }
        public String getName() { return name; }
        public int getProjectCount() { return projectCount; }

        @Override
        public String toString() {
            return "Name: " + this.getName() + ", Project count: " + this.getProjectCount() + "\n";
        }
    }
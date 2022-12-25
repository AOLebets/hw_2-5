package ObjectForQueries;

public class LongestProject {
        private String projectName;
        private int projectDuration;
        public void setProjectName(String projectName) { this.projectName = projectName; }
        public void setProjectDuration(int projectDuration) { this.projectDuration = projectDuration; }
        public String getProjectName() { return projectName; }
        public int getProjectDuration() { return projectDuration; }

        @Override
        public String toString(){
            return "Project ID: " + this.getProjectName() + ", Project duration: " + this.getProjectDuration() + "\n";
        }
    }
package ObjectForQueries;

public class MaxSalaryWorker {
        private String name;
        private int salary;
        public void setName(String name) { this.name = name; }
        public void setSalary(int salary) { this.salary = salary; }
        public String getName() { return name; }
        public int getSalary() { return salary; }

        @Override
        public String toString(){
            return "Name: " + this.getName() + ", Salary: " + this.getSalary() + "\n";
        }
    }
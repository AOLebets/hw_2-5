package ObjectForQueries;

public class ProjectsAndPrices {
        private int id;
        private int price;
        public void setId(int id) { this.id = id; }
        public void setPrice(int price) { this.price = price; }
        public int getId() { return id; }
        public int getPrice() { return price; }

        @Override
        public String toString(){
            return "ProjectID: " + this.getId() + ", Price: " + this.getPrice() + "\n";
        }
    }
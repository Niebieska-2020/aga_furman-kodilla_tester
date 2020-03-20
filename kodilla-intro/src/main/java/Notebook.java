public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This is good price.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void checkWeight() {
        if(this.weight < 600) {
            System.out.println("This one is lightweight.");
        } else if(this.weight > 600 && this.weight < 1700) {
            System.out.println("This is not too heavy.");
        } else {
            System.out.println("This one is very heavy.");
        }
    }

    public void yearPrice() {
        if(this.price < 1000 && this.year < 2015) {
            System.out.println("This is old but price low.");
        } else if (this.price > 1000 && this.year > 2015) {
            System.out.println("Good price in a good production year.");
        }
    }
}

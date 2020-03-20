public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void printPriceCategory() {
        if (this.price < 600) {
            System.out.println("Very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("Good price.");
        } else {
            System.out.println("Expensive price.");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void printWeightCategory() {
        if(this.weight < 600) {
            System.out.println("Lightweight.");
        } else if(this.weight > 600 && this.weight < 1700) {
            System.out.println("Heavy.");
        } else {
            System.out.println("Very heavy.");
        }
    }

    public void printPriceComparisonToYear() {
        if(this.price < 1000 && this.year < 2015) {
            System.out.println("This is old but price low.");
        } else if (this.price > 1000 && this.year > 2015) {
            System.out.println("Good price in a good production year.");
        }
    }
}

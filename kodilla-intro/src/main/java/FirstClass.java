public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 990, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.printPriceCategory();
        notebook.printWeightCategory();
        notebook.printPriceComparisonToYear();

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.printPriceCategory();
        heavyNotebook.printWeightCategory();
        heavyNotebook.printPriceComparisonToYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.printPriceCategory();
        oldNotebook.printWeightCategory();
        oldNotebook.printPriceComparisonToYear();

        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(2100);
        if (isLeapYear) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is NOT a leap year.");
        }
    }
}

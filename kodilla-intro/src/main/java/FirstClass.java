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

        LeapYear leapYear1 = new LeapYear();
        boolean isLeapYear1 = leapYear1.isLeapYear1(2100);
        if (isLeapYear1) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is NOT a leap year.");
        }
        LeapYear leapYear2 = new LeapYear();
        boolean isLeapYear2 = leapYear2.isLeapYear2(2100);
        if (isLeapYear2) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is NOT a leap year.");
        }

        // wywolanie wyniku sumNumber z klasy Loops;
        Loops theResult = new Loops();
        int newTab[] = new int[]{4, 7, 10};
        int result = theResult.sumNumbers(newTab);
        System.out.println(result);
    }
}

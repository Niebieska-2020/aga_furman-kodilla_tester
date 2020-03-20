public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 990, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.yearPrice();

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.yearPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.yearPrice();

        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(2100);
        if (isLeapYear) {
            System.out.println("Przestępny");
        } else {
            System.out.println("Nie przestępny");
        }
    }
}

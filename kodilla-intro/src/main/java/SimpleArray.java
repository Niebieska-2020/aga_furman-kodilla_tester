public class SimpleArray {

    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Sylwia";
        name[1] = "Marcin";
        name[2] = "Piotr";
        name[3] = "Wiktoria";
        name[4] = "Michał";

        String myBuddy = name[3];
        System.out.println(myBuddy);

        int numberOFElements = name.length;
        System.out.println("Moja tablica zawiera" + " " + numberOFElements + " " + "elementów.");
    }
}


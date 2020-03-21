public class LeapYear {

    public boolean isLeapYear(int yearCheck) {
        return ((yearCheck % 4 == 0) || (yearCheck % 400 == 0)) && (yearCheck % 100 != 0);
    }

    public boolean isLeapYear2(int yearCheck) {

        if ((yearCheck % 4)!= 0) {
            System.out.println("This year is NOT a leap year.");
        } else if ((yearCheck % 100)!= 0) {
            System.out.println("This year is a leap year.");
        } else if ((yearCheck % 400)== 0) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is NOT a leap year.");
        }
        boolean b = false;
        return b;
    }
}
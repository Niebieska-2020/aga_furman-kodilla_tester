public class LeapYear {

    public boolean isLeapYear(int yearCheck) {

        return ((yearCheck % 4 == 0) || (yearCheck % 400 == 0)) && (yearCheck % 100 != 0);
    }
}

public class LeapYear {

    int yearCheck;
    boolean istrue;

    public LeapYear() {
        this.yearCheck = yearCheck;
    }

    public boolean isLeapYear1(int yearCheck) {
        return ((yearCheck % 4 == 0) || (yearCheck % 400 == 0)) && (yearCheck % 100 != 0);
    }

    public boolean isLeapYear2(int yearCheck) {
        if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
            return istrue = true;
        } else {
            return istrue = false;
        }
    }
}

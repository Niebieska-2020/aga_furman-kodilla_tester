public class LeapYear {

    int yearCheck;

    public LeapYear() {
        this.yearCheck = yearCheck;
    }

    public boolean isLeapYear1(int yearCheck) {
        return ((yearCheck % 4 == 0) || (yearCheck % 400 == 0)) && (yearCheck % 100 != 0);
    }

    public boolean isLeapYear2(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

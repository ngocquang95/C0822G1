package ss8_clean_code;

public class CleanCode {
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;

    // Trả về số ngày trong tháng
    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case APRIL:
            case 6:
            case 9:
            case 11:
                return 30;
            case FEBRUARY:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    /**
     * Kiểm tra năm nhuận
     * Chia hết cho 4 nhưng không chia hết cho 100
     * hoặc chia hết cho 400
     * <p>
     * Created: QuangNN
     *
     * @param year
     * @return true - Năm nhuận, false - ....
     */
    public boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }
}

package ss15_exception;

import ss15_exception.exception.Over18YearsOldException;

public class ExceptionStudy3 {
    public static void main(String[] args) {
        try {
            checkOver18(10);
        } catch (Over18YearsOldException e) {
            e.printStackTrace();
        }
        System.out.println("Chương trình kết thúc không lỗi lầm!!!");
    }

    public static void checkOver18(int age) throws Over18YearsOldException {
        if (age < 18) {
            throw new Over18YearsOldException("Bạn tuổi");
        }
    }
}

package ss8_clean_code.mvc.controller;

import ss8_clean_code.mvc.service.IStudentService;
import ss8_clean_code.mvc.service.impl.StudentService;

/**
 * M: Model Lớn = model nhỏ + Service
 * model nhỏ: Dữ liệu
 * Service: Nơi xử lý tất cả các nghiệp vụ
 *
 * v: View
 * + Kích hoạt controller
 *
 * C: Controller
 * + Điều hướng
 */
public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public void displayMenu() {
        int chose = 2;
        System.out.println("============= Menu =============");
        System.out.println("1. Thêm mới");
        System.out.println("2. Hiển thị danh sách");

        switch (chose) {
            case 1:
                break;
            case 2:
                iStudentService.display();
                break;
            //.........
        }
    }
}

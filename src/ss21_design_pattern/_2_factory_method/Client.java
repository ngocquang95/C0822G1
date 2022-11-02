package ss21_design_pattern._2_factory_method;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        Bank bank2 = BankFactory.getBank(BankType.VIETCOMBANK);

        System.out.println(bank.getBankName());
        System.out.println(bank2.getBankName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào loại thẻ: ");
        BankType bankType
                = BankType.valueOf(scanner.nextLine());

        System.out.println(BankFactory.getBank(bankType).getBankName());
    }
}

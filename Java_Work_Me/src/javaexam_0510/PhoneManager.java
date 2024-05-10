package javaexam_0510;

import java.util.Scanner;

public class PhoneManager {
	
	private Phone[] phones;

    public PhoneManager(int capacity) {
        phones = new Phone[capacity];
    }

    public void addPhone(int index, String name, String tel, String address) {
        phones[index] = new Phone(name, tel, address);
    }
    public void searchPhone(String name) {
        boolean found = false;
        for (Phone phone : phones) {
            if (phone != null && phone.getName().equals(name)) {
                System.out.println(phone.getName() + "의 번호와 주소는 " + phone.getTel() + ", " + phone.getAddress() + " 입니다.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + "은(는) 없습니다.");
        }
    }

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("인원수 >> ");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		PhoneManager manager = new PhoneManager(num);
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String[] input = scanner.nextLine().split(" ");
            manager.addPhone(i, input[0], input[1], input[2]);
		}
		System.out.println("저장되었습니다...");
		System.out.println();
	
		while(true) {
			System.out.print("검색할 이름 >>");
			String searchName = scanner.next();
			
			if(searchName.equals("exit")) break;
			
			manager.searchPhone(searchName);
		}
		System.out.println("프로그램을 종료합니다...");
	}

}

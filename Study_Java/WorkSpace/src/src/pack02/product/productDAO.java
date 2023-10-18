package pack02.product;

import java.util.Scanner;

public class productDAO {
		public void delete(ProductDTO[] dtos) {
			while(!userInput()) {
				System.out.println("입력 다시하나?");
				Scanner scan = new Scanner(System.in);
			}
			
			
			
			int choice = userInputNum("삭제 상품 번호 입력!")-1;
			//4 > 5
			if (choice < dtos.length) {
				
			}
			
		public void userInput() {
			System.out.println("삭제 상품 번호 입력");
			Scanner scan = new Scanner(System.in);
			try {
				int inputNum = Integer.parseInt(scan.nextLine());//오류 발생 코드 감지-> 예외 처리
			catch (Exception e) {
				System.out.println("오류 발생");
			}finally {
				scan.close();
			}
			public void find() {
				String str = new String("s:t:r객체");
				//문자열의 길이 : 몇 글자 이상 입력을 받아야할때.
				System.out.println(str.length());
				
				System.out.println(str.contains("객체"));
				System.out.println();
			}
			}
			
		}
		}
					}


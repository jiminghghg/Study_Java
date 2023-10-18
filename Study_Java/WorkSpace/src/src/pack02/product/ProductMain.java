package pack02.product;

public class ProductMain {
 public static void main(String[] args) {
	//prodctDTO를 하나 객체로 만들고 필드 전체에 값 할당 후 출력
	 ProductDTO dto = new ProductDTO();
	 dto.num = 1;
	 dto.name ="~~스카프";
	 dto.price = -6900;
	 System.out.println(dto.num + " . "+ dto.name + " : " + dto.price + "원");
	 
	
 }
	 //getter & setter
	 //get <- 외부로부터 접근이 안되는 필드의 변수값을 return
	 
 }
public class ProductDTO {
	private int num;
	private int price;//0->6900
	String name;
	//alt + shift + s 또는 
	//마우스 오른쪽 클릭 -> source -> getter & setter
	//                         -> 생성자 메소드
	//ProductDao 클스를 만듬.
	//display기능 추가래
	//->ProductDAO 클래스를 만듬.
	//display기능 추가
	//->ProductDTO를 입력받아 내부에 있는 속성을 전체 출력함.
	//Main에서 이용해서 내용 출력해보기
	private void syso() {
		// TODO Auto-generated method stub
       
	}
	
	
	
	
	
	
	
	
	
	
}
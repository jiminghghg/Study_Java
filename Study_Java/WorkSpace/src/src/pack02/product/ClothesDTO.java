package pack02.product;

public class ClothesDTO {
	private int num;
	private String name;
	private String addr;
	
public ClothesDTO() {}

public ClothesDTO(int num, String name,String addr) {
	this.num = num;
	this.name=name;
	this.addr=addr;
	
	}
public void setNum(int num) {
	this.num = num;
}

public static void main(String[] args) {
	ClothesDTO dto=new ClothesDTO();
	dto.setNum(0);
}

}





		
      
     
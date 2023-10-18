package product;

public class ProductDAO {
public static void main(String[] args) {
	

	public ProductDTO[] initItems() {
		ProductDTO[] dtos = new ProductDTO[3];
		dtos[0] = new ProductDTO(1000, 10, "마우스");
		dtos[1] = new ProductDTO(1900, 5 ,"키보드");
		dtos[2] = new ProductDTO(9000, 1, "스피커");
				return dtos;
	}

}
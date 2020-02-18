package sqlmapper;

import lombok.Data;

//접근자 메소드와 toString 메소드를 만들어주는 어노테이션
@Data
public class Good {
	private int code;
	private String name;
	private String manufacture;
	private int price;

}

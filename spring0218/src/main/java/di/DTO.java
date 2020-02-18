package di;

import lombok.Data;
import lombok.NonNull;

@Data
public class DTO {
	@NonNull
	private int num;
	private String name;

}

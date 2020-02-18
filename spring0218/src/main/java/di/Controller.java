package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean을 자동으로 생성해주는 어노테이션
@Component
public class Controller {
	@Autowired
	private Service service;
	
	public void insert() {
		service.insert();
	}

}

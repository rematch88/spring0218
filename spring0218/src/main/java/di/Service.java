package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	//서비스가 Dao를 사용
	@Autowired //Dao 클래스 타입의 bean이 있으면 자동으로 주입
	private Dao dao;
	
	public void insert() {
		dao.insert();
	}

}

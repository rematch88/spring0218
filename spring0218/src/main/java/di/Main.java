package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Spring Bean 설정 파일의 내용 가져오기
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:app.xml");
		
		Controller controller = context.getBean("controller", Controller.class);
		
		controller.insert();
		
		context.close();
	}

}

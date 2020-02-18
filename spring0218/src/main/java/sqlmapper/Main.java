package sqlmapper;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:mybatis.xml");
		//데이터베이스 연결 정보 가져오기
		SqlSession sqlSession = context.getBean("sqlSession", SqlSession.class);
		/*
		//전체 데이터를 가져오는 SQL을 호출
		List<Good> list = sqlSession.selectList("good.goodList");
		
		for(Good good : list) {
			System.out.println(good);
		}
		*/
		
		//code를 가지고 데이터를 찾아오는 SQL을 호출
		//code는 기본키 입니다.
		//code를 데이터를 조회하면 데이터는 없거나 1개만 조회됩니다.
		//selectOne은 해당하는 데이터가 없으면 null을 리턴
		
		/*
		Good good = sqlSession.selectOne("good.gooddetail", 1);
		System.err.println(good);
		
		good = sqlSession.selectOne("good.gooddetail", 4);
		System.err.println(good);
		*/
		
		/*
		//데이터를 삽입 하는 SQL을 호출
		//good.goodinsert 파라미터 타입은 Good
		
		Good good = new Good();
		good.setCode(4);
		good.setName("오징어");
		good.setManufacture("속초");
		good.setPrice(3000);
		
		int result = sqlSession.insert("good.goodinsert", good);
		
		//insert는 1이상이 리턴되면 삽입 성공
		if(result > 0) {
			System.err.println("삽입 성공");
		}else {
			System.err.println("삽입 실패");
		}
		*/

		/*
		Good good = new Good();
		good.setCode(5);
		good.setName("문어");
		good.setManufacture("주문진");
		good.setPrice(25000);
		
		int result = sqlSession.insert("good.goodupdate", good);
		
		//update는 1이상이 리턴되면 수정된 데이터가 있음
		//0이 리턴되면 조건에 맞는 데이터가 없어서 수정하지 않음
		//문제가 생기면 예외 발생
		if(result > 0) {
			System.err.println("수정 성공");
		}else {
			System.err.println("수정할 데이터가 없음");
		}		
		*/
		
		int result = sqlSession.delete("good.gooddelete", 3);
		//delete는 1이상이 리턴되면 삭제된 데이터가 있음
		//0이 리턴되면 조건에 맞는 데이터가 없어서 삭제하지 않음
		//문제가 생기면 예외 발생
		if(result > 0) {
			System.err.println("삭제 성공");
		}else {
			System.err.println("삭제할 데이터가 없음");
		}		

		
		context.close();

	}

}

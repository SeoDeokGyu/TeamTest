package egovframework.example.exam4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class B {

//	@Log4j2
	@Controller  // 1번째 누락된 거 컨트롤러 없었습니다. 이 클래스가 스프링MVC의 컨트롤러 라는걸 알리는겁니다.
	public class DeptController {
//	        서비스 가져오기
//			@Autowired // 2번째 누락된 거 오토와일드 없었습니다. 서비스 객체를 스프링이 자동으로 연결시켜줘야합니다.
//	        private DeptService deptService; 
//	...
	}
}

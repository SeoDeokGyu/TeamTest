/**
 * 
 */
package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface EmpService {
   List<?> selectEmpList(Criteria criteria); // 전체 조회
   int selectEmpListTotCnt(Criteria criteria); 	// 총 개수 구하기
   int insert(EmpVO empVO);								// 부서 인서트
   EmpVO selectEmp(int eno);                 		    // 상세조회
   int update(EmpVO empVO);
   int delete(EmpVO empVO);                  			    // delete 메소드
}

/**
 * 
 */
package egovframework.example.faq.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface FaqService {
	List<?> selectFaqList(Criteria criteria);			//전체 조회
	 int selcectFaqListTotCnt(Criteria criteria);		//총 개수 구하기
	 int insert(FaqVo faqVO);										// insert
	 FaqVo selectFaq(int fno);									// 상세조회

}

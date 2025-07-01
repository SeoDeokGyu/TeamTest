/**
 * 
 */
package egovframework.example.faq.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqVo;


/**
 * @author user
 *
 */
@Mapper
public interface FaqMapper {
	public List<?> selectFaqList(Criteria criteria);			//전체 조회
	public int selcectFaqListTotCnt(Criteria criteria);		//총 개수 구하기
	public int insert(FaqVo faqVO);										// insert
	public FaqVo selectFaq(int fno);									// 상세조회

}

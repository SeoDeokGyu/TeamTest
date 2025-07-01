/**
 * 
 */
package egovframework.example.faq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqService;
import egovframework.example.faq.service.FaqVo;

/**
 * @author user
 *
 */
@Service
public class FaqServiceImpl implements FaqService{
		@Autowired
		FaqMapper faqMapper;

		@Override
		public List<?> selectFaqList(Criteria criteria) {
			// TODO Auto-generated method stub
			return faqMapper.selectFaqList(criteria);
		}

		@Override
		public int selcectFaqListTotCnt(Criteria criteria) {
			// TODO Auto-generated method stub
			return faqMapper.selcectFaqListTotCnt(criteria);
		}

		@Override
		public int insert(FaqVo faqVO) {
			// TODO Auto-generated method stub
			return faqMapper.insert(faqVO);
		}

		@Override
		public FaqVo selectFaq(int fno) {
			// TODO Auto-generated method stub
			return faqMapper.selectFaq(fno);
		}
		
		
}

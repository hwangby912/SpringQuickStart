package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String args[]) {
		// 1. Spring Container를 구동한다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container로부터 BoardServiceImpl 객체를 Lookup 한다
		BoardService boardService = (BoardService) context.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목(1)");
		vo.setWriter("마이콜");
		vo.setContent("임시 내용(1)...........");
		boardService.insertBoard(vo);
		
//		System.out.println(vo.getSeq());
		
		// 4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("===> " + board.toString());
		}
		
		// 5. Container 닫기
		context.close();
	}
}

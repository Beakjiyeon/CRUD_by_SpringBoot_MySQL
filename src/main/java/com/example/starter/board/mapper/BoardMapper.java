package com.example.starter.board.mapper;

import org.springframework.stereotype.Repository;

@Repository("com.example.starter.board.mapper.BoardMapper")
public interface BoardMapper {
	public int boardCount() throws Exception;

}

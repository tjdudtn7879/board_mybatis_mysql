package com.lgy.board_mybatis_mysql.dao;

import java.util.ArrayList;

import com.lgy.board_mybatis_mysql.dto.BoardDTO;

public interface BoardDAO {
	public ArrayList<BoardDTO> list();
	public void write(String boardName, String boardTitle, String boardContent);
	public BoardDTO contentView(String strID);
//	public void upHit(String boardNo); 생략
	public void modify(String boardNo, String boardName, String boardTitle, String boardContent);
	public void delete(String strID);
	
	/*
	JdbcTemplate template=null;
	
	public BoardDAO() {
		template=Constant.template;
	}
	
	public ArrayList<BoardDTO> list() {
		return (ArrayList<BoardDTO>) template.query("select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board", new BeanPropertyRowMapper(BoardDTO.class));
		
	}
	
	
	public void write(String boardName, String boardTitle, String boardContent) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql="insert into tbl_board(boardName, boardTitle, boardContent, boardHit) "
						+ "values(?,?,?,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, boardName);
				pstmt.setString(2, boardTitle);
				pstmt.setString(3, boardContent);
				return pstmt;
			}
		});
	}
	
	
	public BoardDTO contentView(String strID) {
		upHit(strID);
		
		String sql="select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board where boardNo="+strID;
		return (BoardDTO)template.queryForObject(sql, new BeanPropertyRowMapper<BoardDTO>(BoardDTO.class));
		
	}
	
	
	public void upHit(String boardNo) {
		String sql="update tbl_board set boardHit=boardHit+1 where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(boardNo));
			}
		});
	}
	
	public void modify(String boardNo, String boardName, String boardTitle, String boardContent) {
		String sql="update tbl_board set boardName=?, boardTitle=?, boardContent=? where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, boardName);
				ps.setString(2, boardTitle);
				ps.setString(3, boardContent);
				ps.setInt(4, Integer.parseInt(boardNo));
			}
		});
		
	}
	
	public void delete(String strID) {
		String sql="delete from tbl_board where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strID));
			}
		});
		
	}
*/	
}

















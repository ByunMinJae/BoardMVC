package dto;

import java.sql.Date;

public class Board {
	
	private int boardno;
	private String title;
	private String content;
	private Date insertdat;
	private Date updatedat;
	private int userno;
	
	public Board() {}

	public Board(int boardno, String title, String content, Date insertdat, Date updatedat, int userno) {
		super();
		this.boardno = boardno;
		this.title = title;
		this.content = content;
		this.insertdat = insertdat;
		this.updatedat = updatedat;
		this.userno = userno;
	}

	@Override
	public String toString() {
		return "Board [boardno=" + boardno + ", title=" + title + ", content=" + content + ", insertdat=" + insertdat
				+ ", updatedat=" + updatedat + ", userno=" + userno + "]";
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getInsertdat() {
		return insertdat;
	}

	public void setInsertdat(Date insertdat) {
		this.insertdat = insertdat;
	}

	public Date getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}
	
}

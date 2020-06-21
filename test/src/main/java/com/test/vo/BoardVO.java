package com.test.vo;

import java.util.Date;

public class BoardVO {

	private int idx;
	private String title;
	private String content;
	private String writer;
	private Date regDt;
	private String regStr;
	private int viewCnt;
	
	public BoardVO() {}

	public BoardVO(int idx, String title, String content, String writer, Date regDt, int viewCnt) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDt = regDt;
		this.viewCnt = viewCnt;
	}
	
	
	public BoardVO(int idx, String title, String content, String writer, Date regDt, String regStr, int viewCnt) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDt = regDt;
		this.regStr = regStr;
		this.viewCnt = viewCnt;
	}

	public String getRegStr() {
		return regStr;
	}

	public void setRegStr(String regStr) {
		this.regStr = regStr;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDt="
				+ regDt + ", viewCnt=" + viewCnt + "]";
	}
	
}

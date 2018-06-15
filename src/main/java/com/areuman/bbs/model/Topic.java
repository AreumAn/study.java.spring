package com.areuman.bbs.model;

import java.sql.Timestamp;

public class Topic {
	int topicID;
    String category;
    String title;
    String description;
    String writer;
    Timestamp createDate;
    Timestamp modifyDate;
    int hit;
    boolean email_check;
    
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public boolean isEmail_check() {
		return email_check;
	}
	public void setEmail_check(boolean email_check) {
		this.email_check = email_check;
	}
	@Override
	public String toString() {
		return "Category [topicID=" + topicID + ", category=" + category + ", title=" + title + ", description="
				+ description + ", writer=" + writer + ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ ", hit=" + hit + ", email_check=" + email_check + "]";
	}
	
	
	

}

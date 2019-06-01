package com.java.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Message implements Externalizable{
	private Integer id;//10
	private String title;
	private String content;
	private String createdTime;
	//
	@Override
	public void writeExternal(ObjectOutput out) 
			throws IOException {
		out.writeInt(id);
		out.writeUTF(title);
		out.writeUTF(content);
		out.writeUTF(createdTime);
		
	}
	@Override
	public void readExternal(ObjectInput in) 
			throws IOException, ClassNotFoundException {
		id=in.readInt();
		title=in.readUTF();
		content=in.readUTF();
		createdTime=in.readUTF();
		 
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", title=" + title + ", content=" + content + ", createdTime=" + createdTime + "]";
	}
	
	
}

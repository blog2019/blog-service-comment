package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@GeneratedValue(generator = "system-uuid")
	private String id;
	@Column(nullable = false)
	private String creatorId;
	@Column(nullable = false)
	private String blogId;
	@Column(nullable = false)
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastUpdateTs;

	public Comment() {
		super();
	}
	
	public Comment(String id, String creatorId, String blogId, String content, Date createTs, Date lastUpdateTs) {
		super();
		this.id = id;
		this.creatorId = creatorId;
		this.blogId = blogId;
		this.content = content;
		this.createTs = createTs;
		this.lastUpdateTs = lastUpdateTs;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getLastUpdateTs() {
		return lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
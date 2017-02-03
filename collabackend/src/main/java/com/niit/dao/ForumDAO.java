package com.niit.dao;

import java.util.List;

import com.niit.model.Forum;

public interface ForumDAO {

    public boolean save(Forum forum); 
	
	public boolean update(Forum forum);
	
	public boolean delete(int forumID);
	
	public Forum get(int forumID);
	
	
	
	public List<Forum> list();

}

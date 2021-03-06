package com.sshpobject.dao;

import java.util.List;

import com.sshpobject.model.User;
import com.sshpobject.model.UserGroup;
import com.sshpobject.model.UserOrganization;

public interface UserDao {
	public void doRegister(User user);
	public List<User> doLogin(User user);
	public List<User> detailMe(User user);
	public List<UserOrganization> detailUser(User user);
	public List<User> searchUser(String key);
	public List<UserGroup> searchUserGroup(String key);
	public void deleteUser(User user);
}

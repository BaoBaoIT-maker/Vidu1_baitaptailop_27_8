package project_27_8_vidu1.controllers.dao;

import project_27_8_vidu1.controllers.models.User;

public interface UserDao {
	User get(String username);
	void insert(User user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}

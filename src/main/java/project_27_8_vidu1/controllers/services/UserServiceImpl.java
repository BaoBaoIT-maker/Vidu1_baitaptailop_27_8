package project_27_8_vidu1.controllers.services;

import project_27_8_vidu1.controllers.dao.UserDao;
import project_27_8_vidu1.controllers.dao.UserDaoImpl;
import project_27_8_vidu1.controllers.models.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String username, String password) {
        User user = userDao.get(username);
        if (user != null && user.getPassWord().trim().equals(password.trim())) {
            return user;
        }
        return null;
    }
}

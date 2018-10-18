package eci.cosw.data.service;

import eci.cosw.data.model.LoginUser;
import eci.cosw.data.model.LoginUser;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface UserService
{
    List<LoginUser> getUsers();

    LoginUser getUser(Long id);

    LoginUser createUser(LoginUser user);

    LoginUser findUserByEmail(String email);

    LoginUser findUserByEmailAndPassword(String email, String password);
}
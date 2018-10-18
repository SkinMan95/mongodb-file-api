package eci.cosw.data.service;

import eci.cosw.data.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl implements UserService
{

    private List<LoginUser> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        users.add( new LoginUser( "test@mail.com", "password", "Andres", "Perez" ) );
    }


    @Override
    public List<LoginUser> getUsers()
    {
        return users;
    }

    @Override
    public LoginUser getUser(Long id ) // Todo
    {
        return users.get( 0 );
    }

    @Override
    public LoginUser createUser( LoginUser user )
    {
        return users.get( 0 );
    }

    @Override
    public LoginUser findUserByEmail( String email )
    {
        return users.get( 0 );
    }

    @Override
    public LoginUser findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }

}

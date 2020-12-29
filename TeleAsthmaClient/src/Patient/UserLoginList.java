/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class UserLoginList implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<UserLogin> usersLogin = new ArrayList();

    public UserLoginList() {
    }

    public ArrayList<UserLogin> getUsersLogin() {
        return usersLogin;
    }

    public void setUsersInfo(ArrayList<UserLogin> usersLogin) {
        this.usersLogin = usersLogin;
    }
    
    public void addUserInfo(UserLogin usersLogin){
        this.usersLogin.add(usersLogin);
    }
    
    public void deleteUserInfo(UserLogin usersLogin){
        this.usersLogin.remove(usersLogin);
    }
    
    
}

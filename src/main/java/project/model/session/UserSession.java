package model.session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jframework.session.UserAuthSession;

public class UserSession implements UserAuthSession{
    public String[] roles;
    @Override
    public String[] getRoles() {
        return roles;
    }

    @Override
    public boolean isAuthentified() {
        if (roles != null) 
            return true;
        return false;
    } 

    @Override
    public void setRole(String role) {
        List<String> rolesList = new ArrayList<>();
        
        if (roles != null) {
            rolesList.addAll(Arrays.asList(roles));
        }
        
        if (role != null && !rolesList.contains(role)) {
            rolesList.add(role);
        }
        
        roles = rolesList.toArray(new String[0]);
    }

    @Override
    public boolean isAuthentifiedRole(String role) {
        if (this.roles == null) 
            return false;
        for (String string : roles) {
            if (role.compareToIgnoreCase(string) == 0) {
                return true;
            }
        }
        return false;
    }
    
}

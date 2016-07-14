package demo;

import com.opensymphony.xwork2.ActionSupport;  //use ActionSupport.class in this package


public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Define method execute()
    public String execute() {
        System.out.println("LoginAction..");
        if (getUsername().equals("admin") && getPassword().equals("admin")) {
            return "success";
        } else {
            return "error";
        }

    }

}
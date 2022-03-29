package com.syntax;
//1.Create Registration Class in which you would have
//variables as email, userName and password that
//have an access scope only within its own class. After
//creating an object of the class user should be able to
//call methods and in each method separately pass
//values to set users email, username and password.
//Requirements:
//A.Valid email consider to be only yahoo
//B.Valid userName and password cannot be empty and
//should be of length larger than 6 characters.
// Also valid password cannot contain userName.

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Valid email consider to be only yahoo");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Valid username cannot be empty and should be more than 6 characters");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Valid password cannot contain username, password cannot be empty and should be more than 6 characters ");
        }
    }

    @Override
    public String toString() {
        return "Registeration{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class TestRegisteration {
    public static void main(String[] args) {
       Registration registeration = new Registration();
        //registeration.email="syntax@yahoo.com";   'email' has private access
        registeration.setEmail("lillysea@yahoo.com");
        registeration.setUserName("yoyCanDoThis");
        registeration.setPassword("yesYouCanLilly");
        System.out.println(registeration.toString());


    }

}


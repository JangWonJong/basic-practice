package com.bitcamp.web.test;

public class LoginApp {
    public static String website = "Naver";
    private String id;
    private String pw;
    private String name;

    public String login(String idParam, String pwParam, String nameParam){
        id = idParam;
        pw = pwParam;
        name = nameParam;
        return "ID : " + id +", PW: "+ pw +",Name :" +name;

    }


}

package com.example.duy.login_mvp.Prsenter;

import com.example.duy.login_mvp.view.ViewLogin;

/**
 * Created by duy on 26/10/2017.
 */

public class Presenterlogin implements PresenterLogicLogin{
    ViewLogin viewLogin;

    public Presenterlogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    @Override
    public void kdiemtraangnhap(String email, String password) {
        if (email.equals("duy") && password.equals("1")){
            viewLogin.loginsuccess();
        }
        else {
            viewLogin.loginerorr();
        }
    }
}

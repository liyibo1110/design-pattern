package com.github.liyibo1110.design.pattern.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        // 生成各个Colleague
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()) { // Guest mode
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else { // Login mode
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    /**
     * 当输入框发生变化，判断各Colleague的启用/禁用状态
     */
    private void userpassChanged() {
        if(textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            }else {
                buttonOk.setColleagueEnabled(false);
            }
        }else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
}

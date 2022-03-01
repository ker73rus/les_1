package com.example.les_1.javapack;

import org.jetbrains.annotations.NotNull;

abstract class Action {
    public final class Login extends Action{
        User user;

        public Login(@NotNull User user ){
            this.user = user;
        }
    }

    public final class Logout extends Action{

    }

    public final class Registration extends Action{

    }

}

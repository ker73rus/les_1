package com.example.les_1

abstract class Action {
    class Login(val user: User): Action()
    class Logout: Action()
    class Registration: Action()
}
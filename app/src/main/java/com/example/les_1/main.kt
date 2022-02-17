package com.example.les_1

import java.lang.Exception

open  class test{
    val UlyanovskHistory:Book = Book(85,6900)
    val AboutCupOfTea:Book = Book(100, 986)
    val CarsAndRacing:Magazine = Magazine(250, 1500)

}
fun main(){
    val output = test()
    print("История Ульяновска\n")
    print("Количество слов = "+ output.UlyanovskHistory.wordCount + "\n")
    print("Цена = "+ output.UlyanovskHistory.price + "\n")
    print("Тип = "+ output.UlyanovskHistory.getType() + "\n")

    print("О крушке чая\n")
    print("Количество слов = "+ output.AboutCupOfTea.wordCount + "\n")
    print("Цена = "+ output.AboutCupOfTea.price + "\n")
    print("Тип = "+ output.AboutCupOfTea.getType() + "\n")

    print("Машины и гонки\n")
    print("Количество слов = "+ output.CarsAndRacing.wordCount + "\n")
    print("Цена = "+ output.CarsAndRacing.price + "\n")
    print("Тип = "+ output.CarsAndRacing.getType() + "\n")

    print("\n\n\n   equals Book:\n")
    output.UlyanovskHistory.equals(output.AboutCupOfTea)
    print("\n\n\n")


    val book1 =  null
    val book2 =  Book(500,9000)
    print("Ненулевая переменная ")
    buy(book2)
    print("нулевая переменная ")
    buy(book1)
    print("\n\n\n")

    var sum = {first:Int, second:Int ->
        first+second
    }
    print("Sum(25,25) = " + sum(25,25))
    print("\n\n\n")
    val nikolay = User(101,"Николай",18,Type.FULL)
    print("Время создания user ${nikolay.startTime}\n")
    Thread.sleep(1000)
    print("Время создания user ${nikolay.startTime}\n" )

    val users = mutableListOf(nikolay)
    val alexander = User(102,"Алксандр",22,Type.FULL)
    val mihail = User(103,"Михаил",23,Type.FULL)
    val kirill = User(104,"Кирилл",18,Type.DEMO)
    users.apply {
        val newUsers = mutableListOf(alexander,mihail,kirill)
        addAll(newUsers)
    }
    val usersFULL = mutableListOf<User>()
    users.run {
        users.forEach(){
            if(it.type == Type.FULL){
                usersFULL.add(it)
            }
        }
    }
    print("\n\n\n")
    val usersName = mutableListOf<String>()
    users.run{
        users.forEach{
            usersName.add(it.name)
        }
    }
    val firstname = usersName.first()
    val lastname = usersName.last()
    print("Имя первого ${firstname} \n")
    print("Имя последнего ${lastname} \n")
    print("\n\n\n")


}
val callback =  object:AuthCallback {
    override fun authFailed() {
        print("Auth провалена")
    }

    override fun authSuccess() {
        print("Auth прошла успешно")
    }
}
fun updateCache(){

}



inline fun auth(updateCache:() -> Unit, user: User){
    user.adult()
    callback.authSuccess()
    updateCache()
}


fun User.adult(){
    if(this.age < 18){
        throw Exception()
    }
    else
        print("All is OK")
}


fun buy(publication: Publication?){

    print("The purchase is complete. The purchase amount was ${publication?.price} \n")
}









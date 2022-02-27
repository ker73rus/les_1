package com.example.les_1

fun main() {
    val UlyanovskHistory = Book(85, 6900)
    val AboutCupOfTea = Book(100, 986)
    val CarsAndRacing = Magazine(250, 1500)

    print("История Ульяновска\n")
    print("Количество слов = " + UlyanovskHistory.wordCount + "\n")
    print("Цена = " + UlyanovskHistory.price + "€\n")
    print("Тип = " + UlyanovskHistory.getType() + "\n\n")

    print("О чашке чая\n")
    print("Количество слов = " + AboutCupOfTea.wordCount + "\n")
    print("Цена = " + AboutCupOfTea.price + "€\n")
    print("Тип = " + AboutCupOfTea.getType() + "\n\n")

    print("Машины и гонки\n")
    print("Количество слов = " + CarsAndRacing.wordCount + "\n")
    print("Цена = " + CarsAndRacing.price + "€\n")
    print("Тип = " + CarsAndRacing.getType() + "\n\n")

    print("\n\n\n equals Book: \"История Ульяновск\" vs \"О чашке чая\"\n")
    println(UlyanovskHistory === AboutCupOfTea)
    println(UlyanovskHistory.equals(AboutCupOfTea))
    print("\n\n\n")


    val book1: Book? = null
    val book2: Book? = Book(500, 9000)
    print("Ненулевая переменная: ")
    buy(book2)
    print("нулевая переменная: ")
    buy(book1)
    print("\n\n\n")

    var sum = { first: Int, second: Int ->
        first + second
    }
    print("Sum(25,25) = " + sum(25, 25))
    print("\n\n\n")


    val nikolay = User(101, "Николай", 18, Type.FULL)
    print("1. Время создания user ${nikolay.startTime}\n")
    Thread.sleep(1000)
    print("2. Время создания user ${nikolay.startTime}\n")

    val users = mutableListOf(nikolay)
    val alexander = User(102, "Алксандр", 22, Type.FULL)
    val mihail = User(103, "Михаил", 23, Type.FULL)
    val kirill = User(104, "Кирилл", 18, Type.DEMO)
    users.apply {
        val newUsers = mutableListOf(alexander, mihail, kirill)
        addAll(newUsers)
    }
    val usersFULL = mutableListOf<User>()
    users.forEach() {
        if (it.type == Type.FULL) {
            usersFULL.add(it)
        }
    }

    print("\n\n\n")
    val usersName = mutableListOf<String>()
    users.forEach {
        usersName.add(it.name)
    }

    val firstname = usersName.first()
    val lastname = usersName.last()
    print("Имя первого ${firstname} \n")
    print("Имя последнего ${lastname} \n")
    print("\n\n\n")
    doAction(Action.Registration())
    doAction(Action.Login(User(users.last().id + 1, "Roman", 19, Type.DEMO)))
    doAction(Action.Logout())

}

fun doAction(action: Action) {

    when (action) {
        is Action.Registration -> print("Registration in process\n")
        is Action.Logout -> print("Logout in process\n")
        is Action.Login -> {
            val login: Action.Login = action
            print("Login is started\n")
            auth({ print("Кэша пока не реализован\n")}, login.user)
        }
    }
}
val callback =  object:AuthCallback {
    override fun authFailed() {
        print("Auth провален\n")
    }

    override fun authSuccess() {
        print("Auth успешно\n")
    }
}

inline fun auth(updateCache: () -> Unit, user: User) {
    try {
        user.adult()
        callback.authSuccess()
        updateCache()
    } catch (e: Exception) {
        callback.authFailed()
        updateCache()
    }
}

fun User.adult() {
    if (age < 18) {
        throw Exception()
    } else
        print("All is OK\n")
}

fun buy(publication: Publication?) {

    print("The purchase is complete. The purchase amount was ${publication?.price} \n")
}








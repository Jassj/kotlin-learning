fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    return a + b
}

fun min(a: Int, b: Int) = Math.min(a, b)

fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
    println()
}

fun strTemplate() {
    var a = 1

    // 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2);
}

fun constantAndVariable() {
    val a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int
    println(b.javaClass.name)
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值
    println(a)
    println(b)
    println(c)

    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改
    println(x)
}

fun nepCheck() {
    // 类型后面加?表示可为空
    var age: String? = "23"
    println(age)
    // 抛出空指针异常
    val ages = age!!.toInt()
    println(ages)
    // 安全调用
    val ages1 = age?.toInt()
    println(ages1)
    // age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(ages2)
}

fun cast() {
    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // OK
    println(i)
}

fun getStringLength(obj: Any): Int? {
    // is 类似 java 中的 instance
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }

    //在这里还有一种方法，与Java中instanceof不同，使用!is
    // if (obj !is String){
    //   // XXX
    // }

    // 这里的obj仍然是Any类型的引用
    return null
}

fun range() {
    print("循环输出: ")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长: ")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo: ")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until: ")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")
}

fun array() {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4] Todo 语法含义
    val b = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])
}

fun compare() {
    val a: Int = 10000
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等
}

fun main() {
    println(sum(1, 2))
    println(min(1, 2))
    vars(1, 2, 3, 4, 5)  // 输出12345
    strTemplate()
    constantAndVariable()
    nepCheck()
    val length = getStringLength("111")
    println(length)
    range()
    compare()
    cast()
    array()
}
fun condition() {
    var x = 0
    if (x > 0) {
        println("x 大于 0")
    } else if (x == 0) {
        println("x 等于 0")
    } else {
        println("x 小于 0")
    }

    var a = 1
    var b = 2
    val c = if (a >= b) a else b
    println("c 的值为 $c")
}

fun whenClause() {
    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }
}

fun iterator() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileClause() {
    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println( x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while (y > 0)
}

fun main() {
    condition()
    whenClause()
    iterator()
    whileClause()
}
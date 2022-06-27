import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val time = readLine()!!.toInt()

    for (i in 1..time) {
        findPoint()
    }
}

fun findPoint() {
    readLine()!!.split(' ').map {
        it.toDouble()
    }.let {
        (x1, y1, r1, x2, y2, r2) ->
        val distance = sqrt((x1-x2).pow(2) + (y1-y2).pow(2))
        when {
            distance == 0.0 && r1 == r2 -> println(-1)
            distance > r1+r2 || distance < abs(r1 - r2) || (distance == 0.0 && r1 != r2) -> println(0)
            distance == r1 + r2 || distance == abs(r1 - r2) -> println(1)
            distance < r1 + r2 || distance > abs(r1 - r2) -> println(2)
        }

    }
}

private inline operator fun<T> List<T>.component6(): T {
    return get(5)
}
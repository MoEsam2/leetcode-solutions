class Solution {
fun isHappy(n: Int): Boolean {
    var str = n.toString()
    val tab = mutableMapOf<String, Int>()
    while (!tab.containsKey(str)) {
        println(str)
        tab[str] = 0
        if (str == "1") return true
        if (str.length == 1) str = ((str.toInt()) * (str.toInt())).toString()
        else {
            var num = 0
            str.forEach {
                num += (it.digitToInt() * it.digitToInt())
            }
            str = num.toString()

        }

    }
    return false
}
}
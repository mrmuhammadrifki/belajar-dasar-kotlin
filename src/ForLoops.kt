fun main() {
    val names = arrayOf("Muhammad", "Rifki", "Silva", "Septika", "Sari")

    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println(total)

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("Index ke $i = ${names[i]}")
    }
}
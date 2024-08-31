fun main() {

    val names: Array<String> = arrayOf("Rifki", "Aris", "Rayhan")

    names.set(0, "Agung")
    println(names[0])

    val nilai: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
    println(nilai[3])
    println(nilai[4])

    val members: Array<String?> = arrayOfNulls(10)
    members[0] = "Arif"
    members[1] = "Arif"
    members[2] = "Arif"
    members[3] = "Arif"
    members[4] = "Arif"
    println(members[0])
}

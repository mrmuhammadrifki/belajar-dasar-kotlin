fun main() {
    val age: Byte = 30

    val sample: Float = 10.0F

    println(age)
    println(sample)

    val binary: Int = 0b10101010
    println(binary)

    val price: Long = 9_000_000_000L
    println(price)

    val priceInt: Int = price.toInt()
    println(priceInt)

    val binaryDouble: Double = binary.toDouble()
    println(binaryDouble)
}
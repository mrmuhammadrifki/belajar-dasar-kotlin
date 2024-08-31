fun main() {
    val firstName: String = "Muhammad"
    val lastName: String = "Rifki"

    val address: String = """
        >Desa Alat, RT. 001 RW. 001,
        >Kecamatan Hantakan,
        >Kabupaten Hulu Sungai Tengah,
        >Provinsi Kalimantan Selatan
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    val fullName: String = "$firstName $lastName"
    println(fullName)

    val desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}
fun main () {

    val animals: MutableList<Animals> = mutableListOf<Animals>()

    val wolf = EATING_MEAT("Волк - ", "плотоядное животное, которое ", "живет в лесу, ", "в стае.")
    val lion = EATING_MEAT("Лев - ", "плотоядное животное, которое ", "живет в cаванне, ", "в стае.")
    val hamster = NOT_EATING_MEAT("Хомяк - ", "травоядное животное, которое ", "живет в степи и ", "пищит.")
    val elephant = NOT_EATING_MEAT("Cлон - ", "травоядное животное, которое ", "живет в cаванне и ", ",в основном, молчит.")

    animals.add(wolf)
    animals.add(lion)
    animals.add(hamster)
    animals.add(elephant)

    println(animals)
}
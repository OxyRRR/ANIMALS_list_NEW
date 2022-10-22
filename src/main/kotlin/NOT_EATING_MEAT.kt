class NOT_EATING_MEAT (name: String, food: String, habitat: String, var makeNoise: String) : Animals (name, food, habitat) {

    override fun toString(): String {
        return "EatingGrass(makeNoise='$makeNoise' ${super.toString()})"
    }
}
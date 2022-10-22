class EATING_MEAT (name: String, food: String, habitat: String, var commandWork: String) : Animals (name, food, habitat) {

        override fun toString(): String {
            return "EatingMeat(commandWork='$commandWork' ${super.toString()})"
        }
}
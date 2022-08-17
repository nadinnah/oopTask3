class Tesla(model:String, colour: String, speed: Int): Car(model, colour, speed) {
    override fun getFuelType(): String {
       return "electrical fuel"
    }
}
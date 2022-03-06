import java.util.*

fun main(){
   Fruits(arrayOf("Kiwi", "SweetMelon", "Apple", "Strawberry"))
    myAdventure()
    mathematic()
    identity(arrayOf("Yusuf", "Amina", "Conslate"))


}

fun Fruits(name: Array<String>) {
    println(name.contentToString())

}

fun myAdventure() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jarkata")
    cities.forEach { Con ->
        println(Con.capitalize())

    }
}

fun mathematic() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var w =  numbers[1] + numbers[4]
    println(w)

    var index = numbers.indexOf(158)
    println(index)

    var ascending =  numbers.sortedArray()
    println(Arrays.toString(ascending))

}

fun identity(name:Array<String>): Array<String> {
    var names2 = name
    println(name.contentToString())
    return names2





}






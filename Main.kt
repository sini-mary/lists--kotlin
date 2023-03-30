fun main() {
var names= indices(listOf("Pluto", "Venus", "Mars", "Mercury", "Earth", "Saturn", "Neptune", "Jupiter","Makemake"))
    println(names)
    var a = calculateHeight(listOf(150.0,140.9,130.0))
    println(a)


    val cars = calculateAverageMileage(listOf(
        Car("ABC123", 10000.0),
        Car("DEF456", 5000.0),
        Car("GHI789", 20000.0)
    ))

    println(cars)



}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc

fun indices(names: List<String>): List<String>{
    val newList = mutableListOf<String>()
    names.forEachIndexed { index, s -> if (index %2 ==0)  newList.add(s) }
    return newList
}


//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun calculateHeight(heights: List<Double>): Pair<Double, Double> {
    var total = 0.0
    for (height in heights) {
        total += height
    }
    val average = total / heights.size
    return Pair(average, total)
}


//. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
// Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
 data class Person(var name: String , var age: Int , var height: Double ,var weight : Double){
fun order (people: List<Person>){

    var sort= people.sortedByDescending{ m -> m.age }
    println(sort)


}






}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration: String, var mileage: Double)

fun calculateAverageMileage(cars: List<Car>): Double {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage / cars.size


}





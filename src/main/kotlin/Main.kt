import jdk.jfr.Description

fun main() {
  println(nums( listOf("boy", "went", "to", "school", "late")))
   println(personheights(listOf(1.9, 2.3, 2.2, 3.2, 1.3, 3.4, 3.22, 2.4, 1.95, 1.67, 2.54 )))

    Description()
    addpeople()

    var carList = listOf(
        Car("AUD123",174.0),
        Car("Bwx2t",06.0),
        Car("KRE235",349.0),
        Car("bmw67",49.0),
    )
    println(registrationMileage(carList))
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices
fun nums(numbers:List<String>):List<String> {
    var evenList = listOf<String>()
    for (x in numbers) {
        if (numbers.indexOf(x) % 2 == 0) {
            evenList += x
        }
    }
    return evenList
    }


//Given a list of people's heights in metres.
// Write a function that returns the average and the total height.


    data class PersonHeight(var totalheight: Double, var averageHeight: Double)
    fun personheights(height: List<Double>): PersonHeight {
        val totalheight = height.sum()
        val averageHeight = height.average()
        var both = PersonHeight(averageHeight, totalheight)
        return both

    }

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
 data class Person(var Name:String,var Age:Int,var Height:Double,var Weight:Double)
fun Description() {
    val one = Person("Brenda", 10, 3.5, 28.0)
    val two = Person("Liz", 29, 5.9, 67.0)
    val three = Person("Vkey", 22, 5.5, 57.0)

    var Person = listOf(one, two, three)
    var results = Person.sortedByDescending { Person -> Person.Age }
    println(results)
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addpeople() {
    var four = Person("Rosa", 50, 7.0, 70.0)
    var five = Person("bernard", 62, 7.3, 78.0)

    println(listOf(four, five))
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car( var registration: String, var mileage: Double)
fun registrationMileage(carList: List<Car>): Double {
    var sumMileage = 0.0
    for (x in carList){
        sumMileage += x.mileage
    }

    return sumMileage/carList.size
}
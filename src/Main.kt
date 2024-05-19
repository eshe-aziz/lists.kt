//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    food()
    println(addition(mutableListOf(82, 3, 76, 83, 16)))
    println(add(mutableListOf(23, 43, 66, 77, 22, 33, 54, 89, 91)))
    println(listOfIntegers(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    foods()

    val contact1 = Contact("Mary", "0700000001", "mary@gmail.com")
    val contact2 = Contact("Dan", "0712345678", "dan22@gmail.com")
    val contact3 = Contact("Nyabang", "0789898989", "nyabang2024@hotmmail.com")
    val myContacts = listOf(contact1, contact2, contact3)
    println(myContacts)
    val sortedContacts = myContacts.sortedBy { contact -> contact.name }
    println(sortedContacts)

    val contact4 = Contact("Nancy", "0712345678", "nabacwanacy@gmail.com")
   // sortContacts(listOf(contact4), sortBy = "name")

}

// immutable list
fun food() {
    val snacks = listOf("crisps", "biscuits", "chocolate", "donut")
    println(snacks)


    //mutable list is dynamic
    val androidVersions = mutableListOf("cupcake", "donut", "eclair", "froyo", "gingerbread")
    androidVersions.add(2, "cake")
    androidVersions.add("honeycomb")
    androidVersions.add("icecream sandwich")
    androidVersions.add("jellybean")
    androidVersions.add("kitkat")
    androidVersions.addAll(listOf("marshmallow", "nougat", "oreo", "pie"))
    androidVersions.remove("froyo")
    androidVersions.removeAt(2)
    println(androidVersions)
    println(androidVersions[2])
}

//write a function that takes in a mutable list of 5 integers and
//returns the sum of all the elements in odd indices

fun addition(numbers: MutableList<Int>): Int {
    return numbers[1] + numbers[3]
}

//write a function that takes in a mutable list of integers and
//returns the sum of all the elements in odd indices

fun add(nums: MutableList<Int>): Int {
    return nums[2] + nums[4] + nums[6]
}

fun listOfIntegers(integers: MutableList<Int>): Int {
    var result = 0
    integers.forEachIndexed { idx, element ->
        if (idx % 2 != 0) {
            result += element
        }
    }
    return result
}

fun foods() {
    var fruits = listOf("mango", "banana", "pawpaw", "apple")
    fruits = fruits.reversed()
    println(fruits)
}

data class Contact(
    var name: String,
    var phoneNumber: String,
    var email: String
)

//To print out the names of all your contacts, if the index is Odd, print the name in uppercase

//fun contact() {
//    var myContacts = listOf("contact1", "contact2", "contact3")
//    myContacts.forEachIndexed(index, contact -> {
//        if (index % 2 !== 0) {
//            println(contact.name.upperCase)
//        } else {
//            println(contact.name)
//        }
//    }
//}

//given a list of contacts like above, write a function that would sort the
// list by either phone number depending on which is specified in the parameters
//Return a sorted list
//fun sortContacts(contacts: List<Contacts>, sortBy:String)

data class Contacts(
    var name: String,
    var phoneNumber: String,
    var email: String
)

fun sortContacts(contacts: List<Contacts>, sortBy: String): List<Contact> {
//    return when (sortBy) {
//        "name" -> contacts.sortedBy { it.name }
//        "phone" -> contacts.sortedBy { it.phoneNumber }
//        "email" -> contacts.sortedBy { it.email }
//    }

    //Method2
//    if(sortBy == "name"){
//        return contacts.sortedBy { contact->contact.name}
//    }
//    else{
//
//    }
//}

    //List Filtering
    fun numbers() {
        val nums = listOf(-1, 78, -45, 87, 32, 0, 7, -97)
        val negativeNums = nums.filter { num -> num < 0 }
        println(negativeNums)
    }

//    fun contacts(){
//        val myCont = listOf(cont1, cont2, cont3, cont4)
//        val femaleCont = myCont.filter { cont-> cont.gender=="female" }
//
//    }

    fun words() {
        val names = listOf("ben", "ken", "pen", "pen", "pen", "ken")
        val realNames = names.filter { name -> name != "ten" && name != "pen" }
        println(realNames)
    }

//    fun friends() {
//        val friends = listOf("Frida", "Terry", "Mary", "Tom")
//        println(friends.sortedBy { f -> f.lowercase() })
//    }

//Question
//You are sorting a list of words into 2 lists.
// One list is to contain words beginning with a vowel while another
// is to hold words beginning with a consonant.
// Write a function to achieve this

//    val vowels = listOf('a', 'e', 'i', 'o', 'u')
//    val word = "cactus"
//    if (vowels.contain(word[0])) {
//
//
//    }
//}


//April 16th, 2024

//In an ecommerce app's checkout feature the cart is represented
//using a list of products from the below data class.
//The app needs to display a categorized total for all the checkout items
//The possible categories are:
//"groceries", "hygiene", "general" and "appliances".

//Write a function that would compute and return the category totals
//for each category

data class Product(var name: String,
                   var category: String,
                   var price: Double,
                   var quantity: Int)




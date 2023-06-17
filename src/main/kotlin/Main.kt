fun main() {
  val  fruits=listOf("apple","banana","code","mango")
    println(fruits)
  val rwanda= mutableListOf("kaame",12500,66.7)
    println(rwanda)
    rwanda.add("EAC")
    rwanda.remove(66.7)
    println(rwanda)
    val nums= mutableListOf(21,43,321,332,2,111,4,5,43,4892)
  val evenList=nums.filter{x ->x %2==0}
  println(evenList)
//    println(nums.count())
//    println(nums.max())
//    println(nums.min())
//    println(nums.average())
//    println(nums.first())
//    println(nums.last())
//    println(nums.get(5))
//    println(nums[5])
//    println(nums.indexOf(43))
//    println(nums.lastIndexOf(43))
//    println(nums.lastIndex)
//  println(nums.sort())
  val sortedNums=nums.sorted()
  println(sortedNums)
  println(nums.sorted())
  println(nums is List<Int>)
  val geisha =Product("Geisha", 50.0)
  println(geisha is Product)
  println()
  createProductList()

//  squareNums()
  
}
fun squareNums(numbers:List<Int>) {
  numbers.forEach{x-> println(x*x)}
}
data class Product(var name:String, var price:Double)
  fun createProductList() {
    val kiwi = Product("kiwi shoe polish", 80.0)
    val prod2 = Product("colgate", 60.0)
    val ilara = Product("ilara milk", 30.0)
    val bread = Product("sunlest", 65.0)
    val biscuit = Product("nuvita", 5.0)
    val shamp = Product("nicely", 80.0)
    val products = listOf(kiwi, prod2, ilara, bread, biscuit, shamp)
    val sortedProducts=products.sortedBy{ product -> product.price}.sortedBy{ product ->product.name }
//    val sortedProducts=products.sortedBy{ product -> product.price}
    println(sortedProducts)
var itemsIcanAfford= products.filter{product -> product.price<=50}
    println(itemsIcanAfford)
  }


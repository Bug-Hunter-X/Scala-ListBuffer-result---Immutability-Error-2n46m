```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Incorrect usage of ListBuffer.result(). It returns a List, not a ListBuffer.
  val immutableList = buffer.result()
  // This line will cause a compiler error because immutableList is a List, not a ListBuffer.
  immutableList += 4
  println(immutableList)
}
```
```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct usage: Continue using the mutable ListBuffer
  buffer += 4
  println(buffer)
  //Or convert to a new mutable list
  val newList = buffer.toList
  println(newList)
}
```
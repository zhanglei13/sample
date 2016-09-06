package example

import scala.io.Source

/**
 * Created by zhanglei on 2016/9/6.
 */
object Data {
  def listPerson = Source.fromURL(getClass.getResource("sample_data.csv")).getLines().toList.map{
    line => val parts = line.split(",")
      Person(parts(0), parts(1), parts(2).toInt, parts(3))
  }
}

case class Person(first: String, last: String, age: Int, state: String)
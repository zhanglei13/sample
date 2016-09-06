package example

import org.apache.spark.sql.SparkSession

/**
 * Created by zhanglei on 2016/9/6.
 */
object DataFrameExample extends App{
  val sqlContext = SparkSession
    .builder()
    .appName("DataFrameExample")
    .master("local[2]")
    .enableHiveSupport()
    .getOrCreate()

  val df = sqlContext.createDataFrame(Data.listPerson)
  //val dataset = df.as[Person]

  // SQL style
  println("Under 21")
  df.filter("age < 21")
    .collect
    .foreach(row => println(row))

  // expression builder style
  println("Over 21")
  df.filter(df("age").gt(21))
    .collect
    .foreach(row => println(row))
}

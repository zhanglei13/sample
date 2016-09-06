package example

import org.apache.spark.sql.SparkSession

/**
 * Created by zhanglei on 2016/9/6.
 */
object DataSetExample extends App{
  val sqlContext = SparkSession
    .builder()
    .appName("DataFrameExample")
    .master("local[2]")
    .enableHiveSupport()
    .getOrCreate()

  import sqlContext.implicits._

  val dataset = sqlContext.createDataset(Data.listPerson)

  println("Under 21")
  dataset.filter(_.age < 21)
    .collect
    .foreach(println)
}

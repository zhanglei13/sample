package example

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by zhanglei on 2016/9/6.
 */
object RDDExample extends App{
  val conf = new SparkConf()
    .setAppName("RDDExample")
    .setMaster("local[2]")

  val sc = new SparkContext(conf)

  val rdd = sc.parallelize(Data.listPerson)

  println("Under 21")
  rdd.filter(p => p.age < 21).foreach(println(_))

  println("Over 21")
  rdd.filter(_.age > 21).foreach(println)
}
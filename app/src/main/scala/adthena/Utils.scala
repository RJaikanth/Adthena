package adthena

import org.apache.spark.sql.{Column, Dataset, Encoder, Encoders, SparkSession, functions}

import scala.reflect.runtime.universe.TypeTag

object Utils {

  def readTSV[T <: Product : TypeTag](s3Path: String)(implicit spark: SparkSession): Dataset[T] = {
    implicit val encoder: Encoder[T] = Encoders.product[T]
    spark
      .read
      .option("delimiter", "\t")
      .schema(encoder.schema)
      .csv(s3Path)
      .as[T]
  }

  def roundToInt(column: Column): Column = functions.round(column, 0).cast("int")


}

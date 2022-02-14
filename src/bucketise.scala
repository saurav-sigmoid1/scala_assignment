import java.lang.Math.floor

object bucketise{

  def main(args:Array[String]):Unit= {
    var new_data = Array(1.0, 1.05, 1.38, 1.5, 12.05, 12.03, 10.33, 11.45, 13.50)

    for (ele <- new_data) {
      var bucket_number = floor(ele / (0.050))
      var a = ((bucket_number) * 0.050)
      var b = a + 0.049
      println(f"$ele lies in this bucket $a%1.3f-$b%1.3f")
    }
  }
}

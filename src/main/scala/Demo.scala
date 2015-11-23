import com.jvivier.WW

object Demo extends App {
  val scores = Seq(0.0, 0.5, 1, 1)
  val p = Seq(0.5, 0.3, 0.15, 0.05)
  val w = Seq(0.33, 0.33, 0.33, 0)

  println(
    """
      |val scores = Seq(0.5, 0.3, 0.15, 0.05)
      |val p = Seq(0, 0.5, 1, 1)
      |val w = Seq(0.33, 0.33, 0.33, 0)
    """.stripMargin)
  println("Weighted means : " + WW.wm(scores,p))
  println("Ordered weighted averaging : " + WW.owa(scores,w))
  println("Weighted Ordered Weighted Aggregation : " + WW.wowa(scores,p,w))
}

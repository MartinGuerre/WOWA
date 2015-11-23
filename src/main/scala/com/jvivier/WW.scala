package com.jvivier

/**
  * created by jvivier
  */

import java.util
import ww._
import scala.collection.JavaConverters._

object WW {

  def wm(scores: Seq[Double], p: Seq[Double]): Double = {
    val scoresJava = new util.Vector(scores.asJava)
    val pJava = new util.Vector(p.asJava)

    wwv2.wm(pJava, scoresJava)
  }

  def owa(scores: Seq[Double], w: Seq[Double]): Double = {
    val scoresJava = new util.Vector(scores.asJava)
    val wJava = new util.Vector(w.asJava)

    wwv2.owa(wJava, scoresJava)
  }

  def wowa(scores: Seq[Double], p: Seq[Double], w: Seq[Double]): Double = {
    val scoresJava = new util.Vector(scores.asJava)
    val pJava = new util.Vector(p.asJava)
    val wJava = new util.Vector(w.asJava)

    wwv2.wowa(wJava, pJava,scoresJava)
  }
}

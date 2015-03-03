package org.scaroo.scalding.hive.sources

import cascading.tap.{MultiSourceTap, Tap}
import cascading.tap.hive.{HiveViewAnalyzer, }
import com.twitter.scalding._


case class HiveSource(query: String)(implicit analyzer: HiveViewAnalyzer) extends Source {
  override def createTap(readOrWrite: AccessMode)(implicit mode: Mode): Tap[_, _, _] =
    mode match  {
      case Local(_) | Hdfs(_, _) => {
        new MultiSourceTap(analyzer.asTaps(query))
      }
      case _ => ???
  }
}

object HiveSource {
  implicit lazy val analyzer = new HiveViewAnalyzer()
}

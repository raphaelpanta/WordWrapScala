package com.github.raphaelpanta.linewrapper

object Wrapper {

  def wrap(text: String, maxColumn: Int): String =
    text.split(" ").reduceLeft(
      (x, xs) => if ((x.length()) % maxColumn + xs.length() >= maxColumn) { x + "\n" + xs } else { x + " " + xs })
}

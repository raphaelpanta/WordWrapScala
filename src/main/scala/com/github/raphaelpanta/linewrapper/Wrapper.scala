package com.github.raphaelpanta.linewrapper

object Wrapper {

  def wrap(text: String, maxColumn: Int): String =
    text.split(" ").reduceLeft(
      (x, xs) => if (x.length() + xs.length() <= maxColumn) { x + " " + xs } else { x + "\n" + xs })
}

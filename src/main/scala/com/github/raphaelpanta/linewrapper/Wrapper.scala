package com.github.raphaelpanta.linewrapper

object Wrapper {

  def wrap(text: String, startColumn: Int = 0, maxColumn: Int): String =
    text match {
      case text if text.lastIndexOf(' ') <= maxColumn => text.substring(0, text.lastIndexOf(' ')) + "\n" + text.substring(text.lastIndexOf(' ') + 1, text.length())
      case _ => text
    }
}

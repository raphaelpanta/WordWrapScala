package com.github.raphaelpanta.unit

import org.specs2.mutable.Specification
import com.github.raphaelpanta.linewrapper.Wrapper.wrap
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WrapperTest extends Specification {

  "The string 'I love you'" should {
    "be wrapped at column 6" in {
      wrap("I love you", maxColumn = 6) must equalTo("I love\nyou")
    }
    "be wrapped at column 10" in {
      wrap("I love you", maxColumn = 10) must equalTo("I love you");
    }
    
    "be wrapped at column 1" in {
      wrap("I love you", maxColumn = 1) must equalTo("I\nlove\nyou");
    }
  }
  
}
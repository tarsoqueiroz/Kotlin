package exercises

import org.junit.Assert
import org.junit.Test

class ExtensionNumberTest {

    @Test fun percentOfNumber() {

        Assert.assertEquals(10.0f, 10.0f.percentOf(100.0f), .01f)
    }

    @Test fun percentOfNumberCustomPrecision() {

        println(33.0f.percentOf(91919.0f).customPrecision(3))
        Assert.assertEquals(0.036f, 33.0f.percentOf(91919.0f).customPrecision(3))
    }
}
package com.example.section4

fun main() {

    // variaveis
    val myPhrase = "I am a String"
    val pi = 3.14
    val numInt = 3

    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 2.9
    val myFloat = 2.9F
    val myLong = 28236592345692359L
    val myInt = 23
    val myShort: Short = 23
    val myByte: Byte = 127

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    val anInt = 7
    val aLong: Long = anInt.toLong()

    //substituicao if ternario
    val intA = 3
    val intB = 6
    //no java  int lowest = (intA > intB) intB : intA;
    var lowest = if (intA > intB) intA else intB
    //pode se usar bloco de codigo tbm
    lowest = if (intA > intB) {
        //outras acoes
        intA
    } else {
        //outras acoes
        intB
    }



}

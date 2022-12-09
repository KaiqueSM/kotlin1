package com.example.section8.partial

import org.funktionale.partials.partially1
import org.funktionale.partials.partially2
import org.funktionale.partials.partially3

fun main() {
    var prefixAndPostfix: (String,String,String) -> String = {
        prefix: String, x: String, postfix: String -> "$prefix$x$postfix"
    }

    var prefixAndAlert: (String,String) -> String = prefixAndPostfix.partially3("!")

    var hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("Rezas"))
}
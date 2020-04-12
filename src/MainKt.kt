const val TAVERN_NAME = "Taernyl's Folly"

fun main(args: Array<String>) {
//    placeOrder("shandy,Dragon's Breath,5.91")
//    "Dragon's Breath".forEach {
//        println("$it\n")
//    }
//    sub()
    toDragonSpeakIgnoreCase("DRAGON'S BREATH: IT'S GOT WHAT ADVENTURERS CRAVe!")
//    compare()
}

fun sub() {
//    println(TAVERN_NAME.subSequence(0, 5))
//    println(TAVERN_NAME.subSequence(IntRange(0, 5)))
//    println(TAVERN_NAME.substring(0, 5))
//    println(TAVERN_NAME.substring(IntRange(0, 5)))
//    println(TAVERN_NAME.substring(0, 5))
//    println(TAVERN_NAME.substring(1))
//    println(TAVERN_NAME.subSequence(1))
}

private fun placeOrder() {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

private fun toDragonSpeakIgnoreCase(phrase: String) {
    println(toDragonSpeakIgnoreCase1(phrase))
    println(toDragonSpeakIgnoreCase2(phrase))
    println(toDragonSpeakIgnoreCase3(phrase))
    println(toDragonSpeakIgnoreCase4(phrase))
    println(toDragonSpeakIgnoreCase5(phrase))
}

private fun toDragonSpeakIgnoreCase1(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            "A" -> "4"
            "E" -> "3"
            "I" -> "1"
            "O" -> "0"
            "U" -> "|_|"
            else -> it.value
        }
    }

private fun toDragonSpeakIgnoreCase2(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value.toUpperCase()) {
            "A" -> "4"
            "E" -> "3"
            "I" -> "1"
            "O" -> "0"
            "U" -> "|_|"
            else -> it.value
        }
    }

private fun toDragonSpeakIgnoreCase3(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value.toLowerCase()) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

private fun toDragonSpeakIgnoreCase4(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value.capitalize()) {
            "A" -> "4"
            "E" -> "3"
            "I" -> "1"
            "O" -> "0"
            "U" -> "|_|"
            else -> it.value
        }
    }

private fun toDragonSpeakIgnoreCase5(phrase: String) =
    phrase.replace(Regex("(?i)[aeiou]")) {
        when (it.value.toLowerCase()) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }


//private fun placeOrder(menuData: String) {
//    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
//    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
//    println("Madrigal speaks with $tavernMaster about their order.")
//}
//private fun placeOrder() {
//    val message = "11\t22\b33\n44\r55\"66\'77\\88\$99\u8217"
//    println(message)
//    println(message.length)
//}
private fun placeOrder(menuData: String) {
//    val data = menuData.split(',')
//    val type = data[0]
//    val name = data[1]
//    val price = data[2]
    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)
}

private fun compare() {
    println(null == null)
    println(null === null)
    val testA = "test"
    val testB = "test"
    val nullObj = null
    val nullString: String? = null
    val nullInt: Int? = null

    println("String Compare")
    println(testA == testB)
    println(testA === testB)

    println("Null String Compare")
    println(nullString == null)
    println(nullString === null)
    println(nullString.equals(null))

    println("Null Int Compare")
    println(nullInt == null)
    println(nullInt === null)
//    println(nullInt.equals(null))

//    println("Null String Int Compare")
//    println(nullString == nullInt)
//    println(nullString === nullInt)

    println("Null Compare")
    println(null.equals(null))
}
package com.example.kotlinbasics

fun main(){

    // Immutable list - you cannot add items after the initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    // mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // adding items to lists
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    shoppingList.removeAt(2)
    shoppingList.removeAt(1)
    shoppingList.add(2, "RAM")
    println(shoppingList[3])

    shoppingList[3] = "Graphics Card RX 7800XT"

    //val hasRam = shoppingList.contains("RAM")
    if (shoppingList.contains("RAM")){
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }

    for(item in shoppingList){
        println(item)
        if(item == "RAM"){
            shoppingList.removeLast()
            break
        }
    }

    println(shoppingList)
}
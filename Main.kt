fun main(args: Array<String>) {
    val enemy = Enemy("test enemy", 10, 3)

//    val caveTroll = Troll("Urg the Cave Troll")
//    println(caveTroll)
//    caveTroll.takeDamage(30)
//
//    val azog = Orc("Azog")
//    azog.takeDamage(8)
//    println(azog)
//
//    for (i in 1..10) {
//    val lurtz = UrakHai("Lurtz")
//
//    do{
//        if (lurtz.dodges()) {
//            lurtz.lives += 1
//            continue;
//        }
//        if (lurtz.runAway()) {
//            println("Lurtz ran away")
//            break
//        } else {
//            lurtz.takeDamage(80)
//        }
//
//    } while (lurtz.lives > 0)
//    println("=========================")
//    }
    val frodo = Player("Frodo")
    frodo.getLoot((Loot("Invisibility", LootType.ARMOR, 4.0)))
    frodo.getLoot((Loot("Mithril", LootType.ARMOR, 183.0)))
    frodo.getLoot((Loot("Ring of Speed", LootType.RING, 25.0)))
    frodo.getLoot((Loot("Red Potion", LootType.POTION, 2.0)))
    //frodo.getLoot((Loot("Cursed Ring", LootType.RING, -8.0)))
    frodo.getLoot((Loot("Brass Ring", LootType.RING, 1.0)))
    frodo.getLoot((Loot("Brass Ring", LootType.RING, 1.0)))
    frodo.getLoot((Loot("Brass Ring", LootType.RING, 1.0)))
    frodo.getLoot((Loot("Chain Mail", LootType.ARMOR, 4.0)))
    frodo.getLoot((Loot("Health Potion", LootType.POTION, 3.0)))
    frodo.getLoot((Loot("Health Potion", LootType.POTION, 3.0)))
    frodo.getLoot((Loot("Silver Ring", LootType.RING, 6.0)))
    frodo.showInventory()

    //frodo.dropLoot(name = "Brass Ring")
    frodo.showInventory()


}
fun main() {
    val sqaureCabin = SqaureCabin(6)
    val roundHut = RoundHut(1)
   val  roundTower= RoundTower(5)
    with(sqaureCabin){
                             println("sqaureCabin")

         println("caps : ${caps}")
     println("Material : ${buildingMaterial} \n ")
     println("room : ${hasRoom()}")

        
    }
        with(roundHut){
                     println("roundHut")
         println("caps : ${caps}")
     println("Material : ${buildingMaterial} \n ")
     println("room : ${hasRoom()}")

        
    }
         with(roundTower){
                     println("roundHut")
         println("caps : ${caps}")
     println("Material : ${buildingMaterial} \n ")
     println("room : ${hasRoom()}")

        
    }
    
    
    
   
}
//parent class
abstract class Dwelling(private var res: Int) {
    
   abstract val buildingMaterial : String 
   abstract val caps : Int

    
    fun hasRoom() : Boolean{
        return res <= caps
    }
   

    
    }//end parent class

//cheldren 
class SqaureCabin (res : Int) : Dwelling(res){
    override val buildingMaterial ="wood"
    override val caps = 6
}
 open class RoundHut (res : Int) : Dwelling(res){
     override val buildingMaterial ="straw"
    override val caps = 3
}
 // c of c
class RoundTower (res : Int) : RoundHut(res){
     override val buildingMaterial ="stone"
    override val caps = 4
}

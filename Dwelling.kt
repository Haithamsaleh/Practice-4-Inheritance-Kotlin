import kotlin.math.PI
fun main() {
    val sqaureCabin = SqaureCabin(6,5.0)
    val roundHut = RoundHut(1,10.0)
   val  roundTower= RoundTower(50,10.0,10)
             println("===================================")

    with(sqaureCabin){
        println("sqaureCabin")

         println("caps : ${caps}")
     println("Material : ${buildingMaterial}  ")
     println("room : ${hasRoom()}")
getRoom()
          println("area : ${floorArea()}")

          println("===================================")

        
    }
        with(roundHut){
                     println("roundHut")
         println("caps : ${caps}")
     println("Material : ${buildingMaterial}  ")
     println("room : ${hasRoom()}")
     getRoom()

               println("area : ${floorArea()}")
                         println("===================================")



        
    }
         with(roundTower){
                     println("roundTower")
         println("caps : ${caps}")
     println("Material : ${buildingMaterial}  ")
     println("room : ${hasRoom()}")
     getRoom()

       println("area : ${floorArea()}")
                 println("===================================")


        
    }
    
    
    
   
}
//parent class
abstract class Dwelling(private var res: Int) {
    
   abstract val buildingMaterial : String 
   abstract val caps : Int

    
    fun hasRoom() : Boolean{
        return res <= caps
        
    }
    
    fun getRoom(){
        if(res <= caps){
            res++
            println("U got a room")
        }else{
            println("sorry no room")
        }
    }
    
    
    
    abstract fun floorArea() : Double 
        
    
    
    
   

    
    }//end parent class

//cheldren 
class SqaureCabin (res : Int, val length : Double ) : Dwelling(res){
    override val buildingMaterial ="wood"
    override val caps = 6
    
    override fun floorArea() : Double {
        return length * length
    } 
}



 open class RoundHut (res : Int, val radius : Double) : Dwelling(res){
     override val buildingMaterial ="straw"
    override val caps = 3
     
     override fun floorArea() : Double {
        return PI * radius * radius
    } 
}
 
 
 
 // c of c
class RoundTower (res : Int,radius : Double, val floors: Int = 2) : RoundHut(res, radius){
     override val buildingMaterial ="stone"
    override val caps = 4 * floors
    
     override fun floorArea() : Double {
        return super.floorArea() * floors
    } 
    
}

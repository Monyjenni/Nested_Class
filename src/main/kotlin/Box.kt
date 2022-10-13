class Box(val widght :Int , val length: Int ,val height: Int ) {

    inner class Content(val content: String ){

        fun printContent(){

            println(content)
        }

        fun printBoxInfo(){
            println("$widght,$length,$height")
        }



    }
    // means we wanna access another class inside another class (nested class)

    fun main(){

        val box = Box(10,20,30)

        // just write main class dot sub class and fill constructor in subclass

        //val content=Box.Content("I dont get it"), since we set inner
        val content= box.Content("Not really sure  but i will take a look")

        //access the main function in subclass

        content.printContent()
    }
}
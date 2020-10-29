package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        show()
        showIn("Yes")
        one(34)
        //Array
        val list:ArrayList<String> = ArrayList()
        list.add("Alex")
        list.add("Sepehr")
        list.add("Mir")
        list.add("Youn")
        val list1= arrayListOf<String>("gh","ft")
        //If
        val number:Int=98
        if (number>=10){
        }
        else{
        }
        //When
        val info:String=when(number){
            1 -> "new"
            10 -> "middle"
            in 20 .. 30 -> "old"
            else -> "nothing"
        }
        //For
        for (i:Int in 1 .. 15 step 5){  }
    }
    fun show(){
        Toast.makeText(this,"Well!",Toast.LENGTH_LONG).show()
    }
    fun showIn(name : String){
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
    }
    fun one(num : Int) = num+1
}
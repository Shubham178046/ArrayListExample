package com.example.arraylistexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var childModel0 = ArrayList<ChildModel>()
    var childModel1 = ArrayList<ChildModel>()
    var childModel2 = ArrayList<ChildModel>()
    var childModel3 = ArrayList<ChildModel>()

    var parentModel = ArrayList<ParentModel>()
    var childModel = ArrayList<ChildModel>()
  //  var nodes = ArrayList<ArrayList<ParentModel>>()
    var nodes = ArrayList<ArrayList<String>>()
    var nodeList  = ArrayList<String>()
    var parentModelList = ArrayList<ParentModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///// Checking
        nodeList.add("PropertyStart")
        nodeList.add("Children.item(3).getTextContent()")
        nodeList.add("Children.item(7).getTextContent()")
        nodeList.add("Children.item(9).getTextContent()")
        nodeList.add("Children.item(11).getTextContent()")
        nodeList.add("Children.item(13).getTextContent()")
        nodeList.add("PropertyEnd")

        for (i in 0 until 5) {
            nodes.add(nodeList)
        }

        Log.d("NODESIZE", "onCreate: "+nodes.size)
        Log.d("NODESIZE0", "onCreate: "+nodes.get(0).size)

        for(i in 0 until nodes.size)
        {
            for(k in 0 until nodeList.size)
            {
                Log.d("NODES", "onCreate:$i $k "+nodes.get(i).get(k))
            }
        }

        for (i in 0 until 5) {
            parentModel.add(ParentModel(null))
        }


        btnadd.setOnClickListener {

            var position = 0

            childModel.add(
                ChildModel(
                    edtName.text.toString(),
                    edtemail.text.toString(),
                    edtNumber.text.toString(),
                    edtAdd.text.toString(),
                    edtDob.text.toString()
                )
            )
            var childModels : ChildModel = childModel.get(position)

            childModels!!.name = edtName.text.toString()
            childModels!!.email =   edtemail.text.toString()
            childModels!!.number =   edtNumber.text.toString()
            childModels!!.add =   edtAdd.text.toString()
            childModels!!.dob =   edtDob.text.toString()


            position++
            parentModel.set(0, ParentModel(childModel))
            cleardata()
        }


        btnadd1.setOnClickListener {
            var childModel = ArrayList<ChildModel>()

            childModel.add(
                ChildModel(
                    edtName.text.toString(),
                    edtemail.text.toString(),
                    edtNumber.text.toString(),
                    edtAdd.text.toString(),
                    edtDob.text.toString()
                )
            )
            parentModel.set(1, ParentModel(childModel))
            cleardata()
        }
        btnadd2.setOnClickListener {
            var childModel = ArrayList<ChildModel>()
            childModel.add(
                ChildModel(
                    edtName.text.toString(),
                    edtemail.text.toString(),
                    edtNumber.text.toString(),
                    edtAdd.text.toString(),
                    edtDob.text.toString()
                )
            )

            parentModel.set(2, ParentModel(childModel))
            cleardata()
        }
        btnadd3.setOnClickListener {
            var childModel = ArrayList<ChildModel>()
            childModel.add(
                ChildModel(
                    edtName.text.toString(),
                    edtemail.text.toString(),
                    edtNumber.text.toString(),
                    edtAdd.text.toString(),
                    edtDob.text.toString()
                )
            )

            parentModel.set(3, ParentModel(childModel))
            cleardata()
        }
        btnadd4.setOnClickListener {
            var childModel = ArrayList<ChildModel>()
            childModel.add(
                ChildModel(
                    edtName.text.toString(),
                    edtemail.text.toString(),
                    edtNumber.text.toString(),
                    edtAdd.text.toString(),
                    edtDob.text.toString()
                )
            )

            parentModel.set(4, ParentModel(childModel))
            cleardata()
        }


        /*parentModel.add(ParentModel(0,childModel))
        parentModel.add(ParentModel(1,childModel0))
        parentModel.add(ParentModel(2,childModel1))
        parentModel.add(ParentModel(3,childModel2))
        parentModel.add(ParentModel(4,childModel3))*/


        btnDisplay.setOnClickListener {
            Log.d("ParentSize", "onCreate: " + parentModel.size)
            //Log.d("ChildSize", "onCreate: " + childModel.size)

            /* for(i in parentModel.indices)
             {
                 for(k in childModel.indices)
                 {
                     Log.d(
                         "Check",
                         "onCreate: " + parentModel.get(i).childModel!!.get(k).email + " " +  parentModel.get(i).childModel!!.get(k).name + " " + parentModel.get(i).childModel!!.get(k).number + " " +  parentModel.get(i).childModel!!.get(k).add + " " +  parentModel.get(i).childModel!!.get(k).dob
                     )
                 }

             }*/

            for (i in 0 until parentModel.get(0).childModel!!.size) {
                Log.d(
                    "Check",
                    "onCreate0: " + parentModel.get(0).childModel!!.get(i).email + " " + parentModel.get(
                        0
                    ).childModel!!.get(i).name + " " + parentModel.get(0).childModel!!.get(i).number + " " + parentModel.get(
                        0
                    ).childModel!!.get(i).add + " " + parentModel.get(0).childModel!!.get(i).dob
                )
            }

        }

        btnDisplay1.setOnClickListener {
            for (i in 0 until parentModel.get(1).childModel!!.size) {
                Log.d(
                    "Check",
                    "onCreate1: " + parentModel.get(1).childModel!!.get(i).email + " " + parentModel.get(
                        1
                    ).childModel!!.get(i).name + " " + parentModel.get(1).childModel!!.get(i).number + " " + parentModel.get(
                        1
                    ).childModel!!.get(i).add + " " + parentModel.get(1).childModel!!.get(i).dob
                )
            }
        }
        btnDisplay2.setOnClickListener {
            for (i in 0 until parentModel.get(2).childModel!!.size) {
                Log.d(
                    "Check",
                    "onCreate2: " + parentModel.get(2).childModel!!.get(i).email + " " + parentModel.get(
                        2
                    ).childModel!!.get(i).name + " " + parentModel.get(2).childModel!!.get(i).number + " " + parentModel.get(
                        2
                    ).childModel!!.get(i).add + " " + parentModel.get(2).childModel!!.get(i).dob
                )
            }
        }
        btnDisplay3.setOnClickListener {
            for (i in 0 until parentModel.get(3).childModel!!.size) {
                Log.d(
                    "Check",
                    "onCreate3: " + parentModel.get(3).childModel!!.get(i).email + " " + parentModel.get(
                        3
                    ).childModel!!.get(i).name + " " + parentModel.get(3).childModel!!.get(i).number + " " + parentModel.get(
                        3
                    ).childModel!!.get(i).add + " " + parentModel.get(3).childModel!!.get(i).dob
                )
            }
        }
        btnDisplay4.setOnClickListener {
            for (i in 0 until parentModel.get(4).childModel!!.size) {
                Log.d(
                    "Check",
                    "onCreate4: " + parentModel.get(4).childModel!!.get(i).email + " " + parentModel.get(
                        4
                    ).childModel!!.get(i).name + " " + parentModel.get(4).childModel!!.get(i).number + " " + parentModel.get(
                        4
                    ).childModel!!.get(i).add + " " + parentModel.get(4).childModel!!.get(i).dob
                )
            }
        }
    }

    fun cleardata() {
        edtName.text.clear()
        edtemail.text.clear()
        edtNumber.text.clear()
        edtAdd.text.clear()
        edtDob.text.clear()
    }
}
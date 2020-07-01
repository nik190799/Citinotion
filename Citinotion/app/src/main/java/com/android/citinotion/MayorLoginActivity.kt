package com.android.citinotion

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.mayor_login.*

class MayorLoginActivity :AppCompatActivity(){

    var id:String = String()

    var stu_list_id = ArrayList<String>()
    var stu_list_pass = ArrayList<String>()

    val database = FirebaseDatabase.getInstance()
    val myRef = database.getReference("Mayor")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mayor_login)



        mayor_login_btn.setOnClickListener {

            myRef.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onCancelled(p0: DatabaseError) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onDataChange(p0: DataSnapshot) {
                    p0.children.forEach {
                        stu_list_id.add(it.child("id").getValue(String::class.java)!!)
                        stu_list_pass.add(it.child("pass").getValue(String::class.java)!!)
                    }
                    if (mayor_user_id.text.toString() == "" || mayor_password.text.toString() == "") {
                        if (mayor_user_id.text.toString() == "") {
                            mayor_user_id.error = "Please enter the id !!"
                        }
                        if (mayor_password.text.toString() == "") {
                            mayor_password.error = "Please enter the password !!"
                        }
                    } else {

                        Log.d("Check", mayor_user_id.text.toString() + " " + mayor_password.text.toString())

                        stu_list_id.forEachIndexed { index, s ->
                            Log.d("Check", s)
                            if (s == mayor_user_id.text.toString().trim()) {
                                Log.d("Check", mayor_user_id.text.toString() + " " + mayor_password.text.toString())
                                Log.d("Check", s)
                                if (stu_list_pass[index] == mayor_password.text.toString().trim()) {
                                    Log.d("Check", mayor_user_id.text.toString() + " " + mayor_password.text.toString())
                                    Log.d("Check", stu_list_pass[index])

                                    val intent = Intent(this@MayorLoginActivity, MayorActivity::class.java)
                                    val shared: SharedPreferences = getSharedPreferences("shared", Context.MODE_PRIVATE)
                                    val editor: SharedPreferences.Editor = shared.edit()
                                    editor.putString("stuid",s)
                                    editor.putString("stupass",stu_list_pass[index])
                                    editor.commit()
                                    intent.putExtra("id", mayor_user_id.text.toString().trim())
                                    startActivity(intent)
                                }
                            }
                        }
                    }
                }

            })
        }
    }
}
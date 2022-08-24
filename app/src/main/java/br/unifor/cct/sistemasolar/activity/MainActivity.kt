package br.unifor.cct.sistemasolar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.sistemasolar.R
import br.unifor.cct.sistemasolar.adapter.UserAdapter
import br.unifor.cct.sistemasolar.model.User
import br.unifor.cct.sistemasolar.repository.UserRepository

class MainActivity : AppCompatActivity() {

    private lateinit var mSistemaSolar: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSistemaSolar = findViewById(R.id.main_recyclerview_sistemasolar)
        mSistemaSolar.layoutManager = LinearLayoutManager(this)
        mSistemaSolar.adapter = UserAdapter(UserRepository.findAll())
        

    }
}
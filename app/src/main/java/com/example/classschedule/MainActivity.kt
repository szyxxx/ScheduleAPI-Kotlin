package com.example.classschedule

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.classschedule.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val kelas = findViewById<RecyclerView>(R.id.rv_class)

        ApiConfig.getService().getData().enqueue(object : Callback<ResponseClass>{
            override fun onResponse(call: Call<ResponseClass>, response: Response<ResponseClass>) {
                if (response.isSuccessful){
                    val responseClass = response.body()
                    val dataClass = responseClass?.data
                    val classAdapter = ClassAdapter(dataClass)
                    kelas.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        classAdapter.notifyDataSetChanged()
                        adapter = classAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseClass>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }

        })
    }
}
package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var quotesApi =RetrofitHelper.getinstance().create(QuotesApi::class.java)

        GlobalScope.launch {
            var result=quotesApi.getQuotes(1)
            if(result!=null)
            {
                Log.d("my",result.body().toString())
            }
            else
            {
                Log.d("fd","Hello")
            }
        }
    }
}
package com.aceyan.mynote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.aceyan.mynote.databinding.ActivityMainBinding
import com.google.android.material.search.SearchView
import com.ysw.android.extensions.viewbinding.BaseViewBindingActivity

class NoteManagerActivity : BaseViewBindingActivity<ActivityMainBinding>() {

    override fun getViewBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
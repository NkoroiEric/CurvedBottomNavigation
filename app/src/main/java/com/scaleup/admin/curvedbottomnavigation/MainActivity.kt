package com.scaleup.admin.curvedbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nested.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY >= v?.height!!){
                fab.animate().alpha(0f).apply {
                    duration = 100
                }.start()
            }else{
                fab.animate().alpha(1f).apply {
                    duration = 10
                }.start()
            }
        })
    }
}

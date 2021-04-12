package com.example.liza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.lz)
        findViewById<ImageView>(R.id.imageView).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jhf)
            findViewById<ImageView>(R.id.imageView).setOnClickListener{
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jfg)
                findViewById<ImageView>(R.id.imageView).setOnClickListener{
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.bgd)
                    findViewById<ImageView>(R.id.imageView).setOnClickListener{
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.hgf)
                        findViewById<ImageView>(R.id.imageView).setOnClickListener{
                            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kdv)
                            findViewById<ImageView>(R.id.imageView).setOnClickListener{
                                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kjfl)
                                findViewById<ImageView>(R.id.imageView).setOnClickListener{
                                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.eliz)
                                    findViewById<ImageView>(R.id.imageView).setOnClickListener{

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
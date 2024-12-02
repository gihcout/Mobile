package com.example.mobile.Activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.mobile.Model.ItemsModel
import com.example.mobile.R
import com.example.mobile.databinding.ActivityDetailBinding

class DetailActivity : BaseActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var item: ItemsModel
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        context = this

        bundle()
    }

    private fun bundle() {
        binding.apply {
            // Corrigido: nome do extra para "object"
            item = intent.getParcelableExtra("object")!!
            titleTxt.text = item.title
            subtitleTxt.text = item.extra
            descriptionTxt.text = item.description
            priceTxt.text = "$" + item.price

            // Corrigido: importando Glide corretamente e corrigindo o uso do RoundedCorners
            Glide.with(context)
                .load(item.picUrl[0])
                .apply(RequestOptions.bitmapTransform(RoundedCorners(100))) // Corrigido o nome da classe e o parâmetro
                .into(binding.img)

            backBtn.setOnClickListener { finish() }

            sizeBtn1.setOnClickListener {
                sizeBtn1.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.orange_stroke_bg
                    )
                )
                sizeBtn2.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn3.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn1.setTextColor(resources.getColor(R.color.orange))
                sizeBtn2.setTextColor(resources.getColor(R.color.white))
                sizeBtn3.setTextColor(resources.getColor(R.color.white))
            }

            sizeBtn2.setOnClickListener {
                sizeBtn1.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn2.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.orange_stroke_bg
                    )
                )
                sizeBtn3.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn1.setTextColor(resources.getColor(R.color.white))
                sizeBtn2.setTextColor(resources.getColor(R.color.orange))
                sizeBtn3.setTextColor(resources.getColor(R.color.white))
            }

            sizeBtn3.setOnClickListener {
                sizeBtn1.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn2.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.dark_grey_bg2
                    )
                )
                sizeBtn3.setBackgroundDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.orange_stroke_bg
                    )
                )
                sizeBtn1.setTextColor(resources.getColor(R.color.white))
                sizeBtn2.setTextColor(resources.getColor(R.color.white))
                sizeBtn3.setTextColor(resources.getColor(R.color.orange))
            }
        }
    }
}
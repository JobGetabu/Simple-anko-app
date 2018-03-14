package com.job.simpleanko

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.Gravity
import org.jetbrains.anko.*
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by JOB on 3/11/2018.
 */
class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        frameLayout {
            val textfield = editText {
                hint = "Text to be read"
            }.lparams(width = matchParent) {
                margin = dip(16)
                topMargin = dip(30)
            }
            imageView(R.drawable.ic_android_black_24dp) {
                onClick {
                    this@imageView.imageTintList = (ColorStateList.valueOf(Color.parseColor("#4CAF50")))
                }
            }.lparams(dip(72), dip(72)) {
                gravity = Gravity.CENTER
            }
            linearLayout{

                button("Show Toast"){
                    onClick {
                        toast("${textfield.text}")
                    }
                }
                button("Show SnackBar"){
                    onClick {
                        longSnackbar(this@frameLayout,"${textfield.text}")
                    }
                }
            }.lparams{
                margin = dip(16)
                bottomMargin = dip(72)
                gravity = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
            }
        }
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
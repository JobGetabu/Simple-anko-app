package com.job.simpleanko

import org.jetbrains.anko.*

/**
 * Created by JOB on 3/11/2018.
 */
    class MainActivityUI : AnkoComponent<MainActivity>{
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {

        frameLayout {
         val textfield = editText{
             hint= "Text to be read"
         }.lparams(width = matchParent){
             margin = dip(16)
             topMargin = dip(30)
         }
        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
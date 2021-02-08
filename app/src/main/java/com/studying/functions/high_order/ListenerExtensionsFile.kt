package com.studying.functions.high_order

import androidx.viewpager.widget.ViewPager

fun ViewPager.OnPageSelectedMyCallback(body: (position: Int) -> Unit) {

    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {

        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            body(position)
        }

    })
}
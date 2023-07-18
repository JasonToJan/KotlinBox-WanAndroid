package com.ishuyun.kb_home.bean

/**
 * Created by ishuyun on 7/30/22.
 * mail: ishuyunforani@gmail.com
 */
data class Banner(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)

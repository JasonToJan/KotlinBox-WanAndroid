package com.ishuyun.kb_navigation.bean

/**
 * Created by ishuyun on 8/8/22.
 * mail: ishuyunforani@gmail.com
 */
data class Navi(
    val cid: Int,
    val name: String,
    val articles: List<NaviChild>
) {
    data class NaviChild(
        val id: Int,
        val link: String,
        val title: String,
    )
}

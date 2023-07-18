package com.ishuyun.kb_navigation.bean

/**
 * Created by ishuyun on 8/7/22.
 * mail: ishuyunforani@gmail.com
 */

data class Sys(
    val id: Int,
    val name: String,
    val children: List<SysChild>,
) {
    data class SysChild(
        val id: Int,
        val name: String,
    )
}

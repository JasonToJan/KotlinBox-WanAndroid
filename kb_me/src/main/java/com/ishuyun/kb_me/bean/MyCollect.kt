package com.ishuyun.kb_me.bean

/**
 * Created by ishuyun on 8/25/22.
 * mail: ishuyunforani@gmail.com
 */
typealias c = MyCollect.MyCollectDetail

data class MyCollect(
    val datas: List<MyCollectDetail>,
    val over:Boolean,
    val curPage: Int
) {
    data class MyCollectDetail(
        val author: String,
        val chapterName: String,
        val niceDate: String,
        val title: String,
        val link: String,
        val id: Int
    )
}

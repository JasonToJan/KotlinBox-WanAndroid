package com.ishuyun.kb_home.bean

/**
 * Created by ishuyun on 8/2/22.
 * mail: ishuyunforani@gmail.com
 */
typealias a = Article.ArticleDetail

data class Article(
    val datas: List<ArticleDetail>,
    val over: Boolean,
    val curPage: Int
) {
    data class ArticleDetail(
        val author: String,
        val fresh: Boolean,
        val id: Int,
        val link: String,
        var niceDate: String,
        val shareUser: String,
        val title: String,
        val superChapterId: Int,
        val superChapterName: String,
        var collect: Boolean
    )
}


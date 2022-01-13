package com.example.retrofit

data class QuoteListItem(
    val _id: String,
    val author: String,
    val authorId: String,
    val authorSlug: String,
    val content: String,
    val length: Int,
    val tags: List<String>
)
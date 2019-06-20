package com.udacity.notepad.data

import java.util.Date

// TODO (7) use data class 会自动帮我们生成get，set, copy()方法
data class Note (
    var id: Int = -1,
    var text: String? = null,
    var isPinned: Boolean = false,
    var createdAt: Date = Date(),
    var updatedAt: Date? = null
)

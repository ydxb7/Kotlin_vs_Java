package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

// TODO (5) Create an empty file, it is not a class! 写一个辅助function
val Context.layoutInflater get() = LayoutInflater.from(this)
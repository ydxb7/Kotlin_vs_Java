package com.udacity.notepad.data

import android.content.Context
import org.jetbrains.anko.doAsync

import java.util.concurrent.Executor
import java.util.concurrent.Executors

object DataStore {

//    val EXEC: Executor = Executors.newSingleThreadExecutor()

    // TODO (10) Add lateinit: I promise this will be initialized by the time I use it.
    // TODO (11) @JvmStatic: because kotlin compiler will be avoid static variables.
    //  We force it to be java friendly and become static
    @JvmStatic
    lateinit var notes: NoteDatabase
        private set

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(runnable: Runnable) {
        // TODO (12) Simplify the execute function. Use Anko
//        EXEC.execute(runnable)
        execute{runnable.run()}
    }

    // TODO (12.1)
    fun execute(fn: () -> Unit){
        doAsync { fn() }
    }
}

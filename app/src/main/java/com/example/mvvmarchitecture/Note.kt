package com.example.mvvmarchitecture

import androidx.room.*

@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text") val text: String) {

    @PrimaryKey(autoGenerate = true)
    var id = 0

}

//token
//https://gist.github.com/e5b6576d629b3b63bf4d2141d94ece1a
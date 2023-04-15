package com.example.foody.data.database.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foody.models.Trivia
import com.example.foody.util.Constants

@Entity(tableName = Constants.TRIVIA_TABLE)
class TriviaEntity (
    @Embedded
    var trivia: Trivia
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}
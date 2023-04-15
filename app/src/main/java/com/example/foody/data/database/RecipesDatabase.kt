package com.example.foody.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.foody.data.database.entities.FavoritesEntity
import com.example.foody.data.database.entities.JokeEntity
import com.example.foody.data.database.entities.RecipesEntity
import com.example.foody.data.database.entities.TriviaEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, JokeEntity::class, TriviaEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}
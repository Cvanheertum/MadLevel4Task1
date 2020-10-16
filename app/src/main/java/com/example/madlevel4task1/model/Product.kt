package com.example.madlevel4task1

import androidx.room.*

@Entity(tableName = "product_table")
data class Product (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "quantity")
    var quantity: Int
)
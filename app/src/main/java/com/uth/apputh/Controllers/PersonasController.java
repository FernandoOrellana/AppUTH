package com.uth.apputh.Controllers;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.uth.apputh.Database.DatabaseHelper;
import com.uth.apputh.Modelo.Persona;

public class PersonasController {

    private final DatabaseHelper dbHelper;

    public PersonasController(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

}

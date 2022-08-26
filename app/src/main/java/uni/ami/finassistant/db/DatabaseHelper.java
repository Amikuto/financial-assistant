package uni.ami.finassistant.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

// Данный класс был создан и сделан - "Karambasss"

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Financial_Assistant_DB";
    public static final String DATABASE_TABLE1 = "Operations";
    public static final String DATABASE_TABLE2 = "Purpose";

    // Конструктор
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Вызов при первом создании БД
    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableOperations = "CREATE TABLE " + DATABASE_TABLE1 +
                "( operations_id INTEGER PRIMARY KEY autoincrement, " +
                "description TEXT, " +
                "tag TEXT, " +
                "amount INTEGER NOT NULL, " +
                "date TEXT NOT NULL, " +
                "type INTEGER NOT NULL )";
        String tablePurpose = "CREATE TABLE " + DATABASE_TABLE2 +
                "( purpose_id INTEGER PRIMARY KEY autoincrement, " +
                "start_date TEXT NOT NULL, " +
                "end_date TEXT NOT NULL, " +
                "description TEXT NOT NULL, " +
                "amount INTEGER NOT NULL )";
        // Выполняем инструкции
        db.execSQL(tableOperations);
        db.execSQL(tablePurpose);
    }


    // Вызов при изменении БД
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE1);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE2);
        onCreate(db);
    }
}

package com.homeless.hommie.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.storage.StorageManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "database.db";
    public static final String FAV_MOVIES_TABLE_NAME = "FavouriteMoviesTable";
    public static final String FAV_TV_SHOWS_TABLE_NAME = "FavouriteTVShowsTable";
    public static final String ID = "id";
    public static final String MOVIE_ID = "movie_id";
    public static final String TV_SHOW_ID = "tv_show_id";
    public static final String POSTER_PATH = "poster_path";
    public static final String NAME = "name";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String queryCreateMovieTable = "CREATE TABLE " + FAV_MOVIES_TABLE_NAME + " ( "
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + MOVIE_ID + " INTEGER, "
                + POSTER_PATH + " TEXT, "
                + NAME + " TEXT )";
        String queryCreateTVShowTable = "CREATE TABLE " + FAV_TV_SHOWS_TABLE_NAME + " ( "
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TV_SHOW_ID + " INTEGER, "
                + POSTER_PATH + " TEXT, "
                + NAME + " TEXT )";
        sqLiteDatabase.execSQL(queryCreateMovieTable);
        sqLiteDatabase.execSQL(queryCreateTVShowTable);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

package hr.binom.movieapp;

import android.app.Application;


import androidx.room.Room;


import hr.binom.movieapp.db.AppDatabase;

/**
 * Created by Marin on 11.05.2022..
 */

public class MovieApp extends Application {

    public static AppDatabase DB;

    @Override
    public void onCreate() {
        super.onCreate();
        DB = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "movie_database")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        DB.movieDao().insertMovies(DataStorage.MOVIES);
    }
}

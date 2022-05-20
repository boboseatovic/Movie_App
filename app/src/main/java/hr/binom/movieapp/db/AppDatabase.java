package hr.binom.movieapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by Marin on 11.05.2022..
 */

@Database(entities = {Movie.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
   public abstract MovieDao movieDao();
}

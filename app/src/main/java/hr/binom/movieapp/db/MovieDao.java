package hr.binom.movieapp.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

/**
 * Created by Marin on 11.05.2022..
 */

@Dao
public interface MovieDao {

    @Query("SELECT * FROM Movies")
    LiveData<List<Movie>> getAll();

    @Query("SELECT * FROM Movies ORDER BY rating DESC")
    LiveData<List<Movie>> getAllSortedByRating();

    @Insert
    void insertMovie(Movie movie);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertMovies(List<Movie> movies);
}

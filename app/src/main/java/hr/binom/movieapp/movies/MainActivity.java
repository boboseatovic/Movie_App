package hr.binom.movieapp.movies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import hr.binom.movieapp.DataStorage;
import hr.binom.movieapp.MovieApp;
import hr.binom.movieapp.R;
import hr.binom.movieapp.db.Movie;
import hr.binom.movieapp.db.MovieDao;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE_TITLE = "hr.binom.movieapp.movies.EXTRA_MOVIE_TITLE";
    public static final String EXTRA_IMAGE_URL = "hr.binom.movieapp.movies.EXTRA_IMAGE_URL";
    public static final String EXTRA_RATING = "hr.binom.movieapp.movies.EXTRA_RATING";
    public static final String EXTRA_DESCRIPTION = "hr.binom.movieapp.movies.EXTRA_DESCRIPTION";

    private RecyclerView rvMovies;
    private FloatingActionButton fabAdd;

    private MoviesAdapter moviesAdapter;

    private MovieDao movieDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setAdapter(moviesAdapter);
        setupDatabase();
        setupRecyclerView();
        setupFab();
    }

    private void setupDatabase() {
        movieDao = MovieApp.DB.movieDao();
    }

    private void setupRecyclerView() {
        rvMovies = findViewById(R.id.rv_movies);

        moviesAdapter = new MoviesAdapter(DataStorage.MOVIES);
        moviesAdapter.setOnClickListener(movie -> openMovieDetailsActivity(movie));

        rvMovies.setAdapter(moviesAdapter);


        movieDao.getAllSortedByRating().observe(this, moviesAdapter::update);
    }

    private void openMovieDetailsActivity(@NonNull Movie movie) {
        String imageUrl = movie.imageUrl;
        String title = movie.title;
        String descripton = movie.description;
        String rating = movie.rating.toString();

        Intent intent = new Intent(this, MovieDetailsActivity.class);
        intent.putExtra(EXTRA_DESCRIPTION, descripton);
        intent.putExtra(EXTRA_IMAGE_URL, imageUrl);
        intent.putExtra(EXTRA_MOVIE_TITLE, title);
        intent.putExtra(EXTRA_RATING, rating);
        startActivity(intent);
    }

    private void setupFab() {
        fabAdd = findViewById(R.id.fab_add);
        fabAdd.setOnClickListener(v -> openNewMovieActivity());
    }

    private void openNewMovieActivity() {
        Intent intent = new Intent(this, NewMovieActivity.class);
        startActivity(intent);
    }
}
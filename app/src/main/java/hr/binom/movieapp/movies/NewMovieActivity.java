package hr.binom.movieapp.movies;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import hr.binom.movieapp.MovieApp;
import hr.binom.movieapp.R;
import hr.binom.movieapp.db.Movie;

/**
 * Created by Marin on 11.05.2022..
 */

public class NewMovieActivity extends AppCompatActivity {

   private EditText etTitle;
   private EditText etImageUrl;
   private EditText etDetailsUrl;
   private EditText etRating;
   private Button btnSave;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_new_movie);
      setupViews();
   }

   private void setupViews() {

      etTitle = findViewById(R.id.et_title);
      etImageUrl = findViewById(R.id.et_image_url);
      etDetailsUrl = findViewById(R.id.et_details_url);
      etRating = findViewById(R.id.et_rating);
      btnSave = findViewById(R.id.btn_save);

      btnSave.setOnClickListener(v -> createMovie());
   }

   private void createMovie() {
      String title = etTitle.getText().toString();
      String imageUrl = etImageUrl.getText().toString();
      String detailsUrl = etDetailsUrl.getText().toString();
      String rating = etRating.getText().toString();

      if(TextUtils.isEmpty(title) || TextUtils.isEmpty(imageUrl) || TextUtils.isEmpty(detailsUrl) || TextUtils.isEmpty(rating)) {
         Toast.makeText(this, R.string.alert_all_fields_required, Toast.LENGTH_LONG).show();
         return;
      }

      Movie movie = new Movie();
      movie.title = title;
      String descritpion = "";
      movie.description = descritpion;
      movie.imageUrl = imageUrl;
      movie.detailsUrl = detailsUrl;
      movie.rating = Double.parseDouble(rating);

      MovieApp.DB.movieDao().insertMovie(movie);

      finish();
   }
}

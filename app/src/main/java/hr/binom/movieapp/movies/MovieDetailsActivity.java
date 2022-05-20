package hr.binom.movieapp.movies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import hr.binom.movieapp.R;


public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView imageUrl;
    private TextView title;
    private TextView rating;
    private TextView description;

    private String imageUrlText;
    private String titleText;
    private String ratingText;
    private String descriptionText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie_details);
        Intent intent = getIntent();
        imageUrlText = intent.getStringExtra(MainActivity.EXTRA_IMAGE_URL);
        titleText = intent.getStringExtra(MainActivity.EXTRA_MOVIE_TITLE);
        ratingText = intent.getStringExtra(MainActivity.EXTRA_RATING);
        descriptionText = intent.getStringExtra(MainActivity.EXTRA_DESCRIPTION);

        imageUrl = findViewById(R.id.image_cover);
        title = findViewById(R.id.movie_title);
        rating = findViewById(R.id.movie_rating);
        description = findViewById(R.id.movie_description);


        setView();
    }

    private void setView() {
        Glide.with(imageUrl)
                .load(imageUrlText)
                .placeholder(R.mipmap.ic_launcher_foreground)
                .into(imageUrl);

        title.setText(String.format("%s", titleText));
        rating.setText(String.format("%s", ratingText));
        description.setText(String.format("%s", descriptionText));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        imageUrl = null;
        title = null;
        rating = null;
        description = null;
    }
}

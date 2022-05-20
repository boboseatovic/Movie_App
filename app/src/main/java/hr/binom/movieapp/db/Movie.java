package hr.binom.movieapp.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by Marin on 11.05.2022..
 */

@Entity(tableName = "Movies")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    public Long id;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "description")
    public String description;
    @ColumnInfo(name = "image_url")
    public String imageUrl;
    @ColumnInfo(name = "details_url")
    public String detailsUrl;
    @ColumnInfo(name = "rating")
    public Double rating;

    public Movie() {
    }

    @Ignore
    public Movie(long id, String title, String description ,String imageUrl, String detailsUrl, Double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.detailsUrl = detailsUrl;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", detailsUrl='" + detailsUrl + '\'' +
                ", rating=" + rating +
                '}';
    }
}

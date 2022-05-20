package hr.binom.movieapp.movies;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import hr.binom.movieapp.R;
import hr.binom.movieapp.db.Movie;

/**
 * Created by Marin on 08.05.2022..
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private OnClickListener onClickListener;
    private List<Movie> data;

    public MoviesAdapter(List<Movie> movies) {
        this.data = movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_movie, parent, false);
        return new MoviesViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {

        Movie movie = data.get(position);

        holder.itemView.setOnClickListener(v -> {
            if (onClickListener != null) onClickListener.onItemClick(movie);
        });

        holder.titleTextView.setText(String.format("%d. %s", position + 1, movie.title));
        holder.ratingTextView.setText(String.format("Rating: %.1f", movie.rating));

        Glide.with(holder.coverImageView)
                .load(movie.imageUrl)
                .placeholder(R.mipmap.ic_launcher_foreground)
                .into(holder.coverImageView);
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }

    public void update(List<Movie> data) {
        DiffUtilCallback diffUtilCallback = new DiffUtilCallback(this.data, data);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffUtilCallback);
        diffResult.dispatchUpdatesTo(this);
        this.data = data;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public static class MoviesViewHolder extends RecyclerView.ViewHolder {

        final TextView titleTextView;
        final TextView ratingTextView;
        final ImageView coverImageView;

        public MoviesViewHolder(View view) {
            super(view);
            titleTextView = view.findViewById(R.id.tv_title);
            ratingTextView = view.findViewById(R.id.tv_rating);
            coverImageView = view.findViewById(R.id.iv_cover);
        }
    }

    @FunctionalInterface
    public interface OnClickListener {
        void onItemClick(Movie item);
    }

    public static class DiffUtilCallback extends DiffUtil.Callback {

        private final List<Movie> oldList;
        private final List<Movie> newList;

        public DiffUtilCallback(List<Movie> oldList, List<Movie> newList) {
            this.oldList = oldList;
            this.newList = newList;
        }

        @Override
        public int getOldListSize() {
            return oldList != null ? oldList.size() : 0;
        }

        @Override
        public int getNewListSize() {
            return newList != null ? newList.size() : 0;
        }

        @Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            Movie oldItem = oldList.get(oldItemPosition);
            Movie newItem = newList.get(newItemPosition);
            return oldItem.id.equals(newItem.id);
        }

        @Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            Movie oldItem = oldList.get(oldItemPosition);
            Movie newItem = newList.get(newItemPosition);
            return oldItem.title.equals(newItem.title)
                    && oldItem.rating.equals(newItem.rating)
                    && oldItem.imageUrl.equals(newItem.imageUrl);
        }
    }
}

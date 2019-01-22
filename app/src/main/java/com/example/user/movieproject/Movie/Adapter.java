package com.example.user.movieproject.Movie;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.movieproject.R;
import java.util.List;
public class Adapter  extends  RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Movie> movies;
    public Adapter(Context context, List<Movie> movies) {
        this.movies = movies;
        this.inflater=LayoutInflater.from(context);}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       View view=inflater.inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view); }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
    Movie movie=movies.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            viewHolder.imageView.setImageIcon(movie.getImage());
        }
        viewHolder.nameMovie.setText(movie.getName());
    viewHolder.producer.setText(movie.getProducer());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameMovie, producer;
        public ViewHolder(View view) {
            super(view);
            imageView=(ImageView)view.findViewById(R.id.image);
            nameMovie=(TextView) view.findViewById(R.id.name);
            producer = (TextView) view.findViewById(R.id.producer);
        }
    }
}

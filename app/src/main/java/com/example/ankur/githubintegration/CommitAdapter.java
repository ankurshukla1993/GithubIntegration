package com.example.ankur.githubintegration;

/**
 * Created by Ankur on 7/9/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CommitAdapter extends RecyclerView.Adapter<CommitAdapter.MyViewHolder> {

    private List<Commit> commitList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView author, number, message;

        public MyViewHolder(View view) {
            super(view);
            author = (TextView) view.findViewById(R.id.author);
            number = (TextView) view.findViewById(R.id.number);
            message = (TextView) view.findViewById(R.id.message);
        }
    }


    public CommitAdapter(List<Commit> commitList) {
        this.commitList = commitList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlecommit, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Commit movie = commitList.get(position);
        holder.author.setText(movie.getAuthor());
        holder.number.setText(movie.getNumber());
        holder.message.setText(movie.getMessage());
    }

    @Override
    public int getItemCount() {
        return commitList.size();
    }
}

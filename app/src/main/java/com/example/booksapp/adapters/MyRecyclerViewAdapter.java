package com.example.booksapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.booksapp.MainActivity;
import com.example.booksapp.R;
import com.example.booksapp.models.NewBookModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<NewBookModel> bookModels;
    private MainActivity mainActivity;

    public MyRecyclerViewAdapter(MainActivity _mainActivity, Context _context, ArrayList<NewBookModel> _bookModels) {
        this.mContext = _context;
        this.bookModels = _bookModels;
        this.mainActivity = _mainActivity;
    }


    @NonNull
    @Override
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyRecyclerViewAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.book_new_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.MyViewHolder holder, int position) {

        Picasso.get().load(bookModels.get(position).getBookThumbnail()).placeholder(R.mipmap.ic_launcher_round)
                .into(holder.book_iv);
        holder.book_iv.setOnClickListener(view -> {
            mainActivity.onItemClicked(bookModels.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return bookModels.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView book_iv;


        MyViewHolder(View view) {
            super(view);
            book_iv = view.findViewById(R.id.book_iv);


        }


    }
}

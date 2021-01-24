package com.example.recyclerviewtutorial2.book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtutorial2.R;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<Book> mBooks;

    public void setData(List<Book> list) {
        mBooks = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = mBooks.get(position);
        if (book == null) {
            return;
        } else {
            holder.imgBook.setImageResource(book.getResourceId());
            holder.tvTitle.setText(book.getTitle());
        }
    }

    @Override
    public int getItemCount() {

        if (mBooks != null) {
            return mBooks.size();
        }
        return 0;
    }

    class BookViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBook;
        TextView tvTitle;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBook = itemView.findViewById(R.id.img_book);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}

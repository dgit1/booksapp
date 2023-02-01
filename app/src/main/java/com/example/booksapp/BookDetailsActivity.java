package com.example.booksapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booksapp.databaseHelper.DataBaseHelper;
import com.example.booksapp.models.NewBookModel;
import com.squareup.picasso.Picasso;

import java.util.Locale;

public class BookDetailsActivity extends AppCompatActivity {

    Button book_add_shelf_btn,book_preview_btn;
    TextView about_tv,author_name_tv,book_name_tv;
    NewBookModel newBookModel;
    ImageView book_iv;
    DataBaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detials);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        myDb = new DataBaseHelper(BookDetailsActivity.this);


        newBookModel = (NewBookModel) getIntent().getSerializableExtra("bookObj");

        book_iv = findViewById(R.id.book_iv);
        Picasso.get().load(newBookModel.getBookThumbnail()).placeholder(R.mipmap.ic_launcher_round)
                .into(book_iv);
        book_add_shelf_btn = findViewById(R.id.book_add_shelf_btn);
        book_add_shelf_btn.setOnClickListener(view->{

            boolean isSuccess = myDb.insertBookData(newBookModel);


            if(isSuccess){
                Toast.makeText(this, "Book added Successfully", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Cannot add Book", Toast.LENGTH_SHORT).show();
            }
        });


        book_preview_btn = findViewById(R.id.book_preview_btn);
        book_preview_btn.setOnClickListener(view->{
            Uri uri = Uri.parse(newBookModel.getBookPDFLink());
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri,"application/pdf");
            startActivity(intent);

        });
        book_name_tv = findViewById(R.id.book_name_tv);
        book_name_tv.setText(newBookModel.getBookName());

        author_name_tv = findViewById(R.id.author_name_tv);
        author_name_tv.setText(newBookModel.getBookAuthor());

        about_tv = findViewById(R.id.about_tv);
        about_tv.setText(newBookModel.getBookDetails());
        about_tv.setMovementMethod(new ScrollingMovementMethod());


        if(myDb.getBookData(newBookModel.getBookName())){
            book_add_shelf_btn.setEnabled(false);
        }else{
            book_add_shelf_btn.setEnabled(true);
        }

    }
}

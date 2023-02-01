package com.example.booksapp.databaseHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.booksapp.models.NewBookModel;
import com.example.booksapp.models.UserModel;

import java.util.ArrayList;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "books_details_app.db";
    public static final int DATABASE_VERSION = 1;

    //User Table
    public static final String TABLE_USER = "user_profile";
    //Books Table
    public static final String TABLE_BOOKS = "user_books";


    //Profile Table Attributes
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_EMAIL = "user_email";
    public static final String COLUMN_PASSWORD = "user_password";

    //Bok Table Attributes
    public static final String COLUMN_BOOK_ID = "ID";
    public static final String COLUMN_BOOK_NAME = "book_name";
    public static final String COLUMN_BOOK_DETAILS = "book_details";
    public static final String COLUMN_BOOK_AUTHOR = "book_author";
    public static final String COLUMN_BOOK_CATEGORY = "book_category";
    public static final String COLUMN_BOOK_PDF_LINK = "book_pdf_link";
    public static final String COLUMN_BOOK_THUMBNAIL = "book_thumbnail";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_EMAIL + " TEXT,"
                + COLUMN_PASSWORD + " TEXT " + ")";

        String CREATE_BOOKS_TABLE = "CREATE TABLE " + TABLE_BOOKS + "("
                + COLUMN_BOOK_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_BOOK_NAME + " TEXT,"
                + COLUMN_BOOK_AUTHOR + " TEXT, " + COLUMN_BOOK_DETAILS + " TEXT, "
                + COLUMN_BOOK_CATEGORY + " TEXT, " + COLUMN_BOOK_PDF_LINK + " TEXT, "
                + COLUMN_BOOK_THUMBNAIL + " TEXT " + ")";


        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_BOOKS_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BOOKS);

        onCreate(db);
    }

    public boolean insertUserData(String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_EMAIL, email);
        contentValues.put(COLUMN_PASSWORD, password);


        long result = db.insert(TABLE_USER, null, contentValues);

        if (result == -1)
            return false;
        else {
            return true;
        }
    }

    public UserModel getUserData(String email) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_USER + " WHERE " + COLUMN_EMAIL + " = '" + email + "'"  , null);

        UserModel userModel = null;

        if (cursor.moveToFirst()) {
            userModel = new UserModel();

            userModel.setiD(cursor.getString(0));
            userModel.setUserEmail(cursor.getString(1));
            userModel.setUserPass(cursor.getString(2));

        }

        return userModel;
    }


    public boolean insertBookData(NewBookModel newBookModel) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_BOOK_NAME, newBookModel.getBookName());
        contentValues.put(COLUMN_BOOK_DETAILS, newBookModel.getBookDetails());
        contentValues.put(COLUMN_BOOK_AUTHOR, newBookModel.getBookAuthor());
        contentValues.put(COLUMN_BOOK_CATEGORY, newBookModel.getBookCategory());
        contentValues.put(COLUMN_BOOK_PDF_LINK, newBookModel.getBookPDFLink());
        contentValues.put(COLUMN_BOOK_THUMBNAIL, newBookModel.getBookThumbnail());


        long result = db.insert(TABLE_BOOKS, null, contentValues);

        if (result == -1)
            return false;
        else {
            return true;
        }
    }

    public boolean getBookData(String bookName) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_BOOKS + " WHERE " + COLUMN_BOOK_NAME + " = '" + bookName + "'"  , null);

        UserModel userModel = null;

        if (cursor.moveToFirst()) {
            return true;

        }else{
            return false;
        }


    }

    public ArrayList<NewBookModel> getAllBooksData() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_BOOKS, null);

        ArrayList<NewBookModel> bookModelArrayList = new ArrayList<>();
        ;


        if (cursor.getCount() == 0) {

            return bookModelArrayList;

        } else {


            while (cursor.moveToNext()) {

                NewBookModel bookModel = new NewBookModel();


                bookModel.setBookName(cursor.getString(1));
                bookModel.setBookDetails(cursor.getString(2));
                bookModel.setBookAuthor(cursor.getString(3));
                bookModel.setBookCategory(cursor.getString(4));
                bookModel.setBookPDFLink(cursor.getString(5));
                bookModel.setBookThumbnail(cursor.getString(6));


                bookModelArrayList.add(bookModel);

            }
        }


        return bookModelArrayList;
    }


}

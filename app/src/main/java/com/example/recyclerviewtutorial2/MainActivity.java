package com.example.recyclerviewtutorial2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtutorial2.book.Book;
import com.example.recyclerviewtutorial2.category.Category;
import com.example.recyclerviewtutorial2.category.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Book> listBookEnglish = new ArrayList<>();
        listBookEnglish.add(new Book(R.drawable.e1, "English 1"));
        listBookEnglish.add(new Book(R.drawable.e5, "English 5"));
        listBookEnglish.add(new Book(R.drawable.e6, "English 6"));
        listBookEnglish.add(new Book(R.drawable.e8, "English 8"));
        listBookEnglish.add(new Book(R.drawable.e12, "English 12"));

        List<Book> listBookMath = new ArrayList<>();
        listBookMath.add(new Book(R.drawable.math1, "Math 1"));
        listBookMath.add(new Book(R.drawable.math4, "Math 4"));
        listBookMath.add(new Book(R.drawable.math5, "Math 5"));
        listBookMath.add(new Book(R.drawable.math8, "Math 8"));
        listBookMath.add(new Book(R.drawable.math9, "Math 9"));

        List<Book> listBookLiterature = new ArrayList<>();
        listBookLiterature.add(new Book(R.drawable.literature6, "Literature 6"));
        listBookLiterature.add(new Book(R.drawable.literature9, "Literature 9"));
        listBookLiterature.add(new Book(R.drawable.literature10, "Literature 10"));
        listBookLiterature.add(new Book(R.drawable.literature11, "Literature 11"));
        listBookLiterature.add(new Book(R.drawable.literature12, "Literature 12"));

        List<Book> listBookChemistry = new ArrayList<>();
        listBookChemistry.add(new Book(R.drawable.chemistry8, "Chemistry 8"));
        listBookChemistry.add(new Book(R.drawable.chemistry9, "Chemistry 9"));
        listBookChemistry.add(new Book(R.drawable.chemistry10, "Chemistry 10"));
        listBookChemistry.add(new Book(R.drawable.chemistry11, "Chemistry 11"));
        listBookChemistry.add(new Book(R.drawable.chemistry12, "Chemistry 12"));

        List<Book> listBookBiology = new ArrayList<>();
        listBookBiology.add(new Book(R.drawable.biology6, "Biology 6"));
        listBookBiology.add(new Book(R.drawable.biology7, "Biology 7"));
        listBookBiology.add(new Book(R.drawable.biology8, "Biology 8"));
        listBookBiology.add(new Book(R.drawable.biology9, "Biology 9"));
        listBookBiology.add(new Book(R.drawable.biology11, "Biology 11"));

        listCategory.add(new Category("English", listBookEnglish));
        listCategory.add(new Category("Math", listBookMath));
        listCategory.add(new Category("Literature", listBookLiterature));
        listCategory.add(new Category("Chemistry", listBookChemistry));
        listCategory.add(new Category("Biology", listBookBiology));

        return listCategory;
    }
}


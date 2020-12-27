package com.dql.doanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import com.dql.doanandroid.adapter.DishAdapter;
import com.dql.doanandroid.adapter.EvaluateAdapter;
import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.model.Dish;
import com.dql.doanandroid.model.Evaluate;

import java.util.List;

import static com.dql.doanandroid.R.id.lvAllEvaluate;

public class AllEvaluate extends AppCompatActivity {

    private ListView lvAllEvaluate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);
        getViewById();

        initWidget();
    }

    private void initWidget() {
        String shopId = getIntent().getStringExtra("shopId");
        try {
            DatabaseHelper db = new DatabaseHelper(this);
            List<Evaluate> lstEvaluate = db.getEvaluateById(shopId);
            EvaluateAdapter evaluateAdapter = new EvaluateAdapter(this,R.layout.item_evaluate,lstEvaluate);

            lvAllEvaluate.setAdapter(evaluateAdapter);
        } catch (Exception e) {
            System.err.println("line AllEvaluate.java:40 - e.getMessage(): "+e.getMessage());
        }
    }

    private void getViewById() {
        lvAllEvaluate=findViewById(R.id.lvAllEvaluate);
    }
}
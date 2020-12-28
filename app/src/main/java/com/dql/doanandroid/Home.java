package com.dql.doanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

import com.dql.doanandroid.adapter.NearestAdapter;
import com.dql.doanandroid.adapter.ShopAdapter;
import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.model.Shop;

import java.util.List;

import android.view.View.OnClickListener;

public class Home extends AppCompatActivity {

    private GridView gvNearest;
    private NearestAdapter nearestAdapter;
    private DatabaseHelper db;
    private List<Shop> lstShop;
    private EditText txtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getViewById();
        initWidget();
        addEvent();
    }

    private void addEvent() {
        gvNearest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Shop item = (Shop) parent.getItemAtPosition(position);
                Intent intent = new Intent(getBaseContext(), Detail.class);
                intent.putExtra("shopId", item.getShopId() + "");
                startActivity(intent);
            }
        });
        txtSearch.setOnClickListener(txtSearch_click);
    }
    private OnClickListener txtSearch_click = new OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(getBaseContext(), Search.class);
          startActivity(intent);
      }
    };

    private void initWidget() {
        db = new DatabaseHelper(this);
        lstShop = db.getNearestShop("bình thạnh");
        System.err.println("line Home.java:33 - lstShop.size(): "+lstShop.size());
        try {
            if (nearestAdapter == null) {
                nearestAdapter = new NearestAdapter(this, R.layout.dish_item_rate, lstShop);
            }
            gvNearest.setAdapter(nearestAdapter);
        } catch (Exception e) {
            System.err.println("line Home.java:40 - e.getMessage(): " + e.getMessage());
        }
    }

    private void getViewById() {
        gvNearest = findViewById(R.id.gvNearest);
        txtSearch=findViewById(R.id.txtSearch);
    }
}
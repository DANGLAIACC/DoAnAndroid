package com.dql.doanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.dql.doanandroid.adapter.ShopAdapter;
import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.model.Shop;

import java.util.List;

public class Search extends AppCompatActivity {

    private DatabaseHelper db;
    private ShopAdapter shopAdapter;
    private List<Shop> lstShop;

    private ListView lvSearchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getViewById();
        db = new DatabaseHelper(this);
        lstShop = db.getAllShop();
        setAdapter();
        addEvent();
    }

    private void addEvent() {
        lvSearchResult.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Shop item = (Shop) parent.getItemAtPosition(position);
                Intent intent = new Intent(getBaseContext(), Detail.class);
                intent.putExtra("shopId", item.getShopId() + "");
                startActivity(intent);
            }
        });
    }

    private void getViewById() {
        lvSearchResult = findViewById(R.id.lvSearchResult);
    }

    private void setAdapter() {
        if (shopAdapter == null) {
            shopAdapter = new ShopAdapter(this, R.layout.shop_item, lstShop);
        }
        lvSearchResult.setAdapter(shopAdapter);
    }
}
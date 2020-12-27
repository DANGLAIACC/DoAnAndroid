package com.dql.doanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.DropBoxManager;
import android.widget.ListView;

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
    }

    private void getViewById() {
        lvSearchResult=findViewById(R.id.lvSearchResult);
    }
    private void setAdapter(){
        if(shopAdapter ==null)
        {
            shopAdapter = new ShopAdapter(this, R.layout.dish_item,lstShop);
        }
        lvSearchResult.setAdapter(shopAdapter);
    }
}
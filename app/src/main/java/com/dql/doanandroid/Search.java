package com.dql.doanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dql.doanandroid.adapter.ShopAdapter;
import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.model.Shop;

import java.util.List;

import static com.dql.doanandroid.R.id.txtSearch;

public class Search extends AppCompatActivity {

    private DatabaseHelper db;
    private ShopAdapter shopAdapter;

    private ListView lvSearchResult;
    private EditText txtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getViewById();
        db = new DatabaseHelper(this);
        setAdapter(db.getAllShop());
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

        txtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s != null && s.length() > 0 && s.charAt(s.length() - 1) == ' ') {
                    setAdapter(db.getNearestShop(s.toString()));
                }
            }
        });
    }

    private void getViewById() {
        lvSearchResult = findViewById(R.id.lvSearchResult);
        txtSearch = findViewById(R.id.txtSearch);
    }

    private void setAdapter(List<Shop> lst) {
        System.err.println("line Search.java:76 - lst.size(): " + lst.size());
        shopAdapter = new ShopAdapter(this, R.layout.item_shop, lst);
        lvSearchResult.setAdapter(shopAdapter);
    }
}
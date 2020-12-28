package com.dql.doanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dql.doanandroid.adapter.DishAdapter;
import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.global.GetImageFromUrl;
import com.dql.doanandroid.model.Dish;
import com.dql.doanandroid.model.Shop;

import java.util.List;

public class Detail extends AppCompatActivity {

    private Shop shop;
    private DatabaseHelper db;
    private DishAdapter dishAdapter;

    private ImageView detailImg;

    private TextView detailShopName, detailRate, detailCount, detailArticle, allMenu, detailAllEvaluate;
    private Button btnBestSeller, btnNonVeg, btnDrink, btnVeg;
    private ListView lvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int shopId = Integer.parseInt(getIntent().getStringExtra("shopId"));
        db = new DatabaseHelper(this);
        shop = db.getShopById(shopId);

        getViewById();
        initWidget();
        addEvent();
        Toast.makeText(this, shop.getShopName(), Toast.LENGTH_SHORT).show();
    }

    private void addEvent() {
        detailAllEvaluate.setOnClickListener(detailAllEvaluate_click);
    }

    private OnClickListener detailAllEvaluate_click = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getBaseContext(), AllEvaluate.class);
            intent.putExtra("shopId", shop.getShopId() + "");
            startActivity(intent);
        }
    };

    private void getViewById() {
        detailImg = findViewById(R.id.detailImg);
        detailShopName = findViewById(R.id.detailShopName);
        detailRate = findViewById(R.id.detailRate);
        detailCount = findViewById(R.id.detailCount);
        detailArticle = findViewById(R.id.detailArticle);

        detailAllEvaluate = findViewById(R.id.detailAllEvaluate);
        allMenu = findViewById(R.id.allMenu);

        btnBestSeller = findViewById(R.id.btnBestSeller);
        btnNonVeg = findViewById(R.id.btnNonVeg);
        btnVeg = findViewById(R.id.btnVeg);
        btnDrink = findViewById(R.id.btnDrink);

        lvDetail = findViewById(R.id.lvDetail);
    }

    private void initWidget() {
        String strUrl = shop.getShopImg();
        if (!strUrl.startsWith("https://")) {
            strUrl = "https://images.foody.vn/res/" + strUrl;
        }
        new GetImageFromUrl(detailImg)
                .execute(strUrl);
        detailShopName.setText(shop.getShopName());
        detailArticle.setText(shop.getShopArticle());
        try {
            db = new DatabaseHelper(this);
            List<Dish> lstDish = db.getDishInShop(shop.getShopId(), 0);
//            System.err.println("line Detail.java:70 - lstDish.size(): " + lstDish.size());
            dishAdapter = new DishAdapter(this, R.layout.item_shop, lstDish);
            lvDetail.setAdapter(dishAdapter);
        } catch (Exception e) {
            System.err.println("line Detail.java:77 - e.getMessage(): " + e.getMessage());
        }
    }

}
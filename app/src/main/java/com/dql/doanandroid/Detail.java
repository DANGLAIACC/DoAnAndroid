package com.dql.doanandroid;

import android.os.Bundle;
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

    private TextView detailShopName, detailRate, detailCount, detailArticle, allMenu;
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
        Toast.makeText(this, shop.getShopName(), Toast.LENGTH_SHORT).show();
    }

    private void getViewById() {
        detailImg = findViewById(R.id.detailImg);
        detailShopName = findViewById(R.id.detailShopName);
        detailRate = findViewById(R.id.detailRate);
        detailCount = findViewById(R.id.detailCount);
        detailArticle = findViewById(R.id.detailArticle);

        allMenu = findViewById(R.id.allMenu);

        btnBestSeller = findViewById(R.id.btnBestSeller);
        btnNonVeg = findViewById(R.id.btnNonVeg);
        btnVeg = findViewById(R.id.btnVeg);
        btnDrink = findViewById(R.id.btnDrink);

        lvDetail = findViewById(R.id.lvDetail);
    }

    private void initWidget() {
        new GetImageFromUrl(detailImg)
                .execute("https://images.foody.vn/res/" + shop.getShopImg());
        detailShopName.setText(shop.getShopName());
        detailArticle.setText(shop.getShopArticle());
        try {
            db = new DatabaseHelper(this);
            List<Dish> lstDish = db.getDishInShop(shop.getShopId(), 0);
//            System.err.println("line Detail.java:70 - lstDish.size(): " + lstDish.size());
            dishAdapter = new DishAdapter(this, R.layout.shop_item, lstDish);
            lvDetail.setAdapter(dishAdapter);
        } catch (Exception e) {
            System.err.println("line Detail.java:77 - e.getMessage(): " + e.getMessage());
        }
    }


//    private void initListViewDetail() {
//        try {
//        System.err.println("line Detail.java:70 - lstDish.size(): " + lstDish.size());
//
//            DishAdapter dishAdapter = new DishAdapter(this, R.layout.dish_item, lstDish);
//            lvDetail.setAdapter(dishAdapter);
//        }catch (Exception e)
//        {
//            System.err.println("line Detail.java:79 - e.getMessage(): "+e.getMessage());
//        }
//    }
}
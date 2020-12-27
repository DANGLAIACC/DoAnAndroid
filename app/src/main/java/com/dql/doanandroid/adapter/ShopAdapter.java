package com.dql.doanandroid.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dql.doanandroid.R;
import com.dql.doanandroid.global.GetImageFromUrl;
import com.dql.doanandroid.model.Shop;

import java.util.List;

public class ShopAdapter extends ArrayAdapter<Shop> {

    private Context context;
    private int resource;
    private List<Shop> lstShop;

    public ShopAdapter(Context context, int resource, List<Shop> lstShop) {
        super(context, resource, lstShop);
        this.context = context;
        this.resource = resource;
        this.lstShop = lstShop;
//        System.err.println("line ShopAdapter.java:26 - lstShop.size(): " + lstShop.size());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.dish_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.dishImgContent = convertView.findViewById(R.id.dishImgContent);
            viewHolder.dishName = convertView.findViewById(R.id.dishName);
            viewHolder.dishPrice = convertView.findViewById(R.id.dishPrice);
            viewHolder.dishArticle = convertView.findViewById(R.id.dishArtical);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Shop s = lstShop.get(position);
        viewHolder.dishName.setText(s.getShopName());
        viewHolder.dishPrice.setText(s.getShopAddress());
        viewHolder.dishArticle.setText(s.getShopArticle());
        new GetImageFromUrl(viewHolder.dishImgContent)
                .execute("https://images.foody.vn/res/"+s.getShopImg());

//        return super.getView(position, convertView,parent);
        return convertView;
    }
    public class ViewHolder {
        private ImageView dishImgContent;
        private TextView dishName, dishPrice, dishArticle;

    }
}

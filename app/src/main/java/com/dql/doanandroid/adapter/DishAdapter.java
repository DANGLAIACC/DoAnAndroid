package com.dql.doanandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dql.doanandroid.R;
import com.dql.doanandroid.global.GetImageFromUrl;
import com.dql.doanandroid.model.Dish;

import java.util.List;

public class DishAdapter extends ArrayAdapter<Dish> {

    private Context context;
    private int resource;
    private List<Dish> lst;

    public DishAdapter(Context context, int resource, List<Dish> lst) {
        super(context, resource, lst);
        this.context = context;
        this.resource = resource;
        this.lst = lst;
//        System.err.println("line ShopAdapter.java:26 - lstShop.size(): " + lstShop.size());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_shop, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.dishImgContent = convertView.findViewById(R.id.dishImgContent);
            viewHolder.dishName = convertView.findViewById(R.id.dishName);
            viewHolder.dishPrice = convertView.findViewById(R.id.dishPrice);
            viewHolder.dishArticle = convertView.findViewById(R.id.dishArtical);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Dish s = lst.get(position);
        viewHolder.dishName.setText(s.getDishName());
        viewHolder.dishPrice.setText(s.getDishPrice()+"");
        viewHolder.dishArticle.setText(s.getDishArticle());
        new GetImageFromUrl(viewHolder.dishImgContent)
                .execute("https://images.foody.vn/res/"+s.getDishImg());

        return convertView;
    }
    public class ViewHolder {
        private ImageView dishImgContent;
        private TextView dishName, dishPrice, dishArticle;

    }
}

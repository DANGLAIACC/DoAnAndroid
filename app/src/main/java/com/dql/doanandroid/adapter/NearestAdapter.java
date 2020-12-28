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
import com.dql.doanandroid.model.Shop;

import java.util.List;

public class NearestAdapter extends ArrayAdapter<Shop> {

    private Context context;
    private int resource;
    private List<Shop> lst;

    public NearestAdapter(Context context, int resource, List<Shop> lst) {
        super(context, resource, lst);
        this.context = context;
        this.resource = resource;
        this.lst = lst;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.dish_item_rate, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.dishName = convertView.findViewById(R.id.dishName);
//            viewHolder.evaRate = convertView.findViewById(R.id.evaRate);
//            viewHolder.evaCount = convertView.findViewById(R.id.evaCount);
            viewHolder.dishImgContent = convertView.findViewById(R.id.shopImg);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Shop e = lst.get(position);
        viewHolder.dishName.setText(e.getShopName());
        new GetImageFromUrl(viewHolder.dishImgContent)
                .execute("https://images.foody.vn/res/"+e.getShopImg());
        return convertView;
    }

    private class ViewHolder {
        private TextView dishName, evaRate, evaCount;
        ImageView dishImgContent;
    }
}

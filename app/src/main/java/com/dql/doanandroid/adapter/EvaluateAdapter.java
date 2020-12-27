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
import com.dql.doanandroid.model.Evaluate;
import com.dql.doanandroid.model.Shop;

import java.util.List;

public class EvaluateAdapter extends ArrayAdapter<Evaluate> {

    private Context context;
    private int resource;
    private List<Evaluate> lst;

    public EvaluateAdapter(Context context, int resource, List<Evaluate> lst) {
        super(context, resource, lst);
        this.context = context;
        this.resource = resource;
        this.lst = lst;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_evaluate, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.usrName = convertView.findViewById(R.id.usrName);
            viewHolder.evaTitle = convertView.findViewById(R.id.evaTitle);
            viewHolder.evaTime = convertView.findViewById(R.id.evaTime);
            viewHolder.evaContent = convertView.findViewById(R.id.evaContent);
            viewHolder.evaRate = convertView.findViewById(R.id.evaRate);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Evaluate e = lst.get(position);
        viewHolder.usrName.setText(e.getUsrUsr());
        viewHolder.evaTitle.setText(e.getEvaTitle());
        viewHolder.evaContent.setText(e.getEvaContent());
        viewHolder.evaTime.setText(e.getEvaTime());
        viewHolder.evaRate.setText(e.getEvaRate()+"");

//        new GetImageFromUrl(viewHolder.dishImgContent)
//                .execute("https://images.foody.vn/res/"+s.getShopImg());
        return convertView;
    }
    private class ViewHolder {
        private TextView usrName, evaTime, evaTitle, evaContent, evaRate;
    }
}

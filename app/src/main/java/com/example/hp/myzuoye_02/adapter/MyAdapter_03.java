package com.example.hp.myzuoye_02.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hp.myzuoye_02.Bean01;
import com.example.hp.myzuoye_02.R;

import java.util.ArrayList;

/**
 * Created by hp on 2017/10/17.
 */
public class MyAdapter_03 extends BaseAdapter {
    private ArrayList<Bean01.ResultBean.ListBean> list;
    private Context context;

    public MyAdapter_03(ArrayList<Bean01.ResultBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    class  ViewHolder{
        ImageView iv_demo1;
        TextView tv_demo1;
        TextView tv_demo2;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.aaa,null);
            holder.iv_demo1 = (ImageView) view.findViewById(R.id.iv_demo1);
            holder.tv_demo1 = (TextView) view.findViewById(R.id.tv_demo1);
            holder.tv_demo2 = (TextView) view.findViewById(R.id.tv_demo2);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        Glide.with(context).load(list.get(i).getFirstImg()).into(holder.iv_demo1);
        holder.tv_demo1.setText(list.get(i).getTitle());
        holder.tv_demo2.setText(list.get(i).getSource());
        return view;
    }
}

package com.example.hp.myzuoye_02.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.hp.myzuoye_02.Bean;
import com.example.hp.myzuoye_02.R;

import java.util.ArrayList;

/**
 * Created by hp on 2017/10/17.
 */
public class MyAdapter_02 extends RecyclerView.Adapter<MyAdapter_02.ViewHolder> {
    private ArrayList<Bean.ResultBean.ListBean> listBeen;
    private Context context;

    public MyAdapter_02(ArrayList<Bean.ResultBean.ListBean> listBeen, Context context) {
        this.listBeen = listBeen;
        this.context = context;
    }

    @Override
    public MyAdapter_02.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(context).inflate(R.layout.aaa, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyAdapter_02.ViewHolder holder, int position) {
        Glide.with(context).load(listBeen.get(position).getFirstImg()).into(holder.iv_demo1);
        holder.tv_demo1.setText(listBeen.get(position).getTitle());
        holder.tv_demo2.setText(listBeen.get(position).getSource());

    }

    @Override
    public int getItemCount() {
        return listBeen.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv_demo1;
        private  TextView tv_demo1;
        private  TextView tv_demo2;

        public ViewHolder(View itemView) {
            super(itemView);
           iv_demo1 =(ImageView) itemView.findViewById(R.id.iv_demo1);
            tv_demo1 =(TextView) itemView.findViewById(R.id.tv_demo1);
            tv_demo2 =(TextView) itemView.findViewById(R.id.tv_demo2);
        }
    }
}

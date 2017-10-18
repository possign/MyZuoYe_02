package com.example.hp.myzuoye_02.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hp.myzuoye_02.Bean;
import com.example.hp.myzuoye_02.R;
import com.example.hp.myzuoye_02.adapter.MyAdapter_02;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment_03 extends Fragment {


    private RecyclerView rec_demo01;

    public BlankFragment_03() {
        // Required empty public constructor
    }
    private List<Bean.ResultBean.ListBean> list;
    private ArrayList<Bean.ResultBean.ListBean> arrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank_fragment_03, container, false);
        initdata();
        initView(inflate);
        return inflate;
    }

    private void initdata() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
                StringRequest tag = new StringRequest(Request.Method.GET, "http://v.juhe.cn/weixin/query?key=a332c6b34264527ac142764eaed9364d&pno=2&ps=49", new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Bean bean = gson.fromJson(response, Bean.class);
                        list = bean.getResult().getList();
                        arrayList.addAll(list);
                        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

                        MyAdapter_02 myAdapter_02 = new MyAdapter_02(arrayList, getActivity());
                        rec_demo01.setAdapter(myAdapter_02);
                        rec_demo01.setLayoutManager(staggeredGridLayoutManager);
                        myAdapter_02.notifyDataSetChanged();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.toString());

                    }
                });
                requestQueue.add(tag);
            }
        });
    }


    private void initView(View inflate) {
        rec_demo01 = (RecyclerView) inflate.findViewById(R.id.rec_demo01);
    }
}

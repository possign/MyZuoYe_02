package com.example.hp.myzuoye_02.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.hp.myzuoye_02.Bean;
import com.example.hp.myzuoye_02.Bean01;
import com.example.hp.myzuoye_02.R;
import com.example.hp.myzuoye_02.adapter.MyAdapter_02;
import com.example.hp.myzuoye_02.adapter.MyAdapter_03;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment_02 extends Fragment {


    private ListView lv_demo1;

    public BlankFragment_02() {
        // Required empty public constructor
    }
    private List<Bean01.ResultBean.ListBean> list;
    private ArrayList<Bean01.ResultBean.ListBean> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank_fragment_02, container, false);
        initView(inflate);
        initdata();
        return inflate;
    }


    private void initdata() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
                StringRequest tag = new StringRequest(Request.Method.GET, "http://v.juhe.cn/weixin/query?key=a332c6b34264527ac142764eaed9364d&pno=2&ps=5", new Response.Listener<String>() {




                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Bean01 bean01 = gson.fromJson(response, Bean01.class);
                        list = bean01.getResult().getList();
                        arrayList.addAll(list);
                        MyAdapter_03 myAdapter_03 = new MyAdapter_03(arrayList,getActivity());
                        lv_demo1.setAdapter(myAdapter_03);
                        myAdapter_03.notifyDataSetChanged();


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
        lv_demo1 = (ListView) inflate.findViewById(R.id.lv_demo1);
    }
}

package com.example.hp.myzuoye_02;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.myzuoye_02.adapter.MyAdapter;
import com.example.hp.myzuoye_02.fragment.BlankFragment_01;
import com.example.hp.myzuoye_02.fragment.BlankFragment_02;
import com.example.hp.myzuoye_02.fragment.BlankFragment_03;
import com.example.hp.myzuoye_02.fragment.BlankFragment_04;
import com.example.hp.myzuoye_02.fragment.BlankFragment_05;
import com.example.hp.myzuoye_02.fragment.BlankFragment_06;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment01 extends Fragment {


    private TabLayout tablayout;
    private ViewPager viewpager;
    private ArrayList<String> strings;
    private ArrayList<Fragment>fragments;

    public BlankFragment01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank_fragment01, container, false);

        initView(inflate);
        initadata();
        MyAdapter myAdapter = new MyAdapter(getChildFragmentManager(),strings,fragments);
        viewpager.setAdapter(myAdapter);

        return inflate;
    }

    private void initadata() {
        strings = new ArrayList<>();

        strings.add("分类1");
        strings.add("分类2");
        strings.add("分类3");
        strings.add("分类4");
        strings.add("分类5");
        strings.add("分类6");


        fragments = new ArrayList<>();
        fragments.add(new BlankFragment_01());
        fragments.add(new BlankFragment_02());
        fragments.add(new BlankFragment_03());
        fragments.add(new BlankFragment_04());
        fragments.add(new BlankFragment_05());
        fragments.add(new BlankFragment_06());

    }

    private void initView(View inflate) {
        tablayout = (TabLayout) inflate.findViewById(R.id.tablayout);
        viewpager = (ViewPager) inflate.findViewById(R.id.viewpager);
        tablayout.setupWithViewPager(viewpager);


    }
}

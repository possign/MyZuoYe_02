package com.example.hp.myzuoye_02;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.myzuoye_02.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vip_demo1;
    private TabLayout tab_demo1;
    private ArrayList<String> strings;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),strings,fragments);
        vip_demo1.setAdapter(myAdapter);
    }

    private void initdata() {
        strings = new ArrayList<>();
        strings.add("标题一");
        strings.add("标题二");
        fragments = new ArrayList<>();
        fragments.add(new BlankFragment01());
        fragments.add(new BlankFragment02());

    }

    private void initView() {
        vip_demo1 = (ViewPager) findViewById(R.id.vip_demo1);
        tab_demo1 = (TabLayout) findViewById(R.id.tab_demo1);
        tab_demo1.setupWithViewPager(vip_demo1);
    }
}

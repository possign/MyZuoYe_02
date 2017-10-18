package com.example.hp.myzuoye_02.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by hp on 2017/10/17.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<String> list;
    private ArrayList<Fragment> array;

    public MyAdapter(FragmentManager fm, ArrayList<String> list, ArrayList<Fragment> array) {
        super(fm);
        this.list = list;
        this.array = array;
    }

    @Override
    public Fragment getItem(int position) {
        return array.get(position);
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}

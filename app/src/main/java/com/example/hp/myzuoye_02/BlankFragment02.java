package com.example.hp.myzuoye_02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment02 extends Fragment implements View.OnClickListener {


    private WebView web_demo1;
    private Button bu_demo1;

    public BlankFragment02() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank_fragment02, container, false);

        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        web_demo1 = (WebView) inflate.findViewById(R.id.web_demo1);

        bu_demo1 = (Button) inflate.findViewById(R.id.bu_demo1);
        bu_demo1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bu_demo1:
                web_demo1.loadUrl("http://www.csdn.net/");
                break;
        }
    }
}

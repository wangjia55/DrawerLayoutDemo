package com.jacob.drawerlayout;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Package : com.jacob.drawerlayout
 * Author : jacob
 * Date : 15-3-25
 * Description : 这个类是用来xxx
 */
public class PlanetFragment extends Fragment {
    public static PlanetFragment newInstance(String title) {
        Bundle args = new Bundle();
        PlanetFragment fragment = new PlanetFragment();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planet, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("title"));
        Log.e("wangjia2:", getArguments().getString("title"));
    }
}

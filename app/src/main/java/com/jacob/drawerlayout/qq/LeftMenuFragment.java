package com.jacob.drawerlayout.qq;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jacob.drawerlayout.R;

/**
 * Package : com.jacob.drawerlayout
 * Author : jacob
 * Date : 15-3-25
 * Description : 这个类是用来xxx
 */
public class LeftMenuFragment extends Fragment {
    public static LeftMenuFragment newInstance() {
        Bundle args = new Bundle();
        LeftMenuFragment fragment = new LeftMenuFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_left_menu, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

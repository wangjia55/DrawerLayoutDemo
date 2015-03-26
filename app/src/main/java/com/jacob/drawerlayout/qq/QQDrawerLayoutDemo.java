package com.jacob.drawerlayout.qq;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.widget.RelativeLayout;

import com.jacob.drawerlayout.R;

/**
 * Package : com.jacob.drawerlayout.qq
 * Author : jacob
 * Date : 15-3-26
 * Description : 这个类是用来xxx
 */
public class QQDrawerLayoutDemo extends FragmentActivity {

    private DrawerLayout drawerLayout;
    private RelativeLayout relativeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq_demo);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        relativeContainer = (RelativeLayout) findViewById(R.id.relative_container);



    }

}

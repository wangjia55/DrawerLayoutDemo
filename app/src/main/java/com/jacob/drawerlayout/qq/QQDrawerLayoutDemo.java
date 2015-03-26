package com.jacob.drawerlayout.qq;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;

import com.jacob.drawerlayout.R;
import com.nineoldandroids.view.ViewHelper;

/**
 * Package : com.jacob.drawerlayout.qq
 * Author : jacob
 * Date : 15-3-26
 * Description : 这个类是用来xxx
 */
public class QQDrawerLayoutDemo extends FragmentActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq_demo);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                Log.e("TAG", slideOffset + "**" + drawerView.getTag());
                View contentView = mDrawerLayout.getChildAt(0);
                View menu = drawerView;

                float scale = 1 - slideOffset;
                float rightScale = 0.8f + 0.2f * scale;

                int width = drawerView.getWidth();
                if (drawerView.getTag().equals("LEFT")) {

                    ViewHelper.setTranslationX(contentView, width * slideOffset);
                    ViewHelper.setPivotX(contentView, 0);
                    ViewHelper.setPivotY(contentView, contentView.getHeight() / 2);
                    contentView.invalidate();
                    ViewHelper.setScaleX(contentView, rightScale);
                    ViewHelper.setScaleY(contentView, rightScale);
                    ViewHelper.setAlpha(drawerView, 0.5f + 0.5f * slideOffset);

                } else {
                    ViewHelper.setTranslationX(contentView, -1 * width * slideOffset);
                    ViewHelper.setPivotX(contentView, contentView.getMeasuredWidth());
                    ViewHelper.setPivotY(contentView, contentView.getHeight() / 2);
                    contentView.invalidate();
                    ViewHelper.setScaleX(contentView, rightScale);
                    ViewHelper.setScaleY(contentView, rightScale);
                }

            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                //关闭某个方向上的手势滑动操作
//                mDrawerLayout.setDrawerLockMode(
//                        DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });


    }

}

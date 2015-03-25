package com.jacob.drawerlayout;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private String[] mTitleArrays = new String[]{"Menu One", "Menu Two", "Menu Three"};
    private DrawerLayout mDrawerLayout;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initView
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mListView = (ListView) findViewById(R.id.left_drawer);
        mListView.setAdapter(new ArrayAdapter<String>(this,R.layout.layout_item, R.id.item_text_view,mTitleArrays));
        mListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);
    }

    private void selectItem(int position) {
        Fragment fragment = PlanetFragment.newInstance(mTitleArrays[position]);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fc = fragmentManager.beginTransaction();
        fc.replace(R.id.drawer_layout, fragment).commit();
        // Highlight the selected item, update the title, and close the drawer
        mListView.setItemChecked(position, true);
        setTitle(mTitleArrays[position]);
//        mDrawerLayout.closeDrawer(mListView);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }
}

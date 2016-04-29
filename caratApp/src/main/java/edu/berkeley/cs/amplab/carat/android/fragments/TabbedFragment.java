package edu.berkeley.cs.amplab.carat.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.berkeley.cs.amplab.carat.android.MainActivity;
import edu.berkeley.cs.amplab.carat.android.R;

/**
 * Created by Jonatan Hamberg on 29.4.2016.
 */
public class TabbedFragment extends Fragment {

    private MainActivity mainActivity;
    private ViewPager pager;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mainActivity = (MainActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        pager = (ViewPager) inflater.inflate(R.layout.fragment_tabs, container, false);
        final TabPagerAdapter adapter = new TabPagerAdapter(getChildFragmentManager());
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position){
                mainActivity.setUpActionBar(adapter.getPageTitle(position), true);
                mainActivity.selectActionBarTab(position);
            }
        });
        return pager;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        mainActivity.setUpActionBar("MY HOGS", true);
        super.onResume();
    }

    public ViewPager getViewPager(){
        return pager;
    }
}

class TabPagerAdapter extends FragmentPagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public String getPageTitle(int position){
        String temporaryTitle = "MY HOGS";
        if(position == 1) temporaryTitle = "GLOBAL HOGS";
        return temporaryTitle;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 1) return new BugsFragment();
        return new HogsFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}

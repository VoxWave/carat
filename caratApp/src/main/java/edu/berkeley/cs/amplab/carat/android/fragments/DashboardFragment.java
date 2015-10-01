package edu.berkeley.cs.amplab.carat.android.fragments;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import edu.berkeley.cs.amplab.carat.android.Constants;
import edu.berkeley.cs.amplab.carat.android.R;
import edu.berkeley.cs.amplab.carat.android.activities.DashboardActivity;
import edu.berkeley.cs.amplab.carat.android.ui.CircleDisplay;

/**
 * Created by Valto on 30.9.2015.
 */
public class DashboardFragment extends Fragment implements View.OnClickListener {

    private DashboardActivity dashboardActivity;
    private LinearLayout ll;
    private ImageView bugButton;
    private ImageView hogButton;
    private ImageView globeButton;
    private ImageView actionsButton;
    private Button myDeviceButton;
    private TextView batteryText;
    private CircleDisplay cd;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.dashboardActivity = (DashboardActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ll = (LinearLayout) inflater.inflate(R.layout.fragment_dashboard, container, false);
        initViewRefs();
        initListeners();
        generateJScoreCircle();
        return ll;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dashboardActivity.setUpActionBar(R.string.title_activity_dashboard, getFragmentManager().getBackStackEntryCount() > 0);
        setValues();
    }

    private void initViewRefs() {
        bugButton = (ImageView) ll.findViewById(R.id.bugs_button);
        hogButton = (ImageView) ll.findViewById(R.id.hogs_button);
        globeButton = (ImageView) ll.findViewById(R.id.globe_button);
        actionsButton = (ImageView) ll.findViewById(R.id.actions_button);
        myDeviceButton = (Button) ll.findViewById(R.id.my_device_button);
        batteryText = (TextView) ll.findViewById(R.id.battery_value);
    }

    private void initListeners() {
        bugButton.setOnClickListener(this);
        hogButton.setOnClickListener(this);
        globeButton.setOnClickListener(this);
        actionsButton.setOnClickListener(this);
        myDeviceButton.setOnClickListener(this);
    }

    private void generateJScoreCircle() {
        cd = (CircleDisplay) ll.findViewById(R.id.jscore_progress_circle);
        cd.setValueWidthPercent(10f);
        cd.setTextSize(30f);
        cd.setColor(Color.rgb(97, 65, 11));
        cd.setDrawText(true);
        cd.setDrawInnerCircle(true);
        cd.setFormatDigits(0);
        cd.setTouchEnabled(true);
        cd.setUnit("");
        cd.setStepSize(1f);
    }

    private void setValues() {
        batteryText.setText(dashboardActivity.getBatteryLife());

        if (dashboardActivity.getJScore() == -1 || dashboardActivity.getJScore() == 0) {
            cd.setCustomText(new String[]{"N", "/", "A"});
        } else {
            cd.showValue((float) dashboardActivity.getJScore(), 99f, false);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bugs_button:
                BugsFragment bugsFragment = new BugsFragment();
                dashboardActivity.replaceFragment(bugsFragment, Constants.FRAGMENT_BUGS_TAG);
                break;
            case R.id.hogs_button:
                HogsFragment hogsFragment = new HogsFragment();
                dashboardActivity.replaceFragment(hogsFragment, Constants.FRAGMENT_HOGS_TAG);
                break;
            case R.id.globe_button:
                GlobalFragment globalFragment = new GlobalFragment();
                dashboardActivity.replaceFragment(globalFragment, Constants.FRAGMENT_GLOBAL_TAG);
                break;
            case R.id.actions_button:
                ActionsFragment actionsFragment = new ActionsFragment();
                dashboardActivity.replaceFragment(actionsFragment, Constants.FRAGMENT_ACTIONS_TAG);
                break;
            case R.id.my_device_button:
                MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
                dashboardActivity.replaceFragment(myDeviceFragment, Constants.FRAGMENT_MY_DEVICE_TAG);
                break;
            default:
                break;
        }
    }
}
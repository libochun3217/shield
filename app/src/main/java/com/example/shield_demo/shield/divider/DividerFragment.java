package com.example.shield_demo.shield.divider;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianping.agentsdk.framework.AgentListConfig;
import com.example.shield_demo.shield.fragments.AbsExampleFragment;

import java.util.ArrayList;

/**
 * Created by bingweizhou on 17/7/12.
 */

public class DividerFragment extends AbsExampleFragment {

    RecyclerView mRecyclerView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRecyclerView = new RecyclerView(getContext());
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setAgentContainerView(mRecyclerView);
    }

    @Override
    protected ArrayList<AgentListConfig> generaterDefaultConfigAgentList() {
        ArrayList<AgentListConfig> configs = new ArrayList<>();
        configs.add(new DividerAgentConfig());
        return configs;
    }

    @Override
    public String functionName() {
        return "Divider";
    }
}

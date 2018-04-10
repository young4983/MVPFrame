package com.lrony.mvpframe.presentation.fragment.third;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lrony.mvpframe.R;
import com.lrony.mvpframe.mvp.MvpFragment;
import com.lrony.mvpframe.presentation.fragment.second.SecondFragment;

/**
 * Created by Lrony on 18-4-10.
 */
public class ThirdFragment extends MvpFragment<ThirdContract.Presenter> implements ThirdContract.View {

    private Toolbar mToolbar;
    private TabLayout mTab;
    private ViewPager mPager;

    public static ThirdFragment newInstance() {
        Bundle args = new Bundle();
        ThirdFragment fragment = new ThirdFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public ThirdContract.Presenter createPresenter() {
        return new ThirdPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_third;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Must use
        getPresenter().start();

        initView(view);
    }

    private void initView(View view) {
        mToolbar = view.findViewById(R.id.toolbar);
        mToolbar.setTitle(R.string.fragment_third);

        mTab = view.findViewById(R.id.tab);
        mPager = view.findViewById(R.id.pager);
    }
}

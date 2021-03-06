package com.hotbitmapgg.bilibili.module.common;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

import com.hotbitmapgg.bilibili.base.RxBaseActivity;
import com.hotbitmapgg.ohmybilibili.R;

import butterknife.BindView;

/**
 * Created by hcc on 16/8/7 14:12
 * 100332338@qq.com
 * <p/>
 * 关于我
 */
public class HotBitmapGGInfoActivity extends RxBaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_hotbitmapgg;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
    }


    @Override
    public void initToolBar() {
        mToolbar.setTitle("关于我");
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}

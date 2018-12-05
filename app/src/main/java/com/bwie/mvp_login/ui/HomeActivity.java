package com.bwie.mvp_login.ui;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

import com.bwie.mvp_login.R;
import com.bwie.mvp_login.base.BaseActivity;

/**
 * 文件描述：
 * 作者：鲁华丰
 * 创建时间：2018/12/5
 */
public class HomeActivity extends BaseActivity implements View.OnClickListener {
    private Button mBtn;
    private SharedPreferences mShared;
    private SharedPreferences.Editor mEditor;
    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initViews() {
        mBtn = findViewById(R.id.Btn_Tc);
    }

    @Override
    protected void setOnClick() {
        mBtn.setOnClickListener(this);
    }

    @Override
    protected void processLogic() {
        mShared = getSharedPreferences("lu", MODE_PRIVATE);
        mEditor = mShared.edit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Btn_Tc:
                mEditor.clear();
                mEditor.commit();
                break;
        }
    }
}

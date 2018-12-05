package com.bwie.mvp_login.presente;


import com.bwie.mvp_login.callback.MyCallBack;
import com.bwie.mvp_login.model.ModelImpl;
import com.bwie.mvp_login.view.IView;

/**
 * 文件描述：
 * 作者：鲁华丰
 * 创建时间：2018/12/5
 */
public class PresenteImpl implements IPresente {
    private ModelImpl model;
    private IView iView;

    public PresenteImpl(IView iView) {
        this.iView = iView;
        model = new ModelImpl();
    }


    @Override
    public void startRequest(final String url, String mobile, String passWord) {
        model.getData(url, mobile, passWord, new MyCallBack() {
            @Override
            public void setData(Object user) {
                iView.success(user);
            }

            @Override
            public void setError(Object error) {
                iView.error(url);
            }
        });
    }
    public void onDetatch(){
        if(model != null ){
            model = null;
        }
        if (iView != null){
            iView = null;
        }
    }
}

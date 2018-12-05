package com.bwie.mvp_login.model;

import com.bwie.mvp_login.callback.MyCallBack;

/**
 * 文件描述：
 * 作者：鲁华丰
 * 创建时间：2018/12/5
 */
public interface Model {
    void getData(String url , String userName , String password , MyCallBack callBack);
}

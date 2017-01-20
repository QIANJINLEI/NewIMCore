package com.newimcore;

import android.app.Application;

import com.alibaba.mobileim.YWAPI;
import com.alibaba.wxlib.util.SysUtil;

/**
 * Created by wb-qjl256634 on 2017/1/20.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SysUtil.setApplication(this);
        if (SysUtil.isTCMSServiceProcess(this))
            return;
        if (SysUtil.isMainProcess()){
            YWAPI.init(this,Info.APP_KEY);
        }

    }
}

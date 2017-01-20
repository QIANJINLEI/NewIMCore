package com.newimcore;

import com.alibaba.mobileim.YWAPI;
import com.alibaba.mobileim.YWIMCore;
import com.alibaba.mobileim.YWIMKit;

/**
 * Created by wb-qjl256634 on 2017/1/20.
 */

public class LoginHelp {
    private static LoginHelp loginHelp=new LoginHelp();
    private static  YWIMCore ywimCore;
    private static YWIMKit ywimKit;

    private LoginHelp(){

    }

    public static  LoginHelp getLoginHelp() {
        return loginHelp;
    }

    public YWIMCore getYwimCore() {
        return ywimCore;
    }

    public YWIMKit getYwimKit() {
        return ywimKit;
    }

    public void setYwimCore(YWIMCore ywimCore) {
        LoginHelp.ywimCore = ywimCore;
    }

    public void setYwimKit(YWIMKit ywimKit) {
        if (ywimKit!=null)
        LoginHelp.ywimKit = ywimKit;
    }
    public YWIMKit initIMKit(String userID, String appkey){
        if (ywimKit==null)
        ywimKit=YWAPI.getIMKitInstance(userID,appkey);
        return ywimKit;
    }
    public YWIMCore initCore(String userID, String appkey){
        if (ywimCore==null)
            ywimCore=YWAPI.createIMCore(userID, appkey);
        return ywimCore;
    }
}

package com.newimcore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.mobileim.IYWLoginService;
import com.alibaba.mobileim.YWIMCore;
import com.alibaba.mobileim.YWLoginParam;
import com.alibaba.mobileim.channel.event.IWxCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.pw)
    EditText pw;
    @Bind(R.id.login)
    Button login;
    @Bind(R.id.exit)
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }

    @OnClick({R.id.login, R.id.exit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                String userName = name.getText().toString();
                String passWord = pw.getText().toString();
                YWIMCore ywimCore = LoginHelp.getLoginHelp().initCore(userName, Info.APP_KEY);
                IYWLoginService loginService = ywimCore.getLoginService();
                YWLoginParam param =new YWLoginParam(userName,passWord, Info.APP_KEY);
                loginService.login(param, new IWxCallback() {
                    @Override
                    public void onSuccess(Object... objects) {

                    }

                    @Override
                    public void onError(int i, String s) {

                    }

                    @Override
                    public void onProgress(int i) {

                    }
                });

                break;
            case R.id.exit:
                break;
        }
    }
}

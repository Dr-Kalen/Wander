package net.dr.wander.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import net.dr.wander.R;
import net.dr.wander.presenter.AuthorizePresenter;
import net.dr.wander.view.IAuthorizeView;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kalen on 17/4/24.
 */

public class AuthorizeActivity extends Activity implements IAuthorizeView{

    private AuthorizePresenter presenter;

    @OnClick(R.id.wechat) void startWechatAuthorize(){
        presenter.launchedWechatAuthorize();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new AuthorizePresenter(this);
        setContentView(R.layout.authorize_layout);
        ButterKnife.bind(this);
    }

    @Override
    public void wechatAuthorized() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

}

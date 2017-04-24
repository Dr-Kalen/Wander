package net.dr.wander.presenter;

import android.os.Handler;
import android.util.Log;

import net.dr.wander.view.IAuthorizeView;

/**
 * Created by kalen on 17/4/24.
 */

public class AuthorizePresenter {

    private IAuthorizeView authorizeView;
    private Handler mHandler = new Handler();

    public AuthorizePresenter(IAuthorizeView authorizeView) {
        this.authorizeView = authorizeView;
    }

    public void launchedWechatAuthorize(){
        Log.d("Authorized", "启动授权，暂时直接通过");
        authorizeView.wechatAuthorized();
    }
}

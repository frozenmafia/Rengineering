package com.app.dream11.account;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class MyAccountFragment_ViewBinding implements Unbinder {
    private MyAccountFragment toString;

    public MyAccountFragment_ViewBinding(MyAccountFragment myAccountFragment, View view) {
        this.toString = myAccountFragment;
        myAccountFragment.acc = (MyAccountComponent) MediaControllerCompat.Callback.ag$a(view, R.id.acc, "field 'acc'", MyAccountComponent.class);
        myAccountFragment.rootview = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.rootview, "field 'rootview'", RelativeLayout.class);
    }
}

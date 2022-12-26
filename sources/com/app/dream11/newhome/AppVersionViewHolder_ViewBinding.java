package com.app.dream11.newhome;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class AppVersionViewHolder_ViewBinding implements Unbinder {
    private AppVersionViewHolder toString;

    public AppVersionViewHolder_ViewBinding(AppVersionViewHolder appVersionViewHolder, View view) {
        this.toString = appVersionViewHolder;
        appVersionViewHolder.version = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.version, "field 'version'", CustomTextView.class);
        appVersionViewHolder.update = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.update, "field 'update'", CustomTextView.class);
    }
}

package com.app.dream11.newhome;

import android.content.Context;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.dream11.ui.CustomTextView;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes.dex */
public class AppVersionViewHolder extends BaseAdapter$ag$a {
    @BindView
    CustomTextView update;
    @BindView
    CustomTextView version;

    public AppVersionViewHolder(Context context, int i, ViewGroup viewGroup) {
        super(context, i, viewGroup);
        ButterKnife.ag$a(this, ag$a());
    }
}

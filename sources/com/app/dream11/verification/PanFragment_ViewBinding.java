package com.app.dream11.verification;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import com.google.android.material.textfield.TextInputLayout;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class PanFragment_ViewBinding implements Unbinder {
    private PanFragment values;

    public PanFragment_ViewBinding(PanFragment panFragment, View view) {
        this.values = panFragment;
        panFragment.pan_name = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.pan_name, "field 'pan_name'", TextInputLayout.class);
        panFragment.pan_no = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.pan_no, "field 'pan_no'", TextInputLayout.class);
        panFragment.icon = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.imageView18, "field 'icon'", ImageView.class);
    }
}

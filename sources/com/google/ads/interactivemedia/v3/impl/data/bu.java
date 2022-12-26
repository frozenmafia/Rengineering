package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
/* loaded from: classes4.dex */
public abstract class bu {
    public abstract bu attached(boolean z);

    public abstract bu bounds(ay ayVar);

    public abstract bv build();

    public abstract bu detailedReason(String str);

    public abstract bu hidden(boolean z);

    public abstract bu purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract bu type(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public bu view(View view) {
        return attached(Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : true).bounds(ay.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}

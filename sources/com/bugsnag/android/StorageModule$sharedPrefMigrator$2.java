package com.bugsnag.android;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.shouldUpdate;
/* loaded from: classes3.dex */
public final class StorageModule$sharedPrefMigrator$2 extends Lambda implements Styleable.ArcMotion<shouldUpdate> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$sharedPrefMigrator$2(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // o.Styleable.ArcMotion
    public final shouldUpdate invoke() {
        return new shouldUpdate(this.$appContext);
    }
}

package com.app.dream11.react;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.findDrawerWithGravity;
import o.findVisibleDrawer;
/* loaded from: classes.dex */
final class Dream11ReactBridge$delegate$2 extends Lambda implements Styleable.ArcMotion<findDrawerWithGravity> {
    final /* synthetic */ ReactApplicationContext $reactApplicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ReactBridge$delegate$2(ReactApplicationContext reactApplicationContext) {
        super(0);
        this.$reactApplicationContext = reactApplicationContext;
    }

    @Override // o.Styleable.ArcMotion
    public final findDrawerWithGravity invoke() {
        Context applicationContext = this.$reactApplicationContext.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.dream11.feature.react.ReactDelegateProvider");
        return ((findVisibleDrawer) applicationContext).ag$a();
    }
}

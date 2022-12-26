package com.app.dream11.react;

import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getChroma;
/* loaded from: classes.dex */
final class Dream11ReactBridge$standardIndefiniteProgressable$2 extends Lambda implements Styleable.ArcMotion<getChroma> {
    final /* synthetic */ ReactApplicationContext $reactApplicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ReactBridge$standardIndefiniteProgressable$2(ReactApplicationContext reactApplicationContext) {
        super(0);
        this.$reactApplicationContext = reactApplicationContext;
    }

    @Override // o.Styleable.ArcMotion
    public final getChroma invoke() {
        return new getChroma(this.$reactApplicationContext.getCurrentActivity());
    }
}

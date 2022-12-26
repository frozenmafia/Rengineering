package com.app.dream11.chat;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
import o.onAttachedToWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SocialController$socialFeature$2 extends Lambda implements Styleable.ArcMotion<getCategory> {
    public static final SocialController$socialFeature$2 INSTANCE = new SocialController$socialFeature$2();

    SocialController$socialFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final getCategory invoke() {
        return onAttachedToWindow.values.values().postMessage();
    }
}

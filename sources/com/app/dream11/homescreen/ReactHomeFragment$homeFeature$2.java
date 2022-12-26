package com.app.dream11.homescreen;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidConnection;
import o.onAttachedToWindow;
/* loaded from: classes3.dex */
final class ReactHomeFragment$homeFeature$2 extends Lambda implements Styleable.ArcMotion<isValidConnection> {
    public static final ReactHomeFragment$homeFeature$2 INSTANCE = new ReactHomeFragment$homeFeature$2();

    ReactHomeFragment$homeFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final isValidConnection invoke() {
        return onAttachedToWindow.values.values().aj$a();
    }
}

package com.app.dream11.react;

import kotlin.jvm.internal.Lambda;
import o.NotificationApiHelperForO;
import o.Styleable;
import o.onAttachedToWindow;
/* loaded from: classes.dex */
final class Dream11ReactBridge$appFeature$2 extends Lambda implements Styleable.ArcMotion<NotificationApiHelperForO> {
    public static final Dream11ReactBridge$appFeature$2 INSTANCE = new Dream11ReactBridge$appFeature$2();

    Dream11ReactBridge$appFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final NotificationApiHelperForO invoke() {
        return onAttachedToWindow.values.values().values();
    }
}

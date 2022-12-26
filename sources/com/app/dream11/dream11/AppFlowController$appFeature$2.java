package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.NotificationApiHelperForO;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppFlowController$appFeature$2 extends Lambda implements Styleable.ArcMotion<NotificationApiHelperForO> {
    public static final AppFlowController$appFeature$2 INSTANCE = new AppFlowController$appFeature$2();

    AppFlowController$appFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final NotificationApiHelperForO invoke() {
        return DreamApplication.valueOf().aj$a().values();
    }
}

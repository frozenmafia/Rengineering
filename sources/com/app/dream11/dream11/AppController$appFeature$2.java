package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.NotificationApiHelperForO;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppController$appFeature$2 extends Lambda implements Styleable.ArcMotion<NotificationApiHelperForO> {
    public static final AppController$appFeature$2 INSTANCE = new AppController$appFeature$2();

    AppController$appFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final NotificationApiHelperForO invoke() {
        return DreamApplication.valueOf().aj$a().values();
    }
}

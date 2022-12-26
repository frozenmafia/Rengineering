package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ensureJobId;
/* loaded from: classes3.dex */
public final class AppController$rewardFeature$2 extends Lambda implements Styleable.ArcMotion<ensureJobId> {
    public static final AppController$rewardFeature$2 INSTANCE = new AppController$rewardFeature$2();

    AppController$rewardFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ensureJobId invoke() {
        return DreamApplication.valueOf().aj$a().ICustomTabsService();
    }
}

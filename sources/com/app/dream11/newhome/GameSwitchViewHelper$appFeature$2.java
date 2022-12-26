package com.app.dream11.newhome;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.NotificationApiHelperForO;
import o.Styleable;
/* loaded from: classes3.dex */
final class GameSwitchViewHelper$appFeature$2 extends Lambda implements Styleable.ArcMotion<NotificationApiHelperForO> {
    public static final GameSwitchViewHelper$appFeature$2 INSTANCE = new GameSwitchViewHelper$appFeature$2();

    GameSwitchViewHelper$appFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final NotificationApiHelperForO invoke() {
        return DreamApplication.valueOf().aj$a().values();
    }
}

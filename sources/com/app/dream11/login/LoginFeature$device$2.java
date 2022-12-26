package com.app.dream11.login;

import com.app.dream11.model.IAppDataProvider;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public final class LoginFeature$device$2 extends Lambda implements Styleable.ArcMotion<onActionViewExpanded> {
    final /* synthetic */ IAppDataProvider $provider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$device$2(IAppDataProvider iAppDataProvider) {
        super(0);
        this.$provider = iAppDataProvider;
    }

    @Override // o.Styleable.ArcMotion
    public final onActionViewExpanded invoke() {
        return this.$provider.getDevice();
    }
}

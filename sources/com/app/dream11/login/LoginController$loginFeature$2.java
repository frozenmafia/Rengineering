package com.app.dream11.login;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class LoginController$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final LoginController$loginFeature$2 INSTANCE = new LoginController$loginFeature$2();

    LoginController$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return DreamApplication.valueOf().aj$a().extraCallback();
    }
}

package com.app.dream11.login;

import com.app.dream11.model.DataHolderFactory;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActionViewExpanded;
/* loaded from: classes3.dex */
final class LoginSelectionFragment$device$2 extends Lambda implements Styleable.ArcMotion<onActionViewExpanded> {
    public static final LoginSelectionFragment$device$2 INSTANCE = new LoginSelectionFragment$device$2();

    LoginSelectionFragment$device$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final onActionViewExpanded invoke() {
        return DataHolderFactory.getInstance().getProvider().getDevice();
    }
}

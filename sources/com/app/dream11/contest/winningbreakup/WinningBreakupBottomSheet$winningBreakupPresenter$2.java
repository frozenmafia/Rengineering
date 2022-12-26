package com.app.dream11.contest.winningbreakup;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.setSpinEnabled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WinningBreakupBottomSheet$winningBreakupPresenter$2 extends Lambda implements Styleable.ArcMotion<setSpinEnabled> {
    public static final WinningBreakupBottomSheet$winningBreakupPresenter$2 INSTANCE = new WinningBreakupBottomSheet$winningBreakupPresenter$2();

    WinningBreakupBottomSheet$winningBreakupPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setSpinEnabled invoke() {
        return ActionMenuItem.valueOf().getStateLabel();
    }
}

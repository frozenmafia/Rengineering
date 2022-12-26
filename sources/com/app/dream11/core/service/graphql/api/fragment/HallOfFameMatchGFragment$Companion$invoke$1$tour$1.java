package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchGFragment$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchGFragment.Tour> {
    public static final HallOfFameMatchGFragment$Companion$invoke$1$tour$1 INSTANCE = new HallOfFameMatchGFragment$Companion$invoke$1$tour$1();

    HallOfFameMatchGFragment$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchGFragment.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchGFragment.Tour.Companion.invoke(removecancellable);
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GRecentPerformance$Edge$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentPerformance.Tour> {
    public static final GRecentPerformance$Edge$Companion$invoke$1$tour$1 INSTANCE = new GRecentPerformance$Edge$Companion$invoke$1$tour$1();

    GRecentPerformance$Edge$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentPerformance.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecentPerformance.Tour.Companion.invoke(removecancellable);
    }
}

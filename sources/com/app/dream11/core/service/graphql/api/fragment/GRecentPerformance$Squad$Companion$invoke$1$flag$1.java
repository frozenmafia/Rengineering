package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GRecentPerformance$Squad$Companion$invoke$1$flag$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GRecentPerformance.Flag> {
    public static final GRecentPerformance$Squad$Companion$invoke$1$flag$1 INSTANCE = new GRecentPerformance$Squad$Companion$invoke$1$flag$1();

    GRecentPerformance$Squad$Companion$invoke$1$flag$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance$Squad$Companion$invoke$1$flag$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentPerformance.Flag> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GRecentPerformance.Flag invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GRecentPerformance.Flag.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentPerformance.Flag invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GRecentPerformance.Flag) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

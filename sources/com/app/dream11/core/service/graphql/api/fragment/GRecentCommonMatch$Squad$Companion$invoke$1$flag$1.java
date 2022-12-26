package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentCommonMatch;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GRecentCommonMatch$Squad$Companion$invoke$1$flag$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GRecentCommonMatch.Flag> {
    public static final GRecentCommonMatch$Squad$Companion$invoke$1$flag$1 INSTANCE = new GRecentCommonMatch$Squad$Companion$invoke$1$flag$1();

    GRecentCommonMatch$Squad$Companion$invoke$1$flag$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GRecentCommonMatch$Squad$Companion$invoke$1$flag$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentCommonMatch.Flag> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GRecentCommonMatch.Flag invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GRecentCommonMatch.Flag.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentCommonMatch.Flag invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GRecentCommonMatch.Flag) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

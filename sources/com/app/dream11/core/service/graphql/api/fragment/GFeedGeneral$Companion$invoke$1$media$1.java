package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedGeneral;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedGeneral$Companion$invoke$1$media$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GFeedGeneral.Medium> {
    public static final GFeedGeneral$Companion$invoke$1$media$1 INSTANCE = new GFeedGeneral$Companion$invoke$1$media$1();

    GFeedGeneral$Companion$invoke$1$media$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GFeedGeneral$Companion$invoke$1$media$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedGeneral.Medium> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GFeedGeneral.Medium invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GFeedGeneral.Medium.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedGeneral.Medium invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GFeedGeneral.Medium) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SelfExclusionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SelfExclusionQuery$Data$Companion$invoke$1$selfExclusionOptions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, SelfExclusionQuery.SelfExclusionOption> {
    public static final SelfExclusionQuery$Data$Companion$invoke$1$selfExclusionOptions$1 INSTANCE = new SelfExclusionQuery$Data$Companion$invoke$1$selfExclusionOptions$1();

    SelfExclusionQuery$Data$Companion$invoke$1$selfExclusionOptions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.SelfExclusionQuery$Data$Companion$invoke$1$selfExclusionOptions$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SelfExclusionQuery.SelfExclusionOption> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final SelfExclusionQuery.SelfExclusionOption invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return SelfExclusionQuery.SelfExclusionOption.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final SelfExclusionQuery.SelfExclusionOption invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (SelfExclusionQuery.SelfExclusionOption) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

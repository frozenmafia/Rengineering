package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GPoll;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GPoll$Companion$invoke$1$options$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GPoll.Option> {
    public static final GPoll$Companion$invoke$1$options$1 INSTANCE = new GPoll$Companion$invoke$1$options$1();

    GPoll$Companion$invoke$1$options$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GPoll$Companion$invoke$1$options$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPoll.Option> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GPoll.Option invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GPoll.Option.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GPoll.Option invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GPoll.Option) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GOffer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GOffer$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GOffer.Icon> {
    public static final GOffer$Companion$invoke$1$icon$1 INSTANCE = new GOffer$Companion$invoke$1$icon$1();

    GOffer$Companion$invoke$1$icon$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GOffer$Companion$invoke$1$icon$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GOffer.Icon> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GOffer.Icon invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GOffer.Icon.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GOffer.Icon invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GOffer.Icon) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

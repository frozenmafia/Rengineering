package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyProfileQuery$NextLevel$Companion$invoke$1$rules$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyProfileQuery.Rule> {
    public static final MyProfileQuery$NextLevel$Companion$invoke$1$rules$1 INSTANCE = new MyProfileQuery$NextLevel$Companion$invoke$1$rules$1();

    MyProfileQuery$NextLevel$Companion$invoke$1$rules$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyProfileQuery$NextLevel$Companion$invoke$1$rules$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyProfileQuery.Rule> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyProfileQuery.Rule invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyProfileQuery.Rule.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyProfileQuery.Rule invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyProfileQuery.Rule) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

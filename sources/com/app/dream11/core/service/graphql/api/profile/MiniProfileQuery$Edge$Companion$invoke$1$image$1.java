package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MiniProfileQuery$Edge$Companion$invoke$1$image$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MiniProfileQuery.Image> {
    public static final MiniProfileQuery$Edge$Companion$invoke$1$image$1 INSTANCE = new MiniProfileQuery$Edge$Companion$invoke$1$image$1();

    MiniProfileQuery$Edge$Companion$invoke$1$image$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery$Edge$Companion$invoke$1$image$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MiniProfileQuery.Image> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MiniProfileQuery.Image invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MiniProfileQuery.Image.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MiniProfileQuery.Image invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MiniProfileQuery.Image) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

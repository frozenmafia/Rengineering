package com.app.dream11.core.service.graphql.api.Social.usersearch;

import com.app.dream11.core.service.graphql.api.Social.usersearch.GetUserSearchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserSearchQuery$Edge$Companion$invoke$1$officialTick$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetUserSearchQuery.OfficialTick> {
    public static final GetUserSearchQuery$Edge$Companion$invoke$1$officialTick$1 INSTANCE = new GetUserSearchQuery$Edge$Companion$invoke$1$officialTick$1();

    GetUserSearchQuery$Edge$Companion$invoke$1$officialTick$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.usersearch.GetUserSearchQuery$Edge$Companion$invoke$1$officialTick$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserSearchQuery.OfficialTick> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetUserSearchQuery.OfficialTick invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetUserSearchQuery.OfficialTick.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserSearchQuery.OfficialTick invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetUserSearchQuery.OfficialTick) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

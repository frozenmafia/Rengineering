package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherUserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherUserInfoQuery$User$Companion$invoke$1$officialTick$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, OtherUserInfoQuery.OfficialTick> {
    public static final OtherUserInfoQuery$User$Companion$invoke$1$officialTick$1 INSTANCE = new OtherUserInfoQuery$User$Companion$invoke$1$officialTick$1();

    OtherUserInfoQuery$User$Companion$invoke$1$officialTick$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherUserInfoQuery$User$Companion$invoke$1$officialTick$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherUserInfoQuery.OfficialTick> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final OtherUserInfoQuery.OfficialTick invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return OtherUserInfoQuery.OfficialTick.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherUserInfoQuery.OfficialTick invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (OtherUserInfoQuery.OfficialTick) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetChannelInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetChannelInfoQuery$ChannelInfo$Companion$invoke$1$members$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetChannelInfoQuery.Member> {
    public static final GetChannelInfoQuery$ChannelInfo$Companion$invoke$1$members$1 INSTANCE = new GetChannelInfoQuery$ChannelInfo$Companion$invoke$1$members$1();

    GetChannelInfoQuery$ChannelInfo$Companion$invoke$1$members$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.GetChannelInfoQuery$ChannelInfo$Companion$invoke$1$members$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetChannelInfoQuery.Member> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetChannelInfoQuery.Member invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetChannelInfoQuery.Member.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetChannelInfoQuery.Member invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetChannelInfoQuery.Member) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

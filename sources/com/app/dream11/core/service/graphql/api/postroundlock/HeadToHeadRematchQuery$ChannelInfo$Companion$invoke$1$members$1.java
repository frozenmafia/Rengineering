package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.HeadToHeadRematchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HeadToHeadRematchQuery$ChannelInfo$Companion$invoke$1$members$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HeadToHeadRematchQuery.Member> {
    public static final HeadToHeadRematchQuery$ChannelInfo$Companion$invoke$1$members$1 INSTANCE = new HeadToHeadRematchQuery$ChannelInfo$Companion$invoke$1$members$1();

    HeadToHeadRematchQuery$ChannelInfo$Companion$invoke$1$members$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.postroundlock.HeadToHeadRematchQuery$ChannelInfo$Companion$invoke$1$members$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HeadToHeadRematchQuery.Member> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HeadToHeadRematchQuery.Member invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HeadToHeadRematchQuery.Member.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HeadToHeadRematchQuery.Member invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HeadToHeadRematchQuery.Member) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

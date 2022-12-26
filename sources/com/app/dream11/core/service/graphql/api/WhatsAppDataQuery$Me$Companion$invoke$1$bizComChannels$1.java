package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WhatsAppDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WhatsAppDataQuery$Me$Companion$invoke$1$bizComChannels$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WhatsAppDataQuery.BizComChannel> {
    public static final WhatsAppDataQuery$Me$Companion$invoke$1$bizComChannels$1 INSTANCE = new WhatsAppDataQuery$Me$Companion$invoke$1$bizComChannels$1();

    WhatsAppDataQuery$Me$Companion$invoke$1$bizComChannels$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WhatsAppDataQuery$Me$Companion$invoke$1$bizComChannels$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WhatsAppDataQuery.BizComChannel> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WhatsAppDataQuery.BizComChannel invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WhatsAppDataQuery.BizComChannel.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WhatsAppDataQuery.BizComChannel invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WhatsAppDataQuery.BizComChannel) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

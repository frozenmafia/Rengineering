package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MessageRequestFormDataQuery$User$Companion$invoke$1$profilePic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MessageRequestFormDataQuery.ProfilePic> {
    public static final MessageRequestFormDataQuery$User$Companion$invoke$1$profilePic$1 INSTANCE = new MessageRequestFormDataQuery$User$Companion$invoke$1$profilePic$1();

    MessageRequestFormDataQuery$User$Companion$invoke$1$profilePic$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery$User$Companion$invoke$1$profilePic$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MessageRequestFormDataQuery.ProfilePic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MessageRequestFormDataQuery.ProfilePic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MessageRequestFormDataQuery.ProfilePic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MessageRequestFormDataQuery.ProfilePic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MessageRequestFormDataQuery.ProfilePic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

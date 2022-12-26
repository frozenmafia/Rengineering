package com.app.dream11.core.service.graphql.api.Social.phonbooksync;

import com.app.dream11.core.service.graphql.api.Social.phonbooksync.PhonebookSyncMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PhonebookSyncMutation$PhoneBookSyncV1$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PhonebookSyncMutation.Edge> {
    public static final PhonebookSyncMutation$PhoneBookSyncV1$Companion$invoke$1$edges$1 INSTANCE = new PhonebookSyncMutation$PhoneBookSyncV1$Companion$invoke$1$edges$1();

    PhonebookSyncMutation$PhoneBookSyncV1$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.phonbooksync.PhonebookSyncMutation$PhoneBookSyncV1$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PhonebookSyncMutation.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PhonebookSyncMutation.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PhonebookSyncMutation.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PhonebookSyncMutation.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PhonebookSyncMutation.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

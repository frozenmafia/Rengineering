package com.app.dream11.core.service.graphql.api.Social.phonbooksync;

import com.app.dream11.core.service.graphql.api.Social.phonbooksync.PhonebookSyncMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PhonebookSyncMutation$Edge$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PhonebookSyncMutation.Artwork> {
    public static final PhonebookSyncMutation$Edge$Companion$invoke$1$artwork$1 INSTANCE = new PhonebookSyncMutation$Edge$Companion$invoke$1$artwork$1();

    PhonebookSyncMutation$Edge$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.phonbooksync.PhonebookSyncMutation$Edge$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PhonebookSyncMutation.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PhonebookSyncMutation.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PhonebookSyncMutation.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PhonebookSyncMutation.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PhonebookSyncMutation.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MeQuery$Me$Companion$invoke$1$firebaseKey$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MeQuery.FirebaseKey> {
    public static final MeQuery$Me$Companion$invoke$1$firebaseKey$1 INSTANCE = new MeQuery$Me$Companion$invoke$1$firebaseKey$1();

    MeQuery$Me$Companion$invoke$1$firebaseKey$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MeQuery.FirebaseKey invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MeQuery.FirebaseKey.Companion.invoke(removecancellable);
    }
}

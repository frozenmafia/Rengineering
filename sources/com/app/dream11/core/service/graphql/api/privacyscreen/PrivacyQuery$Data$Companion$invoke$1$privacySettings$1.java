package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PrivacyQuery$Data$Companion$invoke$1$privacySettings$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PrivacyQuery.PrivacySetting> {
    public static final PrivacyQuery$Data$Companion$invoke$1$privacySettings$1 INSTANCE = new PrivacyQuery$Data$Companion$invoke$1$privacySettings$1();

    PrivacyQuery$Data$Companion$invoke$1$privacySettings$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery$Data$Companion$invoke$1$privacySettings$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PrivacyQuery.PrivacySetting> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PrivacyQuery.PrivacySetting invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PrivacyQuery.PrivacySetting.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PrivacyQuery.PrivacySetting invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PrivacyQuery.PrivacySetting) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

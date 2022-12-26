package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PrivacyQuery$PrivacySetting$Companion$invoke$1$settings$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PrivacyQuery.Setting> {
    public static final PrivacyQuery$PrivacySetting$Companion$invoke$1$settings$1 INSTANCE = new PrivacyQuery$PrivacySetting$Companion$invoke$1$settings$1();

    PrivacyQuery$PrivacySetting$Companion$invoke$1$settings$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery$PrivacySetting$Companion$invoke$1$settings$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PrivacyQuery.Setting> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PrivacyQuery.Setting invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PrivacyQuery.Setting.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PrivacyQuery.Setting invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PrivacyQuery.Setting) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

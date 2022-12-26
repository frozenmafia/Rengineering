package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Me$Companion$invoke$1$officialTick$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NewMyProfileQuery.OfficialTick> {
    public static final NewMyProfileQuery$Me$Companion$invoke$1$officialTick$1 INSTANCE = new NewMyProfileQuery$Me$Companion$invoke$1$officialTick$1();

    NewMyProfileQuery$Me$Companion$invoke$1$officialTick$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery$Me$Companion$invoke$1$officialTick$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.OfficialTick> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NewMyProfileQuery.OfficialTick invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NewMyProfileQuery.OfficialTick.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.OfficialTick invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NewMyProfileQuery.OfficialTick) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

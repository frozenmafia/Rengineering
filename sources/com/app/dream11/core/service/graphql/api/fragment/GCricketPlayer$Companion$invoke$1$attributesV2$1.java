package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GCricketPlayer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GCricketPlayer$Companion$invoke$1$attributesV2$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GCricketPlayer.AttributesV2> {
    public static final GCricketPlayer$Companion$invoke$1$attributesV2$1 INSTANCE = new GCricketPlayer$Companion$invoke$1$attributesV2$1();

    GCricketPlayer$Companion$invoke$1$attributesV2$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GCricketPlayer$Companion$invoke$1$attributesV2$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GCricketPlayer.AttributesV2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GCricketPlayer.AttributesV2 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GCricketPlayer.AttributesV2.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GCricketPlayer.AttributesV2 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GCricketPlayer.AttributesV2) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}

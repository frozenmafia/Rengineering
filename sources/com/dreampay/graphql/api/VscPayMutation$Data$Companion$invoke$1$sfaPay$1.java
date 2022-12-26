package com.dreampay.graphql.api;

import com.dreampay.graphql.api.VscPayMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VscPayMutation$Data$Companion$invoke$1$sfaPay$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VscPayMutation.SfaPay> {
    public static final VscPayMutation$Data$Companion$invoke$1$sfaPay$1 INSTANCE = new VscPayMutation$Data$Companion$invoke$1$sfaPay$1();

    VscPayMutation$Data$Companion$invoke$1$sfaPay$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VscPayMutation.SfaPay invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return VscPayMutation.SfaPay.Companion.invoke(removecancellable);
    }
}

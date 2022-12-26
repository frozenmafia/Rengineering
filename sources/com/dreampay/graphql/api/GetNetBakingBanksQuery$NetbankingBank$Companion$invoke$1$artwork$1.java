package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBakingBanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetNetBakingBanksQuery$NetbankingBank$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetNetBakingBanksQuery.Artwork> {
    public static final GetNetBakingBanksQuery$NetbankingBank$Companion$invoke$1$artwork$1 INSTANCE = new GetNetBakingBanksQuery$NetbankingBank$Companion$invoke$1$artwork$1();

    GetNetBakingBanksQuery$NetbankingBank$Companion$invoke$1$artwork$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetNetBakingBanksQuery.Artwork invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetNetBakingBanksQuery.Artwork.Companion.invoke(removecancellable);
    }
}

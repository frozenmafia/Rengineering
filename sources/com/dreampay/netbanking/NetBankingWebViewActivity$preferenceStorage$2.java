package com.dreampay.netbanking;

import com.dreampay.commons.storage.SharedPreferencesStorage;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class NetBankingWebViewActivity$preferenceStorage$2 extends Lambda implements Styleable.ArcMotion<SharedPreferencesStorage> {
    final /* synthetic */ NetBankingWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetBankingWebViewActivity$preferenceStorage$2(NetBankingWebViewActivity netBankingWebViewActivity) {
        super(0);
        this.this$0 = netBankingWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SharedPreferencesStorage invoke() {
        return new SharedPreferencesStorage(this.this$0);
    }
}

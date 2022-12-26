package com.dreampay.cards;

import com.dreampay.sms.SmsRetrieverBroadcastReceiver;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$smsRetrieverBroadcastReceiver$2 extends Lambda implements Styleable.ArcMotion<SmsRetrieverBroadcastReceiver> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$smsRetrieverBroadcastReceiver$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SmsRetrieverBroadcastReceiver invoke() {
        return new SmsRetrieverBroadcastReceiver(this.this$0);
    }
}

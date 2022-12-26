package com.app.dream11.react;

import android.content.Intent;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.internal.Lambda;
import o.excludeObject;
import o.setAnimationMatrix;
import o.startPostponedEnterTransition;
/* loaded from: classes.dex */
final class Dream11ReactBridge$linkUnlinkWallet$1 extends Lambda implements excludeObject<Integer, Integer, Intent, setAnimationMatrix> {
    final /* synthetic */ Promise $callback;
    final /* synthetic */ String $walletChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ReactBridge$linkUnlinkWallet$1(String str, Promise promise) {
        super(3);
        this.$walletChannel = str;
        this.$callback = promise;
    }

    @Override // o.excludeObject
    public /* synthetic */ setAnimationMatrix invoke(Integer num, Integer num2, Intent intent) {
        invoke(num.intValue(), num2.intValue(), intent);
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(int i, int i2, Intent intent) {
        startPostponedEnterTransition.ah$a.ah$a(i2, intent, this.$walletChannel, this.$callback);
    }
}

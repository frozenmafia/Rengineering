package com.app.dream11.di.module;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActionViewExpanded;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetworkModule$networkClient$6 extends Lambda implements Styleable.ChangeBounds<Map<String, ? extends String>, setAnimationMatrix> {
    final /* synthetic */ onActionViewExpanded $device;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$networkClient$6(onActionViewExpanded onactionviewexpanded) {
        super(1);
        this.$device = onactionviewexpanded;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, ? extends String> map) {
        invoke2((Map<String, String>) map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> map) {
        runAnimators.ag$a(map, "headers");
        String str = map.get("experiment-token");
        if (str == null || str.length() == 0) {
            return;
        }
        this.$device.HaptikSDK$e().valueOf().HaptikSDK$d(map.get("experiment-token"));
    }
}

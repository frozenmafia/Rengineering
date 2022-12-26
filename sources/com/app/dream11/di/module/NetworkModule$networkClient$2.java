package com.app.dream11.di.module;

import android.text.TextUtils;
import com.app.dream11.core.service.CommonGetProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActionViewExpanded;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetworkModule$networkClient$2 extends Lambda implements Styleable.ArcMotion<Map<String, ? extends Object>> {
    final /* synthetic */ onActionViewExpanded $device;
    final /* synthetic */ NetworkModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$networkClient$2(onActionViewExpanded onactionviewexpanded, NetworkModule networkModule) {
        super(0);
        this.$device = onactionviewexpanded;
        this.this$0 = networkModule;
    }

    @Override // o.Styleable.ArcMotion
    public final Map<String, ? extends Object> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : new CommonGetProperties(this.$device, this.this$0.ag$a()).entrySet()) {
            if ((TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}

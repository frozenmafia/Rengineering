package com.app.dream11.di.module;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.MenuBuilder;
import o.Styleable;
import o.onActionViewExpanded;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetworkModule$networkClient$3 extends Lambda implements Styleable.ArcMotion<Map<String, ? extends String>> {
    final /* synthetic */ onActionViewExpanded $device;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$networkClient$3(onActionViewExpanded onactionviewexpanded) {
        super(0);
        this.$device = onactionviewexpanded;
    }

    @Override // o.Styleable.ArcMotion
    public final Map<String, ? extends String> invoke() {
        Map<String, String> valueOf = new MenuBuilder.Callback(this.$device).valueOf();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : valueOf.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}

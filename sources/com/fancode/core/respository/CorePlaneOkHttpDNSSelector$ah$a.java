package com.fancode.core.respository;

import com.fancode.core.respository.CorePlaneOkHttpDNSSelector;
/* loaded from: classes4.dex */
public final /* synthetic */ class CorePlaneOkHttpDNSSelector$ah$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[CorePlaneOkHttpDNSSelector.IPvMode.values().length];
        iArr[CorePlaneOkHttpDNSSelector.IPvMode.IPV6_FIRST.ordinal()] = 1;
        iArr[CorePlaneOkHttpDNSSelector.IPvMode.IPV4_FIRST.ordinal()] = 2;
        iArr[CorePlaneOkHttpDNSSelector.IPvMode.IPV6_ONLY.ordinal()] = 3;
        iArr[CorePlaneOkHttpDNSSelector.IPvMode.IPV4_ONLY.ordinal()] = 4;
        iArr[CorePlaneOkHttpDNSSelector.IPvMode.SYSTEM.ordinal()] = 5;
        ah$a = iArr;
    }
}

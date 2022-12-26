package com.facebook.react.module.model;
/* loaded from: classes4.dex */
public class ReactModuleInfo {
    private final boolean HaptikSDK$b;
    private final boolean ag$a;
    private final boolean ah$a;
    private final String ah$b;
    private String toString;
    private final boolean valueOf;
    private final boolean values;

    public ReactModuleInfo(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.ah$b = str;
        this.toString = str2;
        this.values = z;
        this.HaptikSDK$b = z2;
        this.ah$a = z3;
        this.ag$a = z4;
        this.valueOf = z5;
    }

    public String HaptikSDK$a() {
        return this.ah$b;
    }

    public String values() {
        return this.toString;
    }

    public boolean ah$a() {
        return this.values;
    }

    public boolean ah$b() {
        return this.HaptikSDK$b;
    }

    public boolean ag$a() {
        return this.ah$a;
    }

    public boolean valueOf() {
        return this.ag$a;
    }

    public boolean HaptikSDK$b() {
        return this.valueOf;
    }
}

package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    private static final EnumSet<SmartLoginOption> ALL;
    public static final SmartLoginOption$ah$a Companion = new SmartLoginOption$ah$a(null);
    private final long value;

    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        return Companion.values(j);
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    static {
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        runAnimators.ah$a(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        SmartLoginOption[] valuesCustom = values();
        return (SmartLoginOption[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}

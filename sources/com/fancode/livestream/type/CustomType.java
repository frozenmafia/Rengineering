package com.fancode.livestream.type;

import o.ComponentActivity;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class CustomType implements ComponentActivity.NonConfigurationInstances {
    private static final /* synthetic */ CustomType[] $VALUES;
    public static final CustomType ID;

    /* renamed from: com.fancode.livestream.type.CustomType$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass1 extends CustomType {
        @Override // o.ComponentActivity.NonConfigurationInstances
        public String className() {
            return "java.lang.String";
        }

        @Override // o.ComponentActivity.NonConfigurationInstances
        public String typeName() {
            return "ID";
        }

        private AnonymousClass1(String str, int i) {
            super(str, i);
        }
    }

    private CustomType(String str, int i) {
    }

    public static CustomType valueOf(String str) {
        return (CustomType) Enum.valueOf(CustomType.class, str);
    }

    public static CustomType[] values() {
        return (CustomType[]) $VALUES.clone();
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("ID", 0);
        ID = anonymousClass1;
        $VALUES = new CustomType[]{anonymousClass1};
    }
}

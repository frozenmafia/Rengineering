package com.dreampay.device;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
public final class Device$userAgent$2 extends Lambda implements Styleable.ArcMotion<String> {
    public static final Device$userAgent$2 INSTANCE = new Device$userAgent$2();

    Device$userAgent$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String property;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
        }
        return property == null ? "" : property;
    }
}

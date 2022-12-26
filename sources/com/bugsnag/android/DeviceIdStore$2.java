package com.bugsnag.android;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class DeviceIdStore$2 extends Lambda implements Styleable.ArcMotion<UUID> {
    public static final DeviceIdStore$2 INSTANCE = new DeviceIdStore$2();

    DeviceIdStore$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final UUID invoke() {
        UUID randomUUID = UUID.randomUUID();
        runAnimators.toString(randomUUID, "UUID.randomUUID()");
        return randomUUID;
    }
}

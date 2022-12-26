package com.bugsnag.android;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class DeviceIdStore$1 extends Lambda implements Styleable.ArcMotion<UUID> {
    public static final DeviceIdStore$1 INSTANCE = new DeviceIdStore$1();

    DeviceIdStore$1() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final UUID invoke() {
        UUID randomUUID = UUID.randomUUID();
        runAnimators.toString(randomUUID, "UUID.randomUUID()");
        return randomUUID;
    }
}

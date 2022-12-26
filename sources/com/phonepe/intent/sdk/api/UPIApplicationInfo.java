package com.phonepe.intent.sdk.api;

import o.runAnimators;
/* loaded from: classes7.dex */
public final class UPIApplicationInfo {
    public final long chmha;
    public final String cqqlq;

    /* renamed from: irjuc  reason: collision with root package name */
    public final String f1402irjuc;

    public UPIApplicationInfo(String str, String str2, long j) {
        runAnimators.valueOf(str, "packageName");
        runAnimators.valueOf(str2, "applicationName");
        this.f1402irjuc = str;
        this.cqqlq = str2;
        this.chmha = j;
    }

    public final String getApplicationName() {
        return this.cqqlq;
    }

    public final String getPackageName() {
        return this.f1402irjuc;
    }

    public final long getVersion() {
        return this.chmha;
    }
}

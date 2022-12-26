package com.apxor.androidsdk.core.utils.network;
/* loaded from: classes3.dex */
public class NetworkResponse {
    public static final int OK = 200;
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private String f287b;
    private long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetworkResponse(int i, long j, String str) {
        this.a = i;
        this.c = j;
        this.f287b = str;
    }

    public int getCode() {
        return this.a;
    }

    public String getResponseString() {
        return this.f287b;
    }

    public long getSentMillis() {
        return this.c;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.StreamRequest;
import java.util.Map;
/* loaded from: classes4.dex */
public final class akl implements StreamRequest {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f605b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private Map l;
    private String m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f606o;
    private String p;
    private StreamRequest.StreamFormat q;
    private Boolean r;
    private transient Object s;

    public final void a(String str) {
        this.f605b = str;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final void g(String str) {
        this.k = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Map<String, String> getAdTagParameters() {
        return this.l;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getApiKey() {
        return this.f605b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAssetKey() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAuthToken() {
        return this.f606o;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentSourceId() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentUrl() {
        return this.n;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getCustomAssetKey() {
        return this.g;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final boolean getEnableNonce() {
        return this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final StreamRequest.StreamFormat getFormat() {
        return this.q;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getLiveStreamEventId() {
        return this.h;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getManifestSuffix() {
        return this.m;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getNetworkCode() {
        return this.f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getOAuthToken() {
        return this.k;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getProjectNumber() {
        return this.j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getRegion() {
        return this.i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getStreamActivityMonitorId() {
        return this.p;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Boolean getUseQAStreamBaseUrl() {
        return this.r;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Object getUserRequestContext() {
        return this.s;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getVideoId() {
        return this.e;
    }

    public final void h(String str) {
        this.j = str;
    }

    public final void i(String str) {
        this.i = str;
    }

    public final void j(String str) {
        this.e = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAdTagParameters(Map<String, String> map) {
        this.l = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAuthToken(String str) {
        this.f606o = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setContentUrl(String str) {
        this.n = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setEnableNonce(boolean z) {
        this.d = z;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.q = streamFormat;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setManifestSuffix(String str) {
        this.m = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setStreamActivityMonitorId(String str) {
        this.p = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.r = bool;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUserRequestContext(Object obj) {
        this.s = obj;
    }
}

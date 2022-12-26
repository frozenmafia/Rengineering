package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class rl implements rr {
    private final /* synthetic */ int c;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ rl f1249b = new rl(1);
    public static final /* synthetic */ rl a = new rl(0);

    private /* synthetic */ rl(int i) {
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rr
    public final int a(Object obj) {
        if (this.c == 0) {
            int i = rs.a;
            return ((rd) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
        int i2 = rs.a;
        String str = ((rd) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (cp.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}

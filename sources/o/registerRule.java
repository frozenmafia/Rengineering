package o;

import java.net.Proxy;
/* loaded from: classes5.dex */
public final /* synthetic */ class registerRule {
    public static final /* synthetic */ int[] valueOf;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        valueOf = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}

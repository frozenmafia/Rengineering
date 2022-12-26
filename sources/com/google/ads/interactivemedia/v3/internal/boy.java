package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class boy {
    static final boy a = new boy(null);

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f922b = false;
    private static volatile boy c;
    private static volatile boy d;
    private final Map e;

    boy() {
        this.e = new HashMap();
    }

    public static boy a() {
        boy boyVar = c;
        if (boyVar == null) {
            synchronized (boy.class) {
                boyVar = c;
                if (boyVar == null) {
                    boyVar = a;
                    c = boyVar;
                }
            }
        }
        return boyVar;
    }

    public bow c(bqq bqqVar, int i) {
        return (bow) this.e.get(new box(bqqVar, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boy(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public static boy b() {
        boy boyVar = d;
        if (boyVar != null) {
            return boyVar;
        }
        synchronized (boy.class) {
            boy boyVar2 = d;
            if (boyVar2 != null) {
                return boyVar2;
            }
            boy b2 = bpf.b(boy.class);
            d = b2;
            return b2;
        }
    }
}

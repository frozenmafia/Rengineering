package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;
/* loaded from: classes7.dex */
class ave implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ave(avf avfVar) {
        Object[] objArr = new Object[avfVar.size()];
        Object[] objArr2 = new Object[avfVar.size()];
        axd it = avfVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.f736b = objArr2;
    }

    avd a(int i) {
        return new avd(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof avk)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.f736b;
            avd a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.a(objArr[i], objArr2[i]);
            }
            return a.b();
        }
        avk avkVar = (avk) obj;
        avd a2 = a(avkVar.size());
        axd it = avkVar.iterator();
        axd it2 = ((auv) this.f736b).iterator();
        while (it.hasNext()) {
            a2.a(it.next(), it2.next());
        }
        return a2.b();
    }
}

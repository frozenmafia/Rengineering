package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class asx {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final asw f706b;
    private asw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ asx(String str) {
        asw aswVar = new asw(null);
        this.f706b = aswVar;
        this.c = aswVar;
        atc.k(str);
        this.a = str;
    }

    public final asx a(Object obj) {
        asw aswVar = new asw(null);
        this.c.f705b = aswVar;
        this.c = aswVar;
        aswVar.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        asw aswVar = this.f706b.f705b;
        String str = "";
        while (aswVar != null) {
            Object obj = aswVar.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            aswVar = aswVar.f705b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}

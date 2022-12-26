package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;
/* loaded from: classes4.dex */
public final class bjw extends Number {
    private final String a;

    public bjw(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bjw) {
            String str = this.a;
            String str2 = ((bjw) obj).a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public final String toString() {
        return this.a;
    }
}

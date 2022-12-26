package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
/* loaded from: classes4.dex */
public final class bix extends bis {
    private final Object a;

    public bix(Boolean bool) {
        this.a = bool;
    }

    public bix(Number number) {
        this.a = number;
    }

    public bix(String str) {
        bic.g(str);
        this.a = str;
    }

    private static boolean g(bix bixVar) {
        Object obj = bixVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public final Number a() {
        Object obj = this.a;
        return obj instanceof String ? new bjw((String) obj) : (Number) obj;
    }

    public final String b() {
        if (e()) {
            return a().toString();
        }
        if (d()) {
            return ((Boolean) this.a).toString();
        }
        return (String) this.a;
    }

    public final boolean c() {
        if (d()) {
            return ((Boolean) this.a).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    public final boolean d() {
        return this.a instanceof Boolean;
    }

    public final boolean e() {
        return this.a instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bix bixVar = (bix) obj;
        if (g(this) && g(bixVar)) {
            return a().longValue() == bixVar.a().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(bixVar.a instanceof Number)) {
            return obj2.equals(bixVar.a);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = bixVar.a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final boolean f() {
        return this.a instanceof String;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (g(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}

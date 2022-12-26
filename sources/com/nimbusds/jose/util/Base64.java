package com.nimbusds.jose.util;

import java.io.Serializable;
import java.math.BigInteger;
import o.QueryInterceptorOpenHelperFactory;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda0;
import o.Relation;
import o.getBindArgs;
/* loaded from: classes7.dex */
public class Base64 implements Serializable {
    private static final long serialVersionUID = 1;
    private final String value;

    public Base64(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.value = str;
    }

    public byte[] decode() {
        return QueryInterceptorOpenHelperFactory.toString(this.value);
    }

    public BigInteger decodeToBigInteger() {
        return new BigInteger(1, decode());
    }

    public String decodeToString() {
        return new String(decode(), Relation.valueOf);
    }

    public String toJSONString() {
        return QueryInterceptorStatement$$ExternalSyntheticLambda0.ag$a(this.value);
    }

    public String toString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Base64) && toString().equals(obj.toString());
    }

    public static Base64 from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64(str);
    }

    public static Base64 encode(byte[] bArr) {
        return new Base64(QueryInterceptorOpenHelperFactory.toString(bArr, false));
    }

    public static Base64 encode(BigInteger bigInteger) {
        return encode(getBindArgs.values(bigInteger));
    }

    public static Base64 encode(String str) {
        return encode(str.getBytes(Relation.valueOf));
    }
}

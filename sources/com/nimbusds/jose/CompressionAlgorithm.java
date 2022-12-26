package com.nimbusds.jose;

import java.io.Serializable;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda0;
/* loaded from: classes7.dex */
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");
    private static final long serialVersionUID = 1;
    private final String name;

    public CompressionAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public String toString() {
        return this.name;
    }

    public String toJSONString() {
        return QueryInterceptorStatement$$ExternalSyntheticLambda0.ag$a(this.name);
    }
}

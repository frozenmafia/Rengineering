package com.nimbusds.jose;

import java.io.Serializable;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda0;
/* loaded from: classes7.dex */
public final class JOSEObjectType implements Serializable {
    public static final JOSEObjectType JOSE = new JOSEObjectType("JOSE");
    public static final JOSEObjectType JOSE_JSON = new JOSEObjectType("JOSE+JSON");
    public static final JOSEObjectType JWT = new JOSEObjectType("JWT");
    private static final long serialVersionUID = 1;
    private final String type;

    public JOSEObjectType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The object type must not be null");
        }
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.toLowerCase().hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof JOSEObjectType) && this.type.toLowerCase().equals(((JOSEObjectType) obj).type.toLowerCase());
    }

    public String toString() {
        return this.type;
    }

    public String toJSONString() {
        return QueryInterceptorStatement$$ExternalSyntheticLambda0.ag$a(this.type);
    }
}

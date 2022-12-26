package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ResponseField$ah$a extends ResponseField.values {
    private final List<String> valueOf;

    public final List<String> ah$a() {
        return this.valueOf;
    }

    public ResponseField$ah$a(List<String> list) {
        runAnimators.valueOf(list, "typeNames");
        this.valueOf = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseField$ah$a) && !(runAnimators.values(this.valueOf, ((ResponseField$ah$a) obj).valueOf) ^ true);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }
}

package com.apollographql.apollo.api;

import androidx.window.embedding.ActivityRule$$ExternalSyntheticBackport0;
import com.apollographql.apollo.api.ResponseField;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ResponseField$ag$a extends ResponseField.values {
    private final String ag$a;
    private final boolean valueOf;
    private final boolean values;

    public final String ah$a() {
        return this.ag$a;
    }

    public final boolean ag$a() {
        return this.valueOf;
    }

    public ResponseField$ag$a(String str, boolean z) {
        runAnimators.valueOf(str, "variableName");
        this.ag$a = str;
        this.valueOf = z;
        this.values = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResponseField$ag$a) {
            ResponseField$ag$a responseField$ag$a = (ResponseField$ag$a) obj;
            return !(runAnimators.values((Object) this.ag$a, (Object) responseField$ag$a.ag$a) ^ true) && this.valueOf == responseField$ag$a.valueOf;
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + ActivityRule$$ExternalSyntheticBackport0.m(this.valueOf);
    }
}

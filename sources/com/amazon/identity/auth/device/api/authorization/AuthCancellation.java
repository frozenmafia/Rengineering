package com.amazon.identity.auth.device.api.authorization;

import android.os.Bundle;
import defpackage.ch;
/* loaded from: classes.dex */
public final class AuthCancellation {
    private final Cause ag$a;
    private final String toString;

    /* loaded from: classes.dex */
    public enum Cause {
        FAILED_AUTHENTICATION;

        static Cause a(int i) {
            return FAILED_AUTHENTICATION;
        }
    }

    public AuthCancellation(Bundle bundle) {
        this(Cause.a(bundle.getInt(ch.b.CAUSE_ID.f19a)), bundle.getString(ch.b.ON_CANCEL_DESCRIPTION.f19a));
    }

    public AuthCancellation(Cause cause, String str) {
        this.ag$a = cause;
        this.toString = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AuthCancellation authCancellation = (AuthCancellation) obj;
            if (this.ag$a != authCancellation.ag$a) {
                return false;
            }
            String str = this.toString;
            String str2 = authCancellation.toString;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Cause cause = this.ag$a;
        int hashCode = cause == null ? 0 : cause.hashCode();
        String str = this.toString;
        return ((hashCode + 31) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("%s {cause='%s', description='%s'}", super.toString(), this.ag$a.toString(), this.toString);
    }

    public Cause valueOf() {
        return this.ag$a;
    }
}

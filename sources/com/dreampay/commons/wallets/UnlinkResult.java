package com.dreampay.commons.wallets;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class UnlinkResult {
    private final String message;

    public static /* synthetic */ UnlinkResult copy$default(UnlinkResult unlinkResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlinkResult.message;
        }
        return unlinkResult.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final UnlinkResult copy(String str) {
        runAnimators.ag$a(str, "message");
        return new UnlinkResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnlinkResult) && runAnimators.values((Object) this.message, (Object) ((UnlinkResult) obj).message);
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "UnlinkResult(message=" + this.message + ')';
    }

    public UnlinkResult(String str) {
        runAnimators.ag$a(str, "message");
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }
}

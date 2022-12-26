package com.dreampay.commons;

import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class PostPaymentUrl {
    @isFullSpan(valueOf = "failure")
    private final String failure;
    @isFullSpan(valueOf = "success")
    private final String success;
    @isFullSpan(valueOf = "webhook")
    private final String webhook;

    public static /* synthetic */ PostPaymentUrl copy$default(PostPaymentUrl postPaymentUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postPaymentUrl.failure;
        }
        if ((i & 2) != 0) {
            str2 = postPaymentUrl.success;
        }
        if ((i & 4) != 0) {
            str3 = postPaymentUrl.webhook;
        }
        return postPaymentUrl.copy(str, str2, str3);
    }

    public final String component1() {
        return this.failure;
    }

    public final String component2() {
        return this.success;
    }

    public final String component3() {
        return this.webhook;
    }

    public final PostPaymentUrl copy(String str, String str2, String str3) {
        return new PostPaymentUrl(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostPaymentUrl) {
            PostPaymentUrl postPaymentUrl = (PostPaymentUrl) obj;
            return runAnimators.values((Object) this.failure, (Object) postPaymentUrl.failure) && runAnimators.values((Object) this.success, (Object) postPaymentUrl.success) && runAnimators.values((Object) this.webhook, (Object) postPaymentUrl.webhook);
        }
        return false;
    }

    public int hashCode() {
        String str = this.failure;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.success;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.webhook;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PostPaymentUrl(failure=" + ((Object) this.failure) + ", success=" + ((Object) this.success) + ", webhook=" + ((Object) this.webhook) + ')';
    }

    public PostPaymentUrl(String str, String str2, String str3) {
        this.failure = str;
        this.success = str2;
        this.webhook = str3;
    }

    public final String getFailure() {
        return this.failure;
    }

    public final String getSuccess() {
        return this.success;
    }

    public final String getWebhook() {
        return this.webhook;
    }
}

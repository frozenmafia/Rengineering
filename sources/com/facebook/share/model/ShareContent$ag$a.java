package com.facebook.share.model;

import android.net.Uri;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent$ag$a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class ShareContent$ag$a<M extends ShareContent<M, B>, B extends ShareContent$ag$a<M, B>> {
    private String HaptikSDK$b;
    private String ag$a;
    private Uri ah$a;
    private String toString;
    private ShareHashtag valueOf;
    private List<String> values;

    public final Uri ah$a() {
        return this.ah$a;
    }

    public final List<String> values() {
        return this.values;
    }

    public final String invoke() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final ShareHashtag ag$a() {
        return this.valueOf;
    }

    public final B valueOf(Uri uri) {
        this.ah$a = uri;
        return this;
    }

    public final B toString(List<String> list) {
        this.values = list == null ? null : Collections.unmodifiableList(list);
        return this;
    }

    public final B ag$a(String str) {
        this.toString = str;
        return this;
    }

    public final B valueOf(String str) {
        this.ag$a = str;
        return this;
    }

    public final B ah$a(String str) {
        this.HaptikSDK$b = str;
        return this;
    }

    public final B values(ShareHashtag shareHashtag) {
        this.valueOf = shareHashtag;
        return this;
    }

    public B ag$a(M m) {
        return m == null ? this : (B) valueOf(m.HaptikSDK$a()).toString(m.HaptikSDK$e()).ag$a(m.HaptikSDK$d()).valueOf(m.ah$b()).ah$a(m.HaptikWebView()).values(m.getSignupData());
    }
}

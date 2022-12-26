package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent$ag$a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends ShareContent$ag$a<M, B>> implements ShareModel {
    private final ShareHashtag HaptikSDK$b;
    private final String ag$a;
    private final List<String> ah$a;
    private final Uri toString;
    private final String valueOf;
    private final String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Uri HaptikSDK$a() {
        return this.toString;
    }

    public final List<String> HaptikSDK$e() {
        return this.ah$a;
    }

    public final String HaptikSDK$d() {
        return this.values;
    }

    public final String ah$b() {
        return this.ag$a;
    }

    public final String HaptikWebView() {
        return this.valueOf;
    }

    public final ShareHashtag getSignupData() {
        return this.HaptikSDK$b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareContent(ShareContent$ag$a<M, B> shareContent$ag$a) {
        runAnimators.ag$a(shareContent$ag$a, "builder");
        this.toString = shareContent$ag$a.ah$a();
        this.ah$a = shareContent$ag$a.values();
        this.values = shareContent$ag$a.invoke();
        this.ag$a = shareContent$ag$a.valueOf();
        this.valueOf = shareContent$ag$a.HaptikSDK$b();
        this.HaptikSDK$b = shareContent$ag$a.ag$a();
    }

    public ShareContent(Parcel parcel) {
        runAnimators.ag$a(parcel, "parcel");
        this.toString = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ah$a = toString(parcel);
        this.values = parcel.readString();
        this.ag$a = parcel.readString();
        this.valueOf = parcel.readString();
        this.HaptikSDK$b = new ShareHashtag.toString().ah$a(parcel).valueOf();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeParcelable(this.toString, 0);
        parcel.writeStringList(this.ah$a);
        parcel.writeString(this.values);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.valueOf);
        parcel.writeParcelable(this.HaptikSDK$b, 0);
    }

    private final List<String> toString(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }
}

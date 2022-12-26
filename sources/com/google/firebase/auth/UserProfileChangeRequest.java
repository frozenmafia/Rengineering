package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.findTargetSnapPosition;
/* loaded from: classes7.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new findTargetSnapPosition();
    private String ag$a;
    private String ah$a;
    private Uri toString;
    private boolean valueOf;
    private boolean values;

    public UserProfileChangeRequest(String str, String str2, boolean z, boolean z2) {
        this.ah$a = str;
        this.ag$a = str2;
        this.valueOf = z;
        this.values = z2;
        this.toString = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public final boolean ag$a() {
        return this.valueOf;
    }

    public Uri ah$a() {
        return this.toString;
    }

    public final boolean ah$b() {
        return this.values;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public String values() {
        return this.ah$a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, values(), false);
        SafeParcelWriter.writeString(parcel, 3, this.ag$a, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.valueOf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.values);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

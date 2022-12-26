package droidninja.filepicker.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class PhotoDirectory extends BaseFile implements Parcelable {
    public static final Parcelable.Creator<PhotoDirectory> CREATOR = new Parcelable.Creator<PhotoDirectory>() { // from class: droidninja.filepicker.models.PhotoDirectory.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public PhotoDirectory createFromParcel(Parcel parcel) {
            return new PhotoDirectory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public PhotoDirectory[] newArray(int i) {
            return new PhotoDirectory[i];
        }
    };
    private List<Media> HaptikSDK$a = new ArrayList();
    private long HaptikSDK$b;
    private String HaptikSDK$c;
    private String ah$a;
    private String valueOf;

    @Override // droidninja.filepicker.models.BaseFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PhotoDirectory() {
    }

    protected PhotoDirectory(Parcel parcel) {
        this.valueOf = parcel.readString();
        this.ah$a = parcel.readString();
        this.HaptikSDK$c = parcel.readString();
        this.HaptikSDK$b = parcel.readLong();
    }

    @Override // droidninja.filepicker.models.BaseFile
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoDirectory) {
            PhotoDirectory photoDirectory = (PhotoDirectory) obj;
            boolean isEmpty = TextUtils.isEmpty(this.valueOf);
            boolean isEmpty2 = TextUtils.isEmpty(photoDirectory.valueOf);
            if ((!isEmpty) && (true ^ isEmpty2) && TextUtils.equals(this.valueOf, photoDirectory.valueOf)) {
                return TextUtils.equals(this.HaptikSDK$c, photoDirectory.HaptikSDK$c);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(this.valueOf)) {
            if (TextUtils.isEmpty(this.HaptikSDK$c)) {
                return 0;
            }
            return this.HaptikSDK$c.hashCode();
        }
        int hashCode = this.valueOf.hashCode();
        return TextUtils.isEmpty(this.HaptikSDK$c) ? hashCode : (hashCode * 31) + this.HaptikSDK$c.hashCode();
    }

    public String values() {
        List<Media> list = this.HaptikSDK$a;
        if (list != null && list.size() > 0) {
            return this.HaptikSDK$a.get(0).ag$a();
        }
        String str = this.ah$a;
        return str != null ? str : "";
    }

    public void ah$a(String str) {
        this.ah$a = str;
    }

    public String ah$b() {
        return this.HaptikSDK$c;
    }

    public void ag$a(String str) {
        this.HaptikSDK$c = str;
    }

    public long HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public void ag$a(long j) {
        this.HaptikSDK$b = j;
    }

    public List<Media> invoke() {
        return this.HaptikSDK$a;
    }

    public void ah$a(int i, String str, String str2, int i2) {
        this.HaptikSDK$a.add(new Media(i, str, str2, i2));
    }

    public void values(List<Media> list) {
        this.HaptikSDK$a.addAll(list);
    }

    public String ah$a() {
        if (this.valueOf.equals("ALL_PHOTOS_BUCKET_ID")) {
            return null;
        }
        return this.valueOf;
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    @Override // droidninja.filepicker.models.BaseFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ah$a);
        parcel.writeString(this.HaptikSDK$c);
        parcel.writeLong(this.HaptikSDK$b);
    }
}

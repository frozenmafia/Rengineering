package com.apxor.androidsdk.plugins.survey.fragments;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes6.dex */
public abstract class a implements Parcelable {
    private final Parcelable a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f380b = new C0279a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: com.apxor.androidsdk.plugins.survey.fragments.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0279a extends a {
        C0279a() {
            super((C0279a) null);
        }
    }

    /* loaded from: classes6.dex */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f380b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? f380b : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.a = parcelable == f380b ? null : parcelable;
    }

    /* synthetic */ a(C0279a c0279a) {
        this();
    }

    public final Parcelable a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}

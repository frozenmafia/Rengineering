package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class o implements Comparator<n>, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m(1);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1189b;
    private final n[] c;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Parcel parcel) {
        this.a = parcel.readString();
        n[] nVarArr = (n[]) cp.G((n[]) parcel.createTypedArray(n.CREATOR));
        this.c = nVarArr;
        this.f1189b = nVarArr.length;
    }

    public static o c(o oVar, o oVar2) {
        String str;
        n[] nVarArr;
        n[] nVarArr2;
        ArrayList arrayList = new ArrayList();
        if (oVar != null) {
            str = oVar.a;
            for (n nVar : oVar.c) {
                if (nVar.b()) {
                    arrayList.add(nVar);
                }
            }
        } else {
            str = null;
        }
        if (oVar2 != null) {
            if (str == null) {
                str = oVar2.a;
            }
            int size = arrayList.size();
            for (n nVar2 : oVar2.c) {
                if (nVar2.b()) {
                    UUID uuid = nVar2.a;
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (((n) arrayList.get(i)).a.equals(uuid)) {
                                break;
                            }
                            i++;
                        } else {
                            arrayList.add(nVar2);
                            break;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new o(str, arrayList);
    }

    public final n a(int i) {
        return this.c[i];
    }

    public final o b(String str) {
        return cp.V(this.a, str) ? this : new o(str, false, this.c);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(n nVar, n nVar2) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        if (i.a.equals(nVar3.a)) {
            return !i.a.equals(nVar4.a) ? 1 : 0;
        }
        return nVar3.a.compareTo(nVar4.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return cp.V(this.a, oVar.a) && Arrays.equals(this.c, oVar.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.c);
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    public o(String str, List list) {
        this(str, false, (n[]) list.toArray(new n[0]));
    }

    private o(String str, boolean z, n... nVarArr) {
        this.a = str;
        nVarArr = z ? (n[]) nVarArr.clone() : nVarArr;
        this.c = nVarArr;
        this.f1189b = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public o(String str, n... nVarArr) {
        this(str, true, nVarArr);
    }

    public o(List list) {
        this(null, false, (n[]) list.toArray(new n[0]));
    }
}

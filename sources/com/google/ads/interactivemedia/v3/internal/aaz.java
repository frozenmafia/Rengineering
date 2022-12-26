package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class aaz extends aav {
    public static final Parcelable.Creator<aaz> CREATOR = new aal(9);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f434b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aaz(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.v3.internal.cp.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r3 = r3.readString()
            r2.f434b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aaz.<init>(android.os.Parcel):void");
    }

    private static List b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.ads.interactivemedia.v3.internal.aav, com.google.ads.interactivemedia.v3.internal.an
    public final void a(ak akVar) {
        char c;
        String str = this.f;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                akVar.L(this.f434b);
                return;
            case 2:
            case 3:
                akVar.z(this.f434b);
                return;
            case 4:
            case 5:
                akVar.x(this.f434b);
                return;
            case 6:
            case 7:
                akVar.y(this.f434b);
                return;
            case '\b':
            case '\t':
                String[] ak = cp.ak(this.f434b, "/");
                try {
                    int parseInt = Integer.parseInt(ak[0]);
                    Integer valueOf = ak.length > 1 ? Integer.valueOf(Integer.parseInt(ak[1])) : null;
                    akVar.N(Integer.valueOf(parseInt));
                    akVar.M(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    akVar.G(Integer.valueOf(Integer.parseInt(this.f434b)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.f434b.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.f434b.substring(0, 2));
                    akVar.F(Integer.valueOf(parseInt2));
                    akVar.E(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List b2 = b(this.f434b);
                int size = b2.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        akVar.E((Integer) b2.get(2));
                    }
                    akVar.F((Integer) b2.get(1));
                }
                akVar.G((Integer) b2.get(0));
                return;
            case 15:
                List b3 = b(this.f434b);
                int size2 = b3.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        akVar.H((Integer) b3.get(2));
                    }
                    akVar.I((Integer) b3.get(1));
                }
                akVar.J((Integer) b3.get(0));
                return;
            case 16:
            case 17:
                akVar.B(this.f434b);
                return;
            case 18:
            case 19:
                akVar.C(this.f434b);
                return;
            case 20:
            case 21:
                akVar.O(this.f434b);
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaz aazVar = (aaz) obj;
        return cp.V(this.f, aazVar.f) && cp.V(this.a, aazVar.a) && cp.V(this.f434b, aazVar.f434b);
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode();
        String str = this.a;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f434b;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.f434b;
        return str + ": description=" + str2 + ": value=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.f434b);
    }

    public aaz(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.f434b = str3;
    }
}

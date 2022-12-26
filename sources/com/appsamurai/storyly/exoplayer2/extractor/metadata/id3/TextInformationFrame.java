package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.ArrayList;
import java.util.List;
import o.getElevationDegrees;
import o.getResId;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.TextInformationFrame.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final String ag$a;
    public final String values;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.ag$a = str2;
        this.values = str3;
    }

    TextInformationFrame(Parcel parcel) {
        super((String) getElevationDegrees.ah$a(parcel.readString()));
        this.ag$a = parcel.readString();
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame, com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        char c;
        String str = this.HaptikSDK$b;
        str.hashCode();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
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
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
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
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    valuesVar.ah$a(this.values);
                    return;
                case 1:
                case 11:
                    valuesVar.ag$a(this.values);
                    return;
                case 2:
                case '\f':
                    valuesVar.ag$a(Integer.valueOf(Integer.parseInt(this.values.substring(2, 4)))).values(Integer.valueOf(Integer.parseInt(this.values.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    valuesVar.toString(this.values);
                    return;
                case 4:
                case 18:
                    valuesVar.valueOf(this.values);
                    return;
                case 5:
                case 19:
                    valuesVar.ah$b(this.values);
                    return;
                case 6:
                case 20:
                    String[] ah$a = getElevationDegrees.ah$a(this.values, "/");
                    valuesVar.getInitSettings(Integer.valueOf(Integer.parseInt(ah$a[0]))).ah$b(ah$a.length > 1 ? Integer.valueOf(Integer.parseInt(ah$a[1])) : null);
                    return;
                case 7:
                case 16:
                    valuesVar.HaptikSDK$e(this.values);
                    return;
                case '\b':
                case 15:
                    valuesVar.HaptikWebView(this.values);
                    return;
                case '\t':
                case 21:
                    valuesVar.valueOf(Integer.valueOf(Integer.parseInt(this.values)));
                    return;
                case '\r':
                    List<Integer> ah$a2 = ah$a(this.values);
                    int size = ah$a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            valuesVar.values(ah$a2.get(2));
                        }
                        valuesVar.ag$a(ah$a2.get(1));
                    }
                    valuesVar.valueOf(ah$a2.get(0));
                    return;
                case 14:
                    List<Integer> ah$a3 = ah$a(this.values);
                    int size2 = ah$a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            valuesVar.HaptikSDK$a(ah$a3.get(2));
                        }
                        valuesVar.HaptikSDK$b(ah$a3.get(1));
                    }
                    valuesVar.invoke(ah$a3.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return getElevationDegrees.values(this.HaptikSDK$b, textInformationFrame.HaptikSDK$b) && getElevationDegrees.values(this.ag$a, textInformationFrame.ag$a) && getElevationDegrees.values(this.values, textInformationFrame.values);
    }

    public int hashCode() {
        int hashCode = this.HaptikSDK$b.hashCode();
        String str = this.ag$a;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.values;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": description=" + this.ag$a + ": value=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.values);
    }

    private static List<Integer> ah$a(String str) {
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
}

package o;

import java.util.ArrayList;
import java.util.zip.Inflater;
import o.shouldKeepOnScreen;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class setSplashScreenWaitPredicate {
    private static int valueOf(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    public static shouldKeepOnScreen valueOf(byte[] bArr, int i) {
        ArrayList<shouldKeepOnScreen$ah$a> arrayList;
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(bArr);
        try {
            arrayList = ah$a(c$default$setContentDescription) ? ag$a(c$default$setContentDescription) : values(c$default$setContentDescription);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new shouldKeepOnScreen(arrayList.get(0), arrayList.get(1), i);
        }
        return new shouldKeepOnScreen(arrayList.get(0), i);
    }

    private static boolean ah$a(C$default$setContentDescription c$default$setContentDescription) {
        c$default$setContentDescription.HaptikSDK$a(4);
        int signupData = c$default$setContentDescription.getSignupData();
        c$default$setContentDescription.HaptikSDK$b(0);
        return signupData == 1886547818;
    }

    private static ArrayList<shouldKeepOnScreen$ah$a> ag$a(C$default$setContentDescription c$default$setContentDescription) {
        c$default$setContentDescription.HaptikSDK$a(8);
        int valueOf = c$default$setContentDescription.valueOf();
        int HaptikSDK$a = c$default$setContentDescription.HaptikSDK$a();
        while (valueOf < HaptikSDK$a) {
            int signupData = c$default$setContentDescription.getSignupData() + valueOf;
            if (signupData <= valueOf || signupData > HaptikSDK$a) {
                return null;
            }
            int signupData2 = c$default$setContentDescription.getSignupData();
            if (signupData2 == 2037673328 || signupData2 == 1836279920) {
                c$default$setContentDescription.values(signupData);
                return values(c$default$setContentDescription);
            }
            c$default$setContentDescription.HaptikSDK$b(signupData);
            valueOf = signupData;
        }
        return null;
    }

    private static ArrayList<shouldKeepOnScreen$ah$a> values(C$default$setContentDescription c$default$setContentDescription) {
        if (c$default$setContentDescription.extraCallbackWithResult() != 0) {
            return null;
        }
        c$default$setContentDescription.HaptikSDK$a(7);
        int signupData = c$default$setContentDescription.getSignupData();
        if (signupData == 1684433976) {
            C$default$setContentDescription c$default$setContentDescription2 = new C$default$setContentDescription();
            Inflater inflater = new Inflater(true);
            try {
                if (!getElevationDegrees.toString(c$default$setContentDescription, c$default$setContentDescription2, inflater)) {
                    return null;
                }
                inflater.end();
                c$default$setContentDescription = c$default$setContentDescription2;
            } finally {
                inflater.end();
            }
        } else if (signupData != 1918990112) {
            return null;
        }
        return valueOf(c$default$setContentDescription);
    }

    private static ArrayList<shouldKeepOnScreen$ah$a> valueOf(C$default$setContentDescription c$default$setContentDescription) {
        ArrayList<shouldKeepOnScreen$ah$a> arrayList = new ArrayList<>();
        int valueOf = c$default$setContentDescription.valueOf();
        int HaptikSDK$a = c$default$setContentDescription.HaptikSDK$a();
        while (valueOf < HaptikSDK$a) {
            int signupData = c$default$setContentDescription.getSignupData() + valueOf;
            if (signupData <= valueOf || signupData > HaptikSDK$a) {
                return null;
            }
            if (c$default$setContentDescription.getSignupData() == 1835365224) {
                shouldKeepOnScreen$ah$a setsplashscreenwaitpredicate = toString(c$default$setContentDescription);
                if (setsplashscreenwaitpredicate == null) {
                    return null;
                }
                arrayList.add(setsplashscreenwaitpredicate);
            }
            c$default$setContentDescription.HaptikSDK$b(signupData);
            valueOf = signupData;
        }
        return arrayList;
    }

    private static shouldKeepOnScreen$ah$a toString(C$default$setContentDescription c$default$setContentDescription) {
        int signupData = c$default$setContentDescription.getSignupData();
        if (signupData > 10000) {
            return null;
        }
        float[] fArr = new float[signupData];
        for (int i = 0; i < signupData; i++) {
            fArr[i] = c$default$setContentDescription.HaptikSDK$c();
        }
        int signupData2 = c$default$setContentDescription.getSignupData();
        if (signupData2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(signupData * 2.0d) / log);
        getAzimuthDegrees getazimuthdegrees = new getAzimuthDegrees(c$default$setContentDescription.ah$a());
        int i2 = 8;
        getazimuthdegrees.values(c$default$setContentDescription.valueOf() * 8);
        float[] fArr2 = new float[signupData2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < signupData2) {
            int i6 = 0;
            while (i6 < i3) {
                int valueOf = iArr[i6] + valueOf(getazimuthdegrees.valueOf(ceil));
                if (valueOf >= signupData || valueOf < 0) {
                    return null;
                }
                fArr2[i5] = fArr[valueOf];
                iArr[i6] = valueOf;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        getazimuthdegrees.values((getazimuthdegrees.ag$a() + 7) & (-8));
        int i7 = 32;
        int valueOf2 = getazimuthdegrees.valueOf(32);
        shouldKeepOnScreen.valueOf[] valueofArr = new shouldKeepOnScreen.valueOf[valueOf2];
        int i8 = 0;
        while (i8 < valueOf2) {
            int valueOf3 = getazimuthdegrees.valueOf(i2);
            int valueOf4 = getazimuthdegrees.valueOf(i2);
            int valueOf5 = getazimuthdegrees.valueOf(i7);
            if (valueOf5 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(signupData2 * d) / log);
            float[] fArr3 = new float[valueOf5 * 3];
            float[] fArr4 = new float[valueOf5 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < valueOf5; i10++) {
                i9 += valueOf(getazimuthdegrees.valueOf(ceil2));
                if (i9 < 0 || i9 >= signupData2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            valueofArr[i8] = new shouldKeepOnScreen.valueOf(valueOf3, fArr3, fArr4, valueOf4);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new shouldKeepOnScreen$ah$a(valueofArr);
    }
}

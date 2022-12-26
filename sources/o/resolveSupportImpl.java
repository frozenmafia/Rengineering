package o;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import o.scheduleTargetChange;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public class resolveSupportImpl<T extends View, U extends BaseViewManagerInterface<T> & scheduleTargetChange<T>> extends BaseViewManagerDelegate<T, U> {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 250;
    private static boolean ah$a = true;
    private static char[] toString = {366, 355, 358, 351};
    private static boolean valueOf = true;
    private static int values;

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public resolveSupportImpl(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        int i = values + 93;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        str.hashCode();
        char c = 65535;
        boolean z = false;
        int intValue = 0;
        boolean booleanValue = false;
        switch (str.hashCode()) {
            case -1822687399:
                if (str.equals("translucent")) {
                    c = 0;
                    break;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    c = 2;
                    break;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    c = 3;
                    break;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    c = 4;
                    break;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    c = 5;
                    break;
                }
                break;
            case -1217487446:
                if (str.equals("hidden")) {
                    c = 6;
                    break;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    c = 7;
                    break;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c = '\b';
                    break;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    c = '\t';
                    break;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    c = '\n';
                    break;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    c = 11;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = '\f';
                    break;
                }
                break;
            case 110371416:
                if (str.equals(toString(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-124, -125, -127, -126, -127}).intern())) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    c = 14;
                    break;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    c = 15;
                    break;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    c = 16;
                    break;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    c = 17;
                    break;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    c = 18;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = 19;
                    break;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    c = 20;
                    break;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    c = 21;
                    break;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    c = 22;
                    break;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    c = 23;
                    break;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    c = 24;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                scheduleTargetChange scheduletargetchange = (scheduleTargetChange) this.mViewManager;
                if (!(obj != null)) {
                    int i3 = HaptikSDK$b + 77;
                    values = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    z = ((Boolean) obj).booleanValue();
                }
                scheduletargetchange.setTranslucent(t, z);
                return;
            case 1:
                ((scheduleTargetChange) this.mViewManager).setTitleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 2:
                ((scheduleTargetChange) this.mViewManager).setLargeTitleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((scheduleTargetChange) this.mViewManager).setTitleFontFamily(t, obj != null ? (String) obj : null);
                return;
            case 4:
                ((scheduleTargetChange) this.mViewManager).setDisableBackButtonMenu(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                scheduleTargetChange scheduletargetchange2 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i5 = values + 35;
                    HaptikSDK$b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 28 / 0;
                    }
                } else {
                    r11 = (String) obj;
                }
                scheduletargetchange2.setTitleFontWeight(t, r11);
                return;
            case 6:
                ((scheduleTargetChange) this.mViewManager).setHidden(t, (obj != null ? (char) 0 : (char) 1) == 0 ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((scheduleTargetChange) this.mViewManager).setLargeTitleFontSize(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case '\b':
                ((scheduleTargetChange) this.mViewManager).setDirection(t, (String) obj);
                int i7 = values + 39;
                HaptikSDK$b = i7 % 128;
                int i8 = i7 % 2;
                return;
            case '\t':
                ((scheduleTargetChange) this.mViewManager).setLargeTitleBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\n':
                scheduleTargetChange scheduletargetchange3 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i9 = values + 99;
                    HaptikSDK$b = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    booleanValue = ((Boolean) obj).booleanValue();
                }
                scheduletargetchange3.setBackButtonInCustomView(t, booleanValue);
                return;
            case 11:
                scheduleTargetChange scheduletargetchange4 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i11 = HaptikSDK$b + 3;
                    values = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    r11 = (String) obj;
                }
                scheduletargetchange4.setLargeTitleFontFamily(t, r11);
                return;
            case '\f':
                ((scheduleTargetChange) this.mViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\r':
                scheduleTargetChange scheduletargetchange5 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i13 = HaptikSDK$b + 87;
                    values = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    r11 = (String) obj;
                }
                scheduletargetchange5.setTitle(t, r11);
                return;
            case 14:
                ((scheduleTargetChange) this.mViewManager).setBackTitleFontSize(t, (obj == null ? (char) 0 : (char) 1) != 0 ? ((Double) obj).intValue() : 0);
                return;
            case 15:
                scheduleTargetChange scheduletargetchange6 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i15 = HaptikSDK$b + 9;
                    values = i15 % 128;
                    if ((i15 % 2 != 0 ? (char) 0 : (char) 1) == 0) {
                        int i16 = 46 / 0;
                    }
                } else {
                    r11 = (String) obj;
                }
                scheduletargetchange6.setBackTitleFontFamily(t, r11);
                return;
            case 16:
                ((scheduleTargetChange) this.mViewManager).setHideShadow(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 17:
                ((scheduleTargetChange) this.mViewManager).setLargeTitleFontWeight(t, obj != null ? (String) obj : null);
                return;
            case 18:
                ((scheduleTargetChange) this.mViewManager).setHideBackButton(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 19:
                ((scheduleTargetChange) this.mViewManager).setBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 20:
                ((scheduleTargetChange) this.mViewManager).setBackTitle(t, (obj == null ? 'G' : (char) 25) == 25 ? (String) obj : null);
                return;
            case 21:
                scheduleTargetChange scheduletargetchange7 = (scheduleTargetChange) this.mViewManager;
                if (obj == null) {
                    int i17 = HaptikSDK$b + 3;
                    values = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    intValue = ((Double) obj).intValue();
                }
                scheduletargetchange7.setTitleFontSize(t, intValue);
                return;
            case 22:
                ((scheduleTargetChange) this.mViewManager).setLargeTitleHideShadow(t, (obj == null ? (char) 20 : (char) 1) != 20 ? ((Boolean) obj).booleanValue() : false);
                return;
            case 23:
                ((scheduleTargetChange) this.mViewManager).setLargeTitle(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 24:
                ((scheduleTargetChange) this.mViewManager).setTopInsetEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }

    private static String toString(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = ag$a;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (valueOf) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}

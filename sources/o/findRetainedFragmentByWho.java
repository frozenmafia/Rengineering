package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.commitNow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class findRetainedFragmentByWho extends FragmentPagerAdapter {
    private static final Pattern HaptikSDK$a = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private double[][] HaptikSDK$d;
    private int HaptikSDK$e;
    private final double[] HaptikWebView;
    private String a;
    private final Matcher ak;
    private final double[] getInitSettings;
    private final boolean getSignupData;
    private boolean isLogoutPending;
    private FragmentPagerAdapter onXdkEvent;

    private static double[] toString(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r27.equals("extend") == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double ag$a(double r16, double r18, double r20, double r22, double r24, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findRetainedFragmentByWho.ag$a(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static double values(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int values = values(d, dArr);
        int i = values + 1;
        return ag$a(d, dArr[values], dArr[i], dArr2[values], dArr2[i], str, str2);
    }

    private static int values(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    public findRetainedFragmentByWho(ReadableMap readableMap) {
        this.HaptikWebView = toString(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        boolean z = array.getType(0) == ReadableType.String;
        this.getSignupData = z;
        if (z) {
            int size = array.size();
            this.getInitSettings = new double[size];
            String string = array.getString(0);
            this.a = string;
            this.isLogoutPending = string.startsWith("rgb");
            this.ak = HaptikSDK$a.matcher(this.a);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                Matcher matcher = HaptikSDK$a.matcher(array.getString(i));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.getInitSettings[i] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.HaptikSDK$e = size2;
            this.HaptikSDK$d = new double[size2];
            for (int i2 = 0; i2 < this.HaptikSDK$e; i2++) {
                double[] dArr = new double[size];
                this.HaptikSDK$d[i2] = dArr;
                for (int i3 = 0; i3 < size; i3++) {
                    dArr[i3] = ((Double) ((ArrayList) arrayList.get(i3)).get(i2)).doubleValue();
                }
            }
        } else {
            this.getInitSettings = toString(array);
            this.ak = null;
        }
        this.HaptikSDK$c = readableMap.getString("extrapolateLeft");
        this.HaptikSDK$b = readableMap.getString("extrapolateRight");
    }

    @Override // o.commitNow.Cdefault
    public void ah$a(commitNow.Cdefault cdefault) {
        if (this.onXdkEvent != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(cdefault instanceof FragmentPagerAdapter)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.onXdkEvent = (FragmentPagerAdapter) cdefault;
    }

    @Override // o.commitNow.Cdefault
    public void values(commitNow.Cdefault cdefault) {
        if (cdefault != this.onXdkEvent) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.onXdkEvent = null;
    }

    @Override // o.commitNow.Cdefault
    public void ah$a() {
        FragmentPagerAdapter fragmentPagerAdapter = this.onXdkEvent;
        if (fragmentPagerAdapter == null) {
            return;
        }
        double HaptikSDK$c = fragmentPagerAdapter.HaptikSDK$c();
        this.ah$b = values(HaptikSDK$c, this.HaptikWebView, this.getInitSettings, this.HaptikSDK$c, this.HaptikSDK$b);
        if (this.getSignupData) {
            if (this.HaptikSDK$e > 1) {
                StringBuffer stringBuffer = new StringBuffer(this.a.length());
                this.ak.reset();
                int i = 0;
                while (this.ak.find()) {
                    int i2 = i + 1;
                    double values = values(HaptikSDK$c, this.HaptikWebView, this.HaptikSDK$d[i], this.HaptikSDK$c, this.HaptikSDK$b);
                    if (this.isLogoutPending) {
                        boolean z = i2 == 4;
                        if (z) {
                            values *= 1000.0d;
                        }
                        int round = (int) Math.round(values);
                        this.ak.appendReplacement(stringBuffer, z ? Double.toString(round / 1000.0d) : Integer.toString(round));
                    } else {
                        int i3 = (int) values;
                        this.ak.appendReplacement(stringBuffer, ((double) i3) != values ? Double.toString(values) : Integer.toString(i3));
                    }
                    i = i2;
                }
                this.ak.appendTail(stringBuffer);
                this.ag$a = stringBuffer.toString();
                return;
            }
            this.ag$a = this.ak.replaceFirst(String.valueOf(this.ah$b));
        }
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        return "InterpolationAnimatedNode[" + this.valueOf + "] super: " + super.values();
    }
}

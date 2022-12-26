package o;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
/* loaded from: classes3.dex */
public class approxLength implements createCheckBox {
    private String HaptikSDK$a;
    private boolean HaptikSDK$b;
    private String HaptikSDK$c;
    private int ah$b;
    double invoke;
    String valueOf;
    double values;
    boolean toString = false;
    String ag$a = "";
    boolean ah$a = false;

    @Override // o.createCheckBox
    public int getRoot() {
        return com.app.dream11Pro.R.layout.res_0x7f0d01c3;
    }

    public String valueOf() {
        return "Winnings_Tab";
    }

    public String ah$a() {
        return this.HaptikSDK$a;
    }

    public void ag$a(String str) {
        this.HaptikSDK$a = str;
    }

    public String values() {
        return this.HaptikSDK$b ? "ComponentLoaded_Winnings" : "ComponentLoaded_ContestDetail";
    }

    public String ag$a() {
        return this.HaptikSDK$b ? "Contest Detail Post Round Lock" : this.HaptikSDK$c;
    }

    public void toString(String str) {
        this.HaptikSDK$c = str;
    }

    public void valueOf(boolean z) {
        this.HaptikSDK$b = z;
    }

    public void toString(int i) {
        this.ah$b = i;
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    public void values(double d) {
        this.values = d;
    }

    public void toString(double d) {
        this.invoke = d;
    }

    public String HaptikSDK$b() {
        return this.valueOf;
    }

    public double ah$b() {
        return this.values;
    }

    public double HaptikSDK$a() {
        return this.invoke;
    }

    public void ah$a(boolean z) {
        this.toString = z;
    }

    public boolean HaptikWebView() {
        return this.toString;
    }

    public String invoke() {
        return this.ag$a;
    }

    public boolean getInitSettings() {
        return (HaptikSDK$b().trim().equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || HaptikSDK$b().trim().equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) || HaptikSDK$b().trim().equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)) && this.ah$a;
    }

    public void ag$a(boolean z) {
        this.ah$a = z;
    }

    public boolean HaptikSDK$c() {
        return this.ah$b == 0 && this.HaptikSDK$b;
    }
}

package com.RNFetchBlob;
/* loaded from: classes6.dex */
public class RNFetchBlobProgressConfig {
    private ReportType HaptikSDK$b;
    private int ah$a;
    private boolean toString;
    private int valueOf;
    private long ag$a = 0;
    private int values = 0;

    /* loaded from: classes6.dex */
    enum ReportType {
        Upload,
        Download
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RNFetchBlobProgressConfig(boolean z, int i, int i2, ReportType reportType) {
        this.ah$a = -1;
        this.valueOf = -1;
        this.toString = false;
        this.HaptikSDK$b = ReportType.Download;
        this.toString = z;
        this.valueOf = i;
        this.HaptikSDK$b = reportType;
        this.ah$a = i2;
    }

    public boolean ag$a(float f) {
        int i = this.ah$a;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.values);
        if (System.currentTimeMillis() - this.ag$a > this.valueOf && this.toString && z2) {
            z = true;
        }
        if (z) {
            this.values++;
            this.ag$a = System.currentTimeMillis();
        }
        return z;
    }
}

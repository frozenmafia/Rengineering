package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import o.addRecyclerListener;
/* loaded from: classes7.dex */
class addItemDecoration implements setAdapterInternal {
    private static final Charset valueOf = Charset.forName("UTF-8");
    private final File ag$a;
    private addRecyclerListener toString;
    private final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public addItemDecoration(File file, int i) {
        this.ag$a = file;
        this.values = i;
    }

    @Override // o.setAdapterInternal
    public void ah$a(long j, String str) {
        ah$b();
        toString(j, str);
    }

    @Override // o.setAdapterInternal
    public byte[] values() {
        addItemDecoration$ag$a HaptikSDK$a = HaptikSDK$a();
        if (HaptikSDK$a == null) {
            return null;
        }
        byte[] bArr = new byte[HaptikSDK$a.ah$a];
        System.arraycopy(HaptikSDK$a.toString, 0, bArr, 0, HaptikSDK$a.ah$a);
        return bArr;
    }

    @Override // o.setAdapterInternal
    public String ag$a() {
        byte[] values = values();
        if (values != null) {
            return new String(values, valueOf);
        }
        return null;
    }

    private addItemDecoration$ag$a HaptikSDK$a() {
        createScroller createscroller;
        if (this.ag$a.exists()) {
            ah$b();
            addRecyclerListener addrecyclerlistener = this.toString;
            if (addrecyclerlistener == null) {
                return null;
            }
            final int[] iArr = {0};
            final byte[] bArr = new byte[addrecyclerlistener.ah$a()];
            try {
                this.toString.ah$a(new addRecyclerListener.valueOf() { // from class: o.addItemDecoration.5
                    @Override // o.addRecyclerListener.valueOf
                    public void toString(InputStream inputStream, int i) throws IOException {
                        try {
                            inputStream.read(bArr, iArr[0], i);
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] + i;
                        } finally {
                            inputStream.close();
                        }
                    }
                });
            } catch (IOException e) {
                createscroller = createScroller.valueOf;
                createscroller.ag$a("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new addItemDecoration$ag$a(bArr, iArr[0]);
        }
        return null;
    }

    @Override // o.setAdapterInternal
    public void ah$a() {
        CommonUtils.valueOf(this.toString, "There was a problem closing the Crashlytics log file.");
        this.toString = null;
    }

    @Override // o.setAdapterInternal
    public void valueOf() {
        ah$a();
        this.ag$a.delete();
    }

    private void ah$b() {
        createScroller createscroller;
        if (this.toString == null) {
            try {
                this.toString = new addRecyclerListener(this.ag$a);
            } catch (IOException e) {
                createscroller = createScroller.valueOf;
                createscroller.ag$a("Could not open log file: " + this.ag$a, e);
            }
        }
    }

    private void toString(long j, String str) {
        createScroller createscroller;
        int i;
        if (this.toString == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.values / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.toString.valueOf(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", com.dreampay.commons.constants.Constants.WHITE_SPACE).replaceAll("\n", com.dreampay.commons.constants.Constants.WHITE_SPACE)).getBytes(valueOf));
            while (!this.toString.ag$a() && this.toString.ah$a() > this.values) {
                this.toString.valueOf();
            }
        } catch (IOException e) {
            createscroller = createScroller.valueOf;
            createscroller.ag$a("There was a problem writing to the Crashlytics log.", e);
        }
    }
}

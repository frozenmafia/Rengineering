package o;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes4.dex */
public class InputContentInfoCompat {
    public String HaptikSDK$a;
    public String ag$a;
    public String ah$a;
    public String toString;
    public String valueOf;
    public int values;

    /* loaded from: classes4.dex */
    public interface InputContentInfoCompatApi25Impl {
        void ag$a();

        boolean ah$a();

        boolean valueOf();

        boolean values();
    }

    /* loaded from: classes6.dex */
    public interface InputContentInfoCompatBaseImpl {
    }

    /* loaded from: classes4.dex */
    public interface InputContentInfoCompatImpl {
        boolean values();
    }

    public InputContentInfoCompat(String str) {
        this.valueOf = null;
        this.values = 20;
        this.toString = "https://cws.conviva.com";
        this.ag$a = "https://%s.ipv4.cws.conviva.com";
        this.ah$a = "https://%s.ipv6.cws.conviva.com";
        if (str == null || str.isEmpty()) {
            Log.e("CONVIVA : ", "SDK NOT ready due to lack of customerKey");
        } else {
            this.valueOf = str;
        }
    }

    public InputContentInfoCompat(InputContentInfoCompat inputContentInfoCompat) {
        this(inputContentInfoCompat.valueOf);
        this.toString = inputContentInfoCompat.toString;
        this.values = inputContentInfoCompat.values;
        ah$a();
    }

    public boolean values() {
        return this.valueOf != null;
    }

    private void ah$a() {
        int i = this.values;
        this.values = 20;
        int values = setCheckMarkTintMode.values(i);
        if (values == i) {
            this.values = values;
        }
        String str = this.toString;
        this.toString = "https://" + this.valueOf + ".cws.conviva.com";
        this.ag$a = String.format("https://%s.ipv4.cws.conviva.com", this.valueOf);
        this.ah$a = String.format("https://%s.ipv6.cws.conviva.com", this.valueOf);
        if (setCheckMarkTintMode.ah$a(str)) {
            try {
                if (!new URL("https://cws.conviva.com").getHost().equals(new URL(str).getHost())) {
                    this.toString = str;
                }
                if (new URL(str).getHost().endsWith("testonly.conviva.com")) {
                    this.ag$a = String.format("https://%s.ipv4.testonly.conviva.com", this.valueOf);
                    this.ah$a = String.format("https://%s.ipv6.testonly.conviva.com", this.valueOf);
                }
            } catch (MalformedURLException e) {
                Log.d("CONVIVA", "sanitize: " + e.getLocalizedMessage());
            }
        }
    }
}

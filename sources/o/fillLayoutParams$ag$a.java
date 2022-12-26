package o;

import java.net.URL;
import o.PercentRelativeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class fillLayoutParams$ag$a {
    final String ag$a;
    final PercentRelativeLayout.LayoutParams ah$a;
    final URL valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fillLayoutParams$ag$a(URL url, PercentRelativeLayout.LayoutParams layoutParams, String str) {
        this.valueOf = url;
        this.ah$a = layoutParams;
        this.ag$a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fillLayoutParams$ag$a valueOf(URL url) {
        return new fillLayoutParams$ag$a(url, this.ah$a, this.ag$a);
    }
}

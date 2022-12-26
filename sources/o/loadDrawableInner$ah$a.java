package o;

import android.os.Bundle;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class loadDrawableInner$ah$a implements getColorFilter {
    public static final loadDrawableInner$ah$a toString = new loadDrawableInner$ah$a$ah$a().ag$a();
    public static final getColorFilter$ah$a<loadDrawableInner$ah$a> values = getUriInputStream.ah$a;
    private final onAuthenticationError valueOf;

    private loadDrawableInner$ah$a(onAuthenticationError onauthenticationerror) {
        this.valueOf = onauthenticationerror;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof loadDrawableInner$ah$a) {
            return this.valueOf.equals(((loadDrawableInner$ah$a) obj).valueOf);
        }
        return false;
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.valueOf.valueOf(); i++) {
            arrayList.add(Integer.valueOf(this.valueOf.ag$a(i)));
        }
        bundle.putIntegerArrayList(valueOf(0), arrayList);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static loadDrawableInner$ah$a ag$a(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(valueOf(0));
        if (integerArrayList == null) {
            return toString;
        }
        loadDrawableInner$ah$a$ah$a loaddrawableinner_ah_a_ah_a = new loadDrawableInner$ah$a$ah$a();
        for (int i = 0; i < integerArrayList.size(); i++) {
            loaddrawableinner_ah_a_ah_a.values(integerArrayList.get(i).intValue());
        }
        return loaddrawableinner_ah_a_ah_a.ag$a();
    }

    private static String valueOf(int i) {
        return Integer.toString(i, 36);
    }
}

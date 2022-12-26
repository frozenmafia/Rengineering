package o;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class isCompatTintEnabled implements getColorFilter {
    public final int HaptikSDK$a;
    public final int HaptikSDK$b;
    public final float HaptikSDK$c;
    public final CharSequence HaptikSDK$d;
    public final Layout.Alignment HaptikSDK$e;
    public final float HaptikWebView;
    public final int a;
    public final Bitmap ag$a;
    public final Layout.Alignment ah$b;
    public final int aj$a;
    public final float getInitSettings;
    public final float getSignupData;
    public final int invoke;
    public final boolean isLogoutPending;
    public final int onXdkEvent;
    public final float toString;
    public final float valueOf;
    public static final isCompatTintEnabled values = new isCompatTintEnabled$ah$a().ah$a("").values();
    public static final getColorFilter$ah$a<isCompatTintEnabled> ah$a = updateTint.valueOf;

    private isCompatTintEnabled(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            FingerprintManagerCompat.toString(bitmap);
        } else {
            FingerprintManagerCompat.toString(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.HaptikSDK$d = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.HaptikSDK$d = charSequence.toString();
        } else {
            this.HaptikSDK$d = null;
        }
        this.HaptikSDK$e = alignment;
        this.ah$b = alignment2;
        this.ag$a = bitmap;
        this.valueOf = f;
        this.HaptikSDK$b = i;
        this.HaptikSDK$a = i2;
        this.HaptikSDK$c = f2;
        this.invoke = i3;
        this.HaptikWebView = f4;
        this.toString = f5;
        this.isLogoutPending = z;
        this.aj$a = i5;
        this.a = i4;
        this.getInitSettings = f3;
        this.onXdkEvent = i6;
        this.getSignupData = f6;
    }

    public isCompatTintEnabled$ah$a ag$a() {
        return new isCompatTintEnabled$ah$a(this);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isCompatTintEnabled iscompattintenabled = (isCompatTintEnabled) obj;
        return TextUtils.equals(this.HaptikSDK$d, iscompattintenabled.HaptikSDK$d) && this.HaptikSDK$e == iscompattintenabled.HaptikSDK$e && this.ah$b == iscompattintenabled.ah$b && ((bitmap = this.ag$a) != null ? !((bitmap2 = iscompattintenabled.ag$a) == null || !bitmap.sameAs(bitmap2)) : iscompattintenabled.ag$a == null) && this.valueOf == iscompattintenabled.valueOf && this.HaptikSDK$b == iscompattintenabled.HaptikSDK$b && this.HaptikSDK$a == iscompattintenabled.HaptikSDK$a && this.HaptikSDK$c == iscompattintenabled.HaptikSDK$c && this.invoke == iscompattintenabled.invoke && this.HaptikWebView == iscompattintenabled.HaptikWebView && this.toString == iscompattintenabled.toString && this.isLogoutPending == iscompattintenabled.isLogoutPending && this.aj$a == iscompattintenabled.aj$a && this.a == iscompattintenabled.a && this.getInitSettings == iscompattintenabled.getInitSettings && this.onXdkEvent == iscompattintenabled.onXdkEvent && this.getSignupData == iscompattintenabled.getSignupData;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.HaptikSDK$d, this.HaptikSDK$e, this.ah$b, this.ag$a, Float.valueOf(this.valueOf), Integer.valueOf(this.HaptikSDK$b), Integer.valueOf(this.HaptikSDK$a), Float.valueOf(this.HaptikSDK$c), Integer.valueOf(this.invoke), Float.valueOf(this.HaptikWebView), Float.valueOf(this.toString), Boolean.valueOf(this.isLogoutPending), Integer.valueOf(this.aj$a), Integer.valueOf(this.a), Float.valueOf(this.getInitSettings), Integer.valueOf(this.onXdkEvent), Float.valueOf(this.getSignupData));
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(values(0), this.HaptikSDK$d);
        bundle.putSerializable(values(1), this.HaptikSDK$e);
        bundle.putSerializable(values(2), this.ah$b);
        bundle.putParcelable(values(3), this.ag$a);
        bundle.putFloat(values(4), this.valueOf);
        bundle.putInt(values(5), this.HaptikSDK$b);
        bundle.putInt(values(6), this.HaptikSDK$a);
        bundle.putFloat(values(7), this.HaptikSDK$c);
        bundle.putInt(values(8), this.invoke);
        bundle.putInt(values(9), this.a);
        bundle.putFloat(values(10), this.getInitSettings);
        bundle.putFloat(values(11), this.HaptikWebView);
        bundle.putFloat(values(12), this.toString);
        bundle.putBoolean(values(14), this.isLogoutPending);
        bundle.putInt(values(13), this.aj$a);
        bundle.putInt(values(15), this.onXdkEvent);
        bundle.putFloat(values(16), this.getSignupData);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isCompatTintEnabled values(Bundle bundle) {
        isCompatTintEnabled$ah$a iscompattintenabled_ah_a = new isCompatTintEnabled$ah$a();
        CharSequence charSequence = bundle.getCharSequence(values(0));
        if (charSequence != null) {
            iscompattintenabled_ah_a.ah$a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(values(1));
        if (alignment != null) {
            iscompattintenabled_ah_a.toString(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(values(2));
        if (alignment2 != null) {
            iscompattintenabled_ah_a.values(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(values(3));
        if (bitmap != null) {
            iscompattintenabled_ah_a.values(bitmap);
        }
        if (bundle.containsKey(values(4)) && bundle.containsKey(values(5))) {
            iscompattintenabled_ah_a.toString(bundle.getFloat(values(4)), bundle.getInt(values(5)));
        }
        if (bundle.containsKey(values(6))) {
            iscompattintenabled_ah_a.valueOf(bundle.getInt(values(6)));
        }
        if (bundle.containsKey(values(7))) {
            iscompattintenabled_ah_a.toString(bundle.getFloat(values(7)));
        }
        if (bundle.containsKey(values(8))) {
            iscompattintenabled_ah_a.toString(bundle.getInt(values(8)));
        }
        if (bundle.containsKey(values(10)) && bundle.containsKey(values(9))) {
            iscompattintenabled_ah_a.values(bundle.getFloat(values(10)), bundle.getInt(values(9)));
        }
        if (bundle.containsKey(values(11))) {
            iscompattintenabled_ah_a.ag$a(bundle.getFloat(values(11)));
        }
        if (bundle.containsKey(values(12))) {
            iscompattintenabled_ah_a.ah$a(bundle.getFloat(values(12)));
        }
        if (bundle.containsKey(values(13))) {
            iscompattintenabled_ah_a.ah$a(bundle.getInt(values(13)));
        }
        if (!bundle.getBoolean(values(14), false)) {
            iscompattintenabled_ah_a.ah$a();
        }
        if (bundle.containsKey(values(15))) {
            iscompattintenabled_ah_a.values(bundle.getInt(values(15)));
        }
        if (bundle.containsKey(values(16))) {
            iscompattintenabled_ah_a.values(bundle.getFloat(values(16)));
        }
        return iscompattintenabled_ah_a.values();
    }

    private static String values(int i) {
        return Integer.toString(i, 36);
    }
}

package o;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import org.apache.http.HttpHost;
/* renamed from: o.$default$onStart  reason: invalid class name */
/* loaded from: classes4.dex */
public class C$default$onStart {
    public static void valueOf(String str, ImageView imageView) {
        try {
            Glide.valueOf(imageView.getContext()).valueOf(str).ag$a(imageView);
        } catch (Exception unused) {
        }
    }

    public static void values(ImageView imageView, String str) {
        if (imageView.getContext() == null || str == null || str.isEmpty()) {
            return;
        }
        Glide.valueOf(imageView.getContext()).toString(imageView);
        if (str.contains(HttpHost.DEFAULT_SCHEME_NAME) || str.startsWith("android.resource://")) {
            valueOf(str, imageView);
        }
    }
}

package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Toast;
/* loaded from: classes6.dex */
public final class access$getDispatchQueue$p {
    public static final void values(Context context, String str) {
        runAnimators.ag$a(context, "<this>");
        runAnimators.ag$a(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        Toast.makeText(context, str, 0).show();
    }

    public static final void valueOf(Context context, int i) {
        runAnimators.ag$a(context, "<this>");
        Toast.makeText(context, i, 0).show();
    }

    public static final void ag$a(Context context, int i) {
        runAnimators.ag$a(context, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(context.getString(i)));
        context.startActivity(intent);
    }

    public static final void ag$a(View view, long j) {
        runAnimators.ag$a(view, "<this>");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }
}

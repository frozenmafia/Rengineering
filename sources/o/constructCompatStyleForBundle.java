package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public final class constructCompatStyleForBundle {
    @androidx.databinding.BindingAdapter({"currentReaction"})
    public static final void values(ImageView imageView, setAlarmClock setalarmclock) {
        runAnimators.ag$a(imageView, "image");
        if (setalarmclock == null) {
            return;
        }
        Context context = imageView.getContext();
        runAnimators.ah$a(context, "image.context");
        Drawable alarmManagerCompat = AlarmManagerCompat.toString(setalarmclock, context);
        createPopup.toString(imageView, setalarmclock.HaptikSDK$a(), alarmManagerCompat, alarmManagerCompat, false, "", "");
    }
}

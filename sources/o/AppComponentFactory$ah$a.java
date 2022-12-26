package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.app.dream11.reaction.models.ReactionsConfig$ReactionsConfigBuilder$reactionTextProvider$1;
import com.sendbird.android.constant.StringSet;
import java.util.List;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppComponentFactory$ah$a {
    private int HaptikSDK$a;
    private Drawable HaptikSDK$b;
    private Styleable.ChangeBounds<? super Integer, ? extends CharSequence> HaptikSDK$c;
    private int HaptikSDK$d;
    private float HaptikSDK$e;
    private boolean ag$a;
    private int ah$a;
    private final List<setAlarmClock> ah$b;
    private int getInitSettings;
    private int getSignupData;
    private boolean invoke;
    private final Context toString;
    private int valueOf;
    private int values;

    public AppComponentFactory$ah$a(Context context, List<setAlarmClock> list) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(list, StringSet.reactions);
        this.toString = context;
        this.ah$b = list;
        this.values = context.getResources().getDimensionPixelSize(com.app.dream11Pro.R.dimen.res_0x7f070513);
        this.ah$a = context.getResources().getDimensionPixelSize(com.app.dream11Pro.R.dimen.res_0x7f070511);
        this.getInitSettings = context.getResources().getDimensionPixelSize(com.app.dream11Pro.R.dimen.res_0x7f070512);
        this.valueOf = -1;
        this.HaptikSDK$c = new ReactionsConfig$ReactionsConfigBuilder$reactionTextProvider$1(this);
        this.HaptikSDK$a = -1;
        this.invoke = true;
    }

    public final Context valueOf() {
        return this.toString;
    }

    public final void values(int i) {
        this.values = i;
    }

    public final void valueOf(int i) {
        this.ah$a = i;
    }

    public final void ag$a(int i) {
        this.getInitSettings = i;
    }

    public final void toString(boolean z) {
        this.ag$a = z;
    }

    public final void values(boolean z) {
        this.invoke = z;
    }

    public final AppComponentFactory values() {
        int intValue;
        int intValue2;
        float floatValue;
        List<setAlarmClock> list = this.ah$b;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            throw new IllegalArgumentException("Empty reactions");
        }
        int i = this.valueOf;
        int i2 = this.values;
        int i3 = this.ah$a;
        int i4 = this.getInitSettings;
        Styleable.ChangeBounds<? super Integer, ? extends CharSequence> changeBounds = this.HaptikSDK$c;
        Drawable drawable = this.HaptikSDK$b;
        if (drawable == null) {
            drawable = androidx.core.content.ContextCompat.getDrawable(this.toString, com.app.dream11Pro.R.drawable.reaction_text_background);
            runAnimators.toString(drawable);
            runAnimators.ah$a(drawable, "getDrawable(context,\n   …action_text_background)!!");
        }
        Drawable drawable2 = drawable;
        int i5 = this.HaptikSDK$a;
        Integer valueOf = Integer.valueOf(this.HaptikSDK$d);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            intValue = loadTransition.values(this.toString.getResources().getDimension(com.app.dream11Pro.R.dimen.res_0x7f070514));
        }
        int i6 = intValue;
        Integer valueOf2 = Integer.valueOf(this.getSignupData);
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            intValue2 = valueOf2.intValue();
        } else {
            intValue2 = loadTransition.values(this.toString.getResources().getDimension(com.app.dream11Pro.R.dimen.res_0x7f070516));
        }
        int i7 = intValue2;
        boolean z = this.ag$a;
        Float valueOf3 = Float.valueOf(this.HaptikSDK$e);
        Float f = true ^ (valueOf3.floatValue() == 0.0f) ? valueOf3 : null;
        if (f != null) {
            floatValue = f.floatValue();
        } else {
            floatValue = this.toString.getResources().getDimension(com.app.dream11Pro.R.dimen.res_0x7f070515);
        }
        return new AppComponentFactory(list, i2, i3, i4, i, changeBounds, drawable2, i5, i6, i7, z, floatValue, this.invoke);
    }
}

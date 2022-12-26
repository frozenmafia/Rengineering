package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class createFwkMediaSession {
    private getVolumeControl toString;
    private final AssetManager valueOf;
    private final MediaSessionCompat.MediaSessionImplApi29<String> HaptikSDK$c = new MediaSessionCompat.MediaSessionImplApi29<>();
    private final Map<MediaSessionCompat.MediaSessionImplApi29<String>, Typeface> ag$a = new HashMap();
    private final Map<String, Typeface> ah$a = new HashMap();
    private String values = ".ttf";

    public createFwkMediaSession(Drawable.Callback callback, getVolumeControl getvolumecontrol) {
        this.toString = getvolumecontrol;
        if (!(callback instanceof View)) {
            ResultReceiver.valueOf.toString("LottieDrawable must be inside of a view for images to work.");
            this.valueOf = null;
            return;
        }
        this.valueOf = ((View) callback).getContext().getAssets();
    }

    public void toString(getVolumeControl getvolumecontrol) {
        this.toString = getvolumecontrol;
    }

    public Typeface values(String str, String str2) {
        this.HaptikSDK$c.ag$a(str, str2);
        Typeface typeface = this.ag$a.get(this.HaptikSDK$c);
        if (typeface != null) {
            return typeface;
        }
        Typeface createfwkmediasession = toString(values(str), str2);
        this.ag$a.put(this.HaptikSDK$c, createfwkmediasession);
        return createfwkmediasession;
    }

    private Typeface values(String str) {
        String valueOf;
        Typeface typeface = this.ah$a.get(str);
        if (typeface != null) {
            return typeface;
        }
        getVolumeControl getvolumecontrol = this.toString;
        Typeface getvolumecontrol2 = getvolumecontrol != null ? getvolumecontrol.toString(str) : null;
        getVolumeControl getvolumecontrol3 = this.toString;
        if (getvolumecontrol3 != null && getvolumecontrol2 == null && (valueOf = getvolumecontrol3.valueOf(str)) != null) {
            getvolumecontrol2 = Typeface.createFromAsset(this.valueOf, valueOf);
        }
        if (getvolumecontrol2 == null) {
            getvolumecontrol2 = Typeface.createFromAsset(this.valueOf, "fonts/" + str + this.values);
        }
        this.ah$a.put(str, getvolumecontrol2);
        return getvolumecontrol2;
    }

    private Typeface toString(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}

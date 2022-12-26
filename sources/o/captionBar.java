package o;

import o.WindowInsetsCompat;
/* loaded from: classes3.dex */
public class captionBar extends WindowInsetsCompat.Impl30<captionBar> {
    private static captionBar ah$a;

    public static captionBar toString(updatePaddingRelative updatepaddingrelative) {
        return new captionBar().ah$a(updatepaddingrelative);
    }

    public static captionBar toString(getDescendants getdescendants) {
        return new captionBar().values(getdescendants);
    }

    public static captionBar onXdkEvent() {
        if (ah$a == null) {
            ah$a = new captionBar().values().ag$a();
        }
        return ah$a;
    }

    public static captionBar toString(Class<?> cls) {
        return new captionBar().ah$a(cls);
    }
}

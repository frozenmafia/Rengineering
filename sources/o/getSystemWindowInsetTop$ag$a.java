package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class getSystemWindowInsetTop$ag$a extends systemGestures<Bitmap> {
    private final long ag$a;
    private final Handler ah$a;
    private Bitmap toString;
    final int values;

    @Override // o.controlWindowInsetsAnimation
    public /* bridge */ /* synthetic */ void toString(Object obj, removeOnControllableInsetsChangedListener removeoncontrollableinsetschangedlistener) {
        toString((Bitmap) obj, (removeOnControllableInsetsChangedListener<? super Bitmap>) removeoncontrollableinsetschangedlistener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getSystemWindowInsetTop$ag$a(Handler handler, int i, long j) {
        this.ah$a = handler;
        this.values = i;
        this.ag$a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap ah$a() {
        return this.toString;
    }

    public void toString(Bitmap bitmap, removeOnControllableInsetsChangedListener<? super Bitmap> removeoncontrollableinsetschangedlistener) {
        this.toString = bitmap;
        this.ah$a.sendMessageAtTime(this.ah$a.obtainMessage(1, this), this.ag$a);
    }

    @Override // o.controlWindowInsetsAnimation
    public void ag$a(Drawable drawable) {
        this.toString = null;
    }
}

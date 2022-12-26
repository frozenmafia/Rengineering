package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class beginDelayedTransition<INFO> extends loadClass implements dumpLoaders<INFO> {
    public void ag$a(int i, int i2) {
    }

    public void onFailure(String str, Throwable th) {
    }

    public void onFinalImageSet(String str, INFO info, android.graphics.drawable.Animatable animatable) {
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // o.dumpLoaders
    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }

    public beginDelayedTransition() {
        super(new values());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.loadClass, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        ag$a(i, 10000);
        return super.onLevelChange(i);
    }

    /* loaded from: classes6.dex */
    static final class values extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        private values() {
        }
    }
}

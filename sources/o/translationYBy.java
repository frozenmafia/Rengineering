package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class translationYBy implements scaleXBy {
    private static final Bitmap.Config ah$a = Bitmap.Config.ARGB_8888;
    private long HaptikSDK$a;
    private final long HaptikSDK$b;
    private int HaptikSDK$c;
    private final values HaptikSDK$d;
    private long ag$a;
    private final translationXBy ah$b;
    private int invoke;
    private final Set<Bitmap.Config> toString;
    private int valueOf;
    private int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface values {
        void ag$a(Bitmap bitmap);

        void ah$a(Bitmap bitmap);
    }

    translationYBy(long j, translationXBy translationxby, Set<Bitmap.Config> set) {
        this.HaptikSDK$b = j;
        this.HaptikSDK$a = j;
        this.ah$b = translationxby;
        this.toString = set;
        this.HaptikSDK$d = new valueOf();
    }

    public translationYBy(long j) {
        this(j, HaptikSDK$c(), ah$b());
    }

    public long values() {
        return this.HaptikSDK$a;
    }

    @Override // o.scaleXBy
    public void values(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.ah$b.toString(bitmap) <= this.HaptikSDK$a && this.toString.contains(bitmap.getConfig())) {
                int translationxby = this.ah$b.toString(bitmap);
                this.ah$b.ah$a(bitmap);
                this.HaptikSDK$d.ag$a(bitmap);
                this.HaptikSDK$c++;
                this.ag$a += translationxby;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.ah$b.ag$a(bitmap));
                }
                ag$a();
                HaptikSDK$b();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.ah$b.ag$a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.toString.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        }
    }

    private void HaptikSDK$b() {
        ah$a(this.HaptikSDK$a);
    }

    @Override // o.scaleXBy
    public Bitmap toString(int i, int i2, Bitmap.Config config) {
        Bitmap values2 = values(i, i2, config);
        if (values2 != null) {
            values2.eraseColor(0);
            return values2;
        }
        return ah$a(i, i2, config);
    }

    @Override // o.scaleXBy
    public Bitmap valueOf(int i, int i2, Bitmap.Config config) {
        Bitmap values2 = values(i, i2, config);
        return values2 == null ? ah$a(i, i2, config) : values2;
    }

    private static Bitmap ah$a(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = ah$a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private static void toString(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private Bitmap values(int i, int i2, Bitmap.Config config) {
        Bitmap translationxby;
        synchronized (this) {
            toString(config);
            translationxby = this.ah$b.toString(i, i2, config != null ? config : ah$a);
            if (translationxby == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.ah$b.valueOf(i, i2, config));
                }
                this.invoke++;
            } else {
                this.values++;
                this.ag$a -= this.ah$b.toString(translationxby);
                this.HaptikSDK$d.ah$a(translationxby);
                valueOf(translationxby);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.ah$b.valueOf(i, i2, config));
            }
            ag$a();
        }
        return translationxby;
    }

    private static void valueOf(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        toString(bitmap);
    }

    private static void toString(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    @Override // o.scaleXBy
    public void ah$a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        ah$a(0L);
    }

    @Override // o.scaleXBy
    public void values(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            ah$a();
        } else if (i >= 20 || i == 15) {
            ah$a(values() / 2);
        }
    }

    private void ah$a(long j) {
        synchronized (this) {
            while (this.ag$a > j) {
                Bitmap ah$a2 = this.ah$b.ah$a();
                if (ah$a2 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        valueOf();
                    }
                    this.ag$a = 0L;
                    return;
                }
                this.HaptikSDK$d.ah$a(ah$a2);
                this.ag$a -= this.ah$b.toString(ah$a2);
                this.valueOf++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.ah$b.ag$a(ah$a2));
                }
                ag$a();
                ah$a2.recycle();
            }
        }
    }

    private void ag$a() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            valueOf();
        }
    }

    private void valueOf() {
        Log.v("LruBitmapPool", "Hits=" + this.values + ", misses=" + this.invoke + ", puts=" + this.HaptikSDK$c + ", evictions=" + this.valueOf + ", currentSize=" + this.ag$a + ", maxSize=" + this.HaptikSDK$a + "\nStrategy=" + this.ah$b);
    }

    private static translationXBy HaptikSDK$c() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new withStartAction();
        }
        return new setStartDelay();
    }

    private static Set<Bitmap.Config> ah$b() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* loaded from: classes3.dex */
    static final class valueOf implements values {
        @Override // o.translationYBy.values
        public void ag$a(Bitmap bitmap) {
        }

        @Override // o.translationYBy.values
        public void ah$a(Bitmap bitmap) {
        }

        valueOf() {
        }
    }
}

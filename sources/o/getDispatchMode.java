package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import o.WindowInsetsAnimationCompat;
import o.getUpperBound;
/* loaded from: classes3.dex */
public class getDispatchMode<Data> implements getUpperBound<Integer, Data> {
    private final getUpperBound<Uri, Data> ag$a;
    private final Resources toString;

    @Override // o.getUpperBound
    public boolean toString(Integer num) {
        return true;
    }

    public getDispatchMode(Resources resources, getUpperBound<Uri, Data> getupperbound) {
        this.toString = resources;
        this.ag$a = getupperbound;
    }

    @Override // o.getUpperBound
    /* renamed from: toString */
    public getUpperBound.valueOf<Data> ah$a(Integer num, int i, int i2, setMargins setmargins) {
        Uri ah$a = ah$a(num);
        if (ah$a == null) {
            return null;
        }
        return this.ag$a.ah$a(ah$a, i, i2, setmargins);
    }

    private Uri ah$a(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.toString.getResourcePackageName(num.intValue()) + '/' + this.toString.getResourceTypeName(num.intValue()) + '/' + this.toString.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class toString implements toBounds<Integer, ParcelFileDescriptor> {
        private final Resources values;

        @Override // o.toBounds
        public void ag$a() {
        }

        public toString(Resources resources) {
            this.values = resources;
        }

        @Override // o.toBounds
        public getUpperBound<Integer, ParcelFileDescriptor> ag$a(WindowInsetsAnimationCompat.Impl impl) {
            return new getDispatchMode(this.values, impl.ag$a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes3.dex */
    public static final class values implements toBounds<Integer, AssetFileDescriptor> {
        private final Resources toString;

        @Override // o.toBounds
        public void ag$a() {
        }

        public values(Resources resources) {
            this.toString = resources;
        }

        @Override // o.toBounds
        public getUpperBound<Integer, AssetFileDescriptor> ag$a(WindowInsetsAnimationCompat.Impl impl) {
            return new getDispatchMode(this.toString, impl.ag$a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes3.dex */
    public static class valueOf implements toBounds<Integer, Uri> {
        private final Resources values;

        @Override // o.toBounds
        public void ag$a() {
        }

        public valueOf(Resources resources) {
            this.values = resources;
        }

        @Override // o.toBounds
        public getUpperBound<Integer, Uri> ag$a(WindowInsetsAnimationCompat.Impl impl) {
            return new getDispatchMode(this.values, buildAnimationMask.values());
        }
    }
}

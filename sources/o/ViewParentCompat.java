package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.WindowInsetsControllerCompat;
import o.updatePaddingRelative;
/* loaded from: classes3.dex */
public class ViewParentCompat<Data, ResourceType, Transcode> {
    private final Class<Data> ag$a;
    private final List<? extends updatePaddingRelative.Cdefault<Data, ResourceType, Transcode>> ah$a;
    private final Pools.Pool<List<Throwable>> valueOf;
    private final String values;

    public ViewParentCompat(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<updatePaddingRelative.Cdefault<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.ag$a = cls;
        this.valueOf = pool;
        this.ah$a = (List) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(list);
        this.values = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public ViewKt$postDelayed$runnable$1<Transcode> ah$a(doOnDetach<Data> doondetach, setMargins setmargins, int i, int i2, updatePaddingRelative$default$ag$a<ResourceType> updatepaddingrelative_default_ag_a) throws GlideException {
        List<Throwable> list = (List) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(this.valueOf.acquire());
        try {
            return toString(doondetach, setmargins, i, i2, updatepaddingrelative_default_ag_a, list);
        } finally {
            this.valueOf.release(list);
        }
    }

    private ViewKt$postDelayed$runnable$1<Transcode> toString(doOnDetach<Data> doondetach, setMargins setmargins, int i, int i2, updatePaddingRelative$default$ag$a<ResourceType> updatepaddingrelative_default_ag_a, List<Throwable> list) throws GlideException {
        int size = this.ah$a.size();
        ViewKt$postDelayed$runnable$1<Transcode> viewKt$postDelayed$runnable$1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                viewKt$postDelayed$runnable$1 = this.ah$a.get(i3).ag$a(doondetach, i, i2, setmargins, updatepaddingrelative_default_ag_a);
            } catch (GlideException e) {
                list.add(e);
            }
            if (viewKt$postDelayed$runnable$1 != null) {
                break;
            }
        }
        if (viewKt$postDelayed$runnable$1 != null) {
            return viewKt$postDelayed$runnable$1;
        }
        throw new GlideException(this.values, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.ah$a.toArray()) + '}';
    }
}

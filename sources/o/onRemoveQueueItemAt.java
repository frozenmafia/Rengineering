package o;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class onRemoveQueueItemAt implements onRemoveQueueItem, onRewind {
    private final String toString;
    private final MergePaths valueOf;
    private final Path ag$a = new Path();
    private final Path HaptikSDK$c = new Path();
    private final Path ah$a = new Path();
    private final List<onRemoveQueueItem> values = new ArrayList();

    public onRemoveQueueItemAt(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.toString = mergePaths.valueOf();
        this.valueOf = mergePaths;
    }

    @Override // o.onRewind
    public void valueOf(ListIterator<onPlay> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            onPlay previous = listIterator.previous();
            if (previous instanceof onRemoveQueueItem) {
                this.values.add((onRemoveQueueItem) previous);
                listIterator.remove();
            }
        }
    }

    @Override // o.onPlay
    public void valueOf(List<onPlay> list, List<onPlay> list2) {
        for (int i = 0; i < this.values.size(); i++) {
            this.values.get(i).valueOf(list, list2);
        }
    }

    @Override // o.onRemoveQueueItem
    public Path values() {
        this.ah$a.reset();
        if (this.valueOf.ag$a()) {
            return this.ah$a;
        }
        int i = AnonymousClass3.toString[this.valueOf.ah$a().ordinal()];
        if (i == 1) {
            ag$a();
        } else if (i == 2) {
            values(Path.Op.UNION);
        } else if (i == 3) {
            values(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            values(Path.Op.INTERSECT);
        } else if (i == 5) {
            values(Path.Op.XOR);
        }
        return this.ah$a;
    }

    /* renamed from: o.onRemoveQueueItemAt$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            toString = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                toString[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.onPlay
    public String valueOf() {
        return this.toString;
    }

    private void ag$a() {
        for (int i = 0; i < this.values.size(); i++) {
            this.ah$a.addPath(this.values.get(i).values());
        }
    }

    private void values(Path.Op op) {
        this.HaptikSDK$c.reset();
        this.ag$a.reset();
        for (int size = this.values.size() - 1; size >= 1; size--) {
            onRemoveQueueItem onremovequeueitem = this.values.get(size);
            if (onremovequeueitem instanceof onPlayFromUri) {
                onPlayFromUri onplayfromuri = (onPlayFromUri) onremovequeueitem;
                List<onRemoveQueueItem> ag$a = onplayfromuri.ag$a();
                for (int size2 = ag$a.size() - 1; size2 >= 0; size2--) {
                    Path values = ag$a.get(size2).values();
                    values.transform(onplayfromuri.invoke());
                    this.HaptikSDK$c.addPath(values);
                }
            } else {
                this.HaptikSDK$c.addPath(onremovequeueitem.values());
            }
        }
        onRemoveQueueItem onremovequeueitem2 = this.values.get(0);
        if (onremovequeueitem2 instanceof onPlayFromUri) {
            onPlayFromUri onplayfromuri2 = (onPlayFromUri) onremovequeueitem2;
            List<onRemoveQueueItem> ag$a2 = onplayfromuri2.ag$a();
            for (int i = 0; i < ag$a2.size(); i++) {
                Path values2 = ag$a2.get(i).values();
                values2.transform(onplayfromuri2.invoke());
                this.ag$a.addPath(values2);
            }
        } else {
            this.ag$a.set(onremovequeueitem2.values());
        }
        this.ah$a.op(this.ag$a, this.HaptikSDK$c, op);
    }
}

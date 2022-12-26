package o;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class setRccState {
    private final List<onSkipToPrevious<getQueueItem, Path>> ag$a;
    private final List<onSkipToPrevious<Integer, Integer>> toString;
    private final List<Mask> valueOf;

    public setRccState(List<Mask> list) {
        this.valueOf = list;
        this.ag$a = new ArrayList(list.size());
        this.toString = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.ag$a.add(list.get(i).ah$a().valueOf());
            this.toString.add(list.get(i).valueOf().valueOf());
        }
    }

    public List<Mask> valueOf() {
        return this.valueOf;
    }

    public List<onSkipToPrevious<getQueueItem, Path>> values() {
        return this.ag$a;
    }

    public List<onSkipToPrevious<Integer, Integer>> ah$a() {
        return this.toString;
    }
}

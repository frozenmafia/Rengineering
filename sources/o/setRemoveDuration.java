package o;

import java.util.Map;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class setRemoveDuration<T> {
    private detachViewAt ag$a;
    private setRemoveDuration<T> ah$a;
    private onAnimationsFinished<T> toString;

    /* loaded from: classes5.dex */
    public interface toString<T> {
        void valueOf(setRemoveDuration<T> setremoveduration);
    }

    public setRemoveDuration(detachViewAt detachviewat, setRemoveDuration<T> setremoveduration, onAnimationsFinished<T> onanimationsfinished) {
        this.ag$a = detachviewat;
        this.ah$a = setremoveduration;
        this.toString = onanimationsfinished;
    }

    public setRemoveDuration() {
        this(null, null, new onAnimationsFinished());
    }

    public setRemoveDuration<T> toString(bindViewHolder bindviewholder) {
        detachViewAt ah$a = bindviewholder.ah$a();
        setRemoveDuration<T> setremoveduration = this;
        while (ah$a != null) {
            setRemoveDuration<T> setremoveduration2 = new setRemoveDuration<>(ah$a, setremoveduration, setremoveduration.toString.valueOf.containsKey(ah$a) ? setremoveduration.toString.valueOf.get(ah$a) : new onAnimationsFinished<>());
            bindviewholder = bindviewholder.HaptikSDK$c();
            ah$a = bindviewholder.ah$a();
            setremoveduration = setremoveduration2;
        }
        return setremoveduration;
    }

    public T ah$a() {
        return this.toString.values;
    }

    public void toString(T t) {
        this.toString.values = t;
        HaptikSDK$c();
    }

    public bindViewHolder values() {
        if (this.ah$a != null) {
            RecyclerView.ItemAnimator.AdapterChanges.ah$a(this.ag$a != null);
            return this.ah$a.values().valueOf(this.ag$a);
        }
        detachViewAt detachviewat = this.ag$a;
        return detachviewat != null ? new bindViewHolder(detachviewat) : bindViewHolder.ag$a();
    }

    public boolean valueOf() {
        return !this.toString.valueOf.isEmpty();
    }

    public boolean ag$a() {
        return this.toString.values == null && this.toString.valueOf.isEmpty();
    }

    public void valueOf(toString<T> tostring) {
        valueOf(tostring, false, false);
    }

    public void valueOf(final toString<T> tostring, boolean z, final boolean z2) {
        if (z && !z2) {
            tostring.valueOf(this);
        }
        ag$a(new toString<T>() { // from class: o.setRemoveDuration.5
            @Override // o.setRemoveDuration.toString
            public void valueOf(setRemoveDuration<T> setremoveduration) {
                setremoveduration.valueOf(tostring, true, z2);
            }
        });
        if (z && z2) {
            tostring.valueOf(this);
        }
    }

    public boolean ah$a(setRemoveDuration$ag$a<T> setremoveduration_ag_a) {
        return toString(setremoveduration_ag_a, false);
    }

    public boolean toString(setRemoveDuration$ag$a<T> setremoveduration_ag_a, boolean z) {
        for (setRemoveDuration<T> setremoveduration = z ? this : this.ah$a; setremoveduration != null; setremoveduration = setremoveduration.ah$a) {
            if (setremoveduration_ag_a.valueOf(setremoveduration)) {
                return true;
            }
        }
        return false;
    }

    public void ag$a(toString<T> tostring) {
        for (Object obj : this.toString.valueOf.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            tostring.valueOf(new setRemoveDuration<>((detachViewAt) entry.getKey(), this, (onAnimationsFinished) entry.getValue()));
        }
    }

    private void HaptikSDK$c() {
        setRemoveDuration<T> setremoveduration = this.ah$a;
        if (setremoveduration != null) {
            setremoveduration.valueOf(this.ag$a, this);
        }
    }

    private void valueOf(detachViewAt detachviewat, setRemoveDuration<T> setremoveduration) {
        boolean ag$a = setremoveduration.ag$a();
        boolean containsKey = this.toString.valueOf.containsKey(detachviewat);
        if (ag$a && containsKey) {
            this.toString.valueOf.remove(detachviewat);
            HaptikSDK$c();
        } else if (ag$a || containsKey) {
        } else {
            this.toString.valueOf.put(detachviewat, setremoveduration.toString);
            HaptikSDK$c();
        }
    }

    public String toString() {
        return ah$a("");
    }

    String ah$a(String str) {
        detachViewAt detachviewat = this.ag$a;
        String valueOf = detachviewat == null ? "<anon>" : detachviewat.valueOf();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(valueOf);
        sb.append("\n");
        onAnimationsFinished<T> onanimationsfinished = this.toString;
        sb.append(onanimationsfinished.toString(str + "\t"));
        return sb.toString();
    }
}

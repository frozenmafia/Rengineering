package o;

import com.sendbird.android.constant.StringSet;
import java.util.Arrays;
import java.util.HashMap;
import o.Styleable;
/* loaded from: classes6.dex */
public abstract class moveDrawerToOffset {
    public /* synthetic */ moveDrawerToOffset(getTargetTypes gettargettypes) {
        this();
    }

    private moveDrawerToOffset() {
    }

    /* loaded from: classes6.dex */
    public static final class values extends moveDrawerToOffset {
        private final int valueOf;

        public values(int i) {
            super(null);
            this.valueOf = i;
        }
    }

    /* loaded from: classes6.dex */
    public static final class toString extends moveDrawerToOffset {
        private final moveDrawerToOffset[][] toString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toString(moveDrawerToOffset... movedrawertooffsetArr) {
            super(null);
            runAnimators.ag$a(movedrawertooffsetArr, "ip");
            this.toString = new moveDrawerToOffset[][]{movedrawertooffsetArr};
        }
    }

    /* loaded from: classes6.dex */
    public static final class valueOf extends moveDrawerToOffset {
        private final HashMap<String, moveDrawerToOffset> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public valueOf(Styleable.ChangeBounds<? super valueOf, setAnimationMatrix> changeBounds) {
            super(null);
            runAnimators.ag$a(changeBounds, "funct");
            this.values = new HashMap<>();
            changeBounds.invoke(this);
        }

        public final HashMap<String, moveDrawerToOffset> valueOf() {
            return this.values;
        }

        public final values ah$a(String str, int i) {
            runAnimators.ag$a(str, StringSet.key);
            values valuesVar = new values(i);
            valueOf().put(str, valuesVar);
            return valuesVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [o.moveDrawerToOffset$ag$a, java.lang.Object] */
        public final moveDrawerToOffset$ag$a values(String str, final String str2) {
            runAnimators.ag$a(str, StringSet.key);
            runAnimators.ag$a(str2, "value");
            ?? r0 = new moveDrawerToOffset(str2) { // from class: o.moveDrawerToOffset$ag$a
                private final String values;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                    runAnimators.ag$a(str2, "value");
                    this.values = str2;
                }
            };
            valueOf().put(str, r0);
            return r0;
        }

        public final valueOf toString(String str, Styleable.ChangeBounds<? super valueOf, setAnimationMatrix> changeBounds) {
            runAnimators.ag$a(str, StringSet.key);
            runAnimators.ag$a(changeBounds, "value");
            valueOf valueof = new valueOf(changeBounds);
            this.values.put(str, valueof);
            return valueof;
        }

        public final toString values(String str, moveDrawerToOffset... movedrawertooffsetArr) {
            runAnimators.ag$a(str, StringSet.key);
            runAnimators.ag$a(movedrawertooffsetArr, "values");
            toString tostring = new toString((moveDrawerToOffset[]) Arrays.copyOf(movedrawertooffsetArr, movedrawertooffsetArr.length));
            this.values.put(str, tostring);
            return tostring;
        }
    }
}

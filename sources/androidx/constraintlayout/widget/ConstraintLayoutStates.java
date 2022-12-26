package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import o.isLast;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes5.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private static int ag$a = 68;
    private static boolean ah$a = true;
    private static int invoke = 1;
    private static int toString = 0;
    private static boolean valueOf = true;
    private static char[] values = {173, 168};
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.mConstraintLayout = constraintLayout;
        load(context, i);
    }

    public boolean needsToChange(int i, float f, float f2) {
        State state;
        int i2 = this.mCurrentStateId;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            int i3 = invoke + 31;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                state = this.mStateList.valueAt(1);
            } else {
                try {
                    try {
                        state = this.mStateList.valueAt(0);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } else {
            state = this.mStateList.get(i2);
        }
        State state2 = state;
        if (this.mCurrentConstraintNumber != -1) {
            if ((state2.mVariants.get(this.mCurrentConstraintNumber).match(f, f2) ? '@' : (char) 27) != 27) {
                int i4 = invoke + 9;
                toString = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        if ((this.mCurrentConstraintNumber == state2.findMatch(f, f2) ? '>' : 'Y') != 'Y') {
            int i6 = toString + 29;
            invoke = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return true;
    }

    public void updateConstraints(int i, float f, float f2) {
        ConstraintSet constraintSet;
        int i2;
        State state;
        ConstraintSet constraintSet2;
        int i3;
        int i4 = this.mCurrentStateId;
        Object obj = null;
        try {
            if (i4 == i) {
                if ((i == -1 ? '\n' : 'B') != 'B') {
                    state = this.mStateList.valueAt(0);
                } else {
                    state = this.mStateList.get(i4);
                }
                if (this.mCurrentConstraintNumber != -1) {
                    int i5 = invoke + 13;
                    toString = i5 % 128;
                    int i6 = i5 % 2;
                    if (state.mVariants.get(this.mCurrentConstraintNumber).match(f, f2)) {
                        return;
                    }
                }
                int findMatch = state.findMatch(f, f2);
                if (this.mCurrentConstraintNumber == findMatch) {
                    return;
                }
                if ((findMatch == -1 ? (char) 27 : (char) 17) != 17) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = state.mVariants.get(findMatch).mConstraintSet;
                }
                if (findMatch == -1) {
                    i3 = state.mConstraintID;
                } else {
                    i3 = state.mVariants.get(findMatch).mConstraintID;
                }
                if (constraintSet2 == null) {
                    return;
                }
                this.mCurrentConstraintNumber = findMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    int i7 = invoke + 63;
                    toString = i7 % 128;
                    if (i7 % 2 != 0) {
                        constraintsChangedListener.preLayoutChange(-1, i3);
                        super.hashCode();
                    } else {
                        constraintsChangedListener.preLayoutChange(-1, i3);
                    }
                }
                constraintSet2.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i3);
                    return;
                }
                return;
            }
            this.mCurrentStateId = i;
            State state2 = this.mStateList.get(i);
            int findMatch2 = state2.findMatch(f, f2);
            if (findMatch2 != -1) {
                constraintSet = state2.mVariants.get(findMatch2).mConstraintSet;
            } else {
                int i8 = toString + 29;
                invoke = i8 % 128;
                int i9 = i8 % 2;
                try {
                    constraintSet = state2.mConstraintSet;
                } catch (Exception e) {
                    throw e;
                }
            }
            if ((findMatch2 == -1 ? '(' : 'T') == '(') {
                i2 = state2.mConstraintID;
            } else {
                i2 = state2.mVariants.get(findMatch2).mConstraintID;
            }
            if (constraintSet == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
                int i10 = invoke + 31;
                toString = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                super.hashCode();
                return;
            }
            this.mCurrentConstraintNumber = findMatch2;
            ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
            if (!(constraintsChangedListener3 == null)) {
                constraintsChangedListener3.preLayoutChange(i, i2);
            }
            constraintSet.applyTo(this.mConstraintLayout);
            ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
            if (constraintsChangedListener4 != null) {
                constraintsChangedListener4.postLayoutChange(i, i2);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        int i = toString + 21;
        invoke = i % 128;
        if ((i % 2 == 0 ? '=' : 'c') == 'c') {
            this.mConstraintsChangedListener = constraintsChangedListener;
            return;
        }
        try {
            this.mConstraintsChangedListener = constraintsChangedListener;
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f, float f2) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Variant {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean match(float f, float f2) {
            if (Float.isNaN(this.mMinWidth) || f >= this.mMinWidth) {
                if (Float.isNaN(this.mMinHeight) || f2 >= this.mMinHeight) {
                    if (Float.isNaN(this.mMaxWidth) || f <= this.mMaxWidth) {
                        return Float.isNaN(this.mMaxHeight) || f2 <= this.mMaxHeight;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        if ((r4 != 2) != true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
        if (r4 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
        r2 = androidx.constraintlayout.widget.ConstraintLayoutStates.invoke + 81;
        androidx.constraintlayout.widget.ConstraintLayoutStates.toString = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c2, code lost:
        if (r4 == 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
        android.util.Log.v("ConstraintLayoutStates", "unknown tag " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
        parseConstraintSet(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
        r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates.Variant(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
        r1 = androidx.constraintlayout.widget.ConstraintLayoutStates.toString + 11;
        androidx.constraintlayout.widget.ConstraintLayoutStates.invoke = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.load(android.content.Context, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r1.contains("/") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r1.contains("/") ? 19 : 23) != 23) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        r2 = r14.getResources().getIdentifier(r1.substring(r1.indexOf(47) + 1), valueOf(null, null, (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 126, new byte[]{-126, -127}).intern(), r14.getPackageName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        r14 = androidx.constraintlayout.widget.ConstraintLayoutStates.toString + 15;
        androidx.constraintlayout.widget.ConstraintLayoutStates.invoke = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseConstraintSet(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            int r1 = r15.getAttributeCount()
            r2 = 0
            r3 = 0
        Lb:
            r4 = 2
            if (r3 >= r1) goto Lc5
            long r5 = android.os.Process.getElapsedCpuTime()
            r7 = 0
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r10 = r10 + 126
            byte[] r5 = new byte[r4]
            r5 = {x00d0: FILL_ARRAY_DATA  , data: [-126, -127} // fill-array
            java.lang.String r5 = valueOf(r9, r9, r10, r5)
            java.lang.String r5 = r5.intern()
            java.lang.String r6 = r15.getAttributeName(r3)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lc1
            int r1 = androidx.constraintlayout.widget.ConstraintLayoutStates.toString
            int r1 = r1 + 115
            int r5 = r1 % 128
            androidx.constraintlayout.widget.ConstraintLayoutStates.invoke = r5
            int r1 = r1 % r4
            r5 = 1
            if (r1 != 0) goto L3e
            r1 = 0
            goto L3f
        L3e:
            r1 = 1
        L3f:
            r6 = -1
            java.lang.String r10 = "/"
            if (r1 == 0) goto L4f
            java.lang.String r1 = r15.getAttributeValue(r3)
            boolean r2 = r1.contains(r10)
            if (r2 == 0) goto L92
            goto L65
        L4f:
            java.lang.String r1 = r15.getAttributeValue(r3)
            boolean r3 = r1.contains(r10)
            r10 = 44
            int r10 = r10 / r2
            r2 = 23
            if (r3 == 0) goto L61
            r3 = 19
            goto L63
        L61:
            r3 = 23
        L63:
            if (r3 == r2) goto L92
        L65:
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r3 = r14.getResources()
            long r10 = android.os.Process.getElapsedCpuTime()
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            int r12 = r12 + 126
            byte[] r7 = new byte[r4]
            r7 = {x00d6: FILL_ARRAY_DATA  , data: [-126, -127} // fill-array
            java.lang.String r7 = valueOf(r9, r9, r12, r7)
            java.lang.String r7 = r7.intern()
            java.lang.String r8 = r14.getPackageName()
            int r2 = r3.getIdentifier(r2, r7, r8)
            goto L93
        L92:
            r2 = -1
        L93:
            if (r2 != r6) goto Lb6
            if (r1 == 0) goto Laf
            int r3 = r1.length()
            if (r3 <= r5) goto Laf
            int r2 = androidx.constraintlayout.widget.ConstraintLayoutStates.toString
            int r2 = r2 + 15
            int r3 = r2 % 128
            androidx.constraintlayout.widget.ConstraintLayoutStates.invoke = r3
            int r2 = r2 % r4
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
            goto Lb6
        Laf:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r1, r3)
        Lb6:
            r0.load(r14, r15)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r14 = r13.mConstraintSetMap
            r14.put(r2, r0)
            goto Lc5
        Lbf:
            r14 = move-exception
            throw r14
        Lc1:
            int r3 = r3 + 1
            goto Lb
        Lc5:
            int r14 = androidx.constraintlayout.widget.ConstraintLayoutStates.toString
            int r14 = r14 + 15
            int r15 = r14 % 128
            androidx.constraintlayout.widget.ConstraintLayoutStates.invoke = r15
            int r14 = r14 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.parseConstraintSet(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = values;
            int i2 = ag$a;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (valueOf) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}

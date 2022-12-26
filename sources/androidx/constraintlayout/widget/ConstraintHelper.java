package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.HashMap;
import o.isFirst;
import org.apache.http.message.TokenParser;
/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    private static char[] ag$a = {2, 1, 13822, 13811};
    private static int toString = 0;
    private static char valueOf = 2;
    private static int values = 1;
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    private HashMap<Integer, String> mMap;
    protected String mReferenceIds;
    protected String mReferenceTags;
    protected boolean mUseViewMeasure;
    private View[] mViews;
    protected Context myContext;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = toString + 23;
        values = i % 128;
        if (i % 2 != 0) {
            return;
        }
        int i2 = 48 / 0;
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        int i = toString + 1;
        values = i % 128;
        if ((i % 2 == 0 ? 'T' : 'B') != 'B') {
            Object obj = null;
            super.hashCode();
        }
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
        int i = values + 37;
        toString = i % 128;
        if ((i % 2 != 0 ? '(' : '\f') != '(') {
            return;
        }
        int i2 = 74 / 0;
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
        int i = toString + 25;
        values = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        int i = values + 15;
        toString = i % 128;
        int i2 = i % 2;
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
        int i = values + 65;
        toString = i % 128;
        if ((i % 2 != 0 ? '\'' : TokenParser.ESCAPE) != '\'') {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    public ConstraintHelper(Context context) {
        super(context);
        try {
            this.mIds = new int[32];
            this.mUseViewMeasure = false;
            this.mViews = null;
            this.mMap = new HashMap<>();
            this.myContext = context;
            init(null);
        } catch (Exception e) {
            throw e;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
        if ((r7 != null ? 6 : 4) != 6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
        r7 = getContext().obtainStyledAttributes(r7, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
        r0 = r7.getIndexCount();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        if (r3 >= r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
        r4 = androidx.constraintlayout.widget.ConstraintHelper.toString + 101;
        androidx.constraintlayout.widget.ConstraintHelper.values = r4 % 128;
        r4 = r4 % 2;
        r4 = r7.getIndex(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r4 != androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r4 = r7.getString(r4);
        r6.mReferenceIds = r4;
        setIds(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r4 != androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        r4 = r7.getString(r4);
        r6.mReferenceTags = r4;
        setReferenceTags(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        r7.recycle();
        r7 = androidx.constraintlayout.widget.ConstraintHelper.toString + 75;
        androidx.constraintlayout.widget.ConstraintHelper.values = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        r7 = androidx.constraintlayout.widget.ConstraintHelper.toString + 111;
        androidx.constraintlayout.widget.ConstraintHelper.values = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        if ((r7 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        r7 = 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        r7 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r7 == '\f') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
        r7 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.util.AttributeSet r7) {
        /*
            r6 = this;
            int r0 = androidx.constraintlayout.widget.ConstraintHelper.values     // Catch: java.lang.Exception -> L91
            int r0 = r0 + 43
            int r1 = r0 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r1     // Catch: java.lang.Exception -> L91
            int r0 = r0 % 2
            r1 = 22
            if (r0 == 0) goto L10
            r0 = 3
            goto L12
        L10:
            r0 = 22
        L12:
            r2 = 0
            if (r0 == r1) goto L1b
            int r0 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L75
            goto L24
        L19:
            r7 = move-exception
            throw r7
        L1b:
            r0 = 6
            if (r7 == 0) goto L20
            r1 = 6
            goto L21
        L20:
            r1 = 4
        L21:
            if (r1 == r0) goto L24
            goto L75
        L24:
            android.content.Context r0 = r6.getContext()     // Catch: java.lang.Exception -> L8f
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout     // Catch: java.lang.Exception -> L8f
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r3 = 0
        L34:
            if (r3 >= r0) goto L68
            int r4 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r4 = r4 + 101
            int r5 = r4 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r5
            int r4 = r4 % 2
            int r4 = r7.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids
            if (r4 != r5) goto L52
            java.lang.String r4 = r7.getString(r4)
            r6.mReferenceIds = r4
            r6.setIds(r4)
            goto L65
        L52:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_tags     // Catch: java.lang.Exception -> L91
            if (r4 != r5) goto L58
            r5 = 0
            goto L59
        L58:
            r5 = 1
        L59:
            if (r5 == 0) goto L5c
            goto L65
        L5c:
            java.lang.String r4 = r7.getString(r4)
            r6.mReferenceTags = r4
            r6.setReferenceTags(r4)
        L65:
            int r3 = r3 + 1
            goto L34
        L68:
            r7.recycle()
            int r7 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r7 = r7 + 75
            int r0 = r7 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r0
            int r7 = r7 % 2
        L75:
            int r7 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r7 = r7 + 111
            int r0 = r7 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r0
            int r7 = r7 % 2
            r0 = 12
            if (r7 != 0) goto L86
            r7 = 87
            goto L88
        L86:
            r7 = 12
        L88:
            if (r7 == r0) goto L8e
            int r7 = r2.length     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r7 = move-exception
            throw r7
        L8e:
            return
        L8f:
            r7 = move-exception
            throw r7
        L91:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.init(android.util.AttributeSet):void");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            String str = this.mReferenceIds;
            if ((str != null ? 'B' : '$') == 'B') {
                int i = values + 59;
                toString = i % 128;
                if (!(i % 2 == 0)) {
                    setIds(str);
                    int i2 = 37 / 0;
                } else {
                    setIds(str);
                }
            }
            String str2 = this.mReferenceTags;
            if (str2 != null) {
                int i3 = toString + 85;
                values = i3 % 128;
                int i4 = i3 % 2;
                try {
                    setReferenceTags(str2);
                    int i5 = values + 99;
                    toString = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void addView(View view) {
        int i = values + 33;
        toString = i % 128;
        int i2 = i % 2;
        if (view == this) {
            return;
        }
        try {
            if (!(view.getId() != -1)) {
                try {
                    Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
                    return;
                } catch (Exception e) {
                    throw e;
                }
            }
            Object obj = null;
            if (view.getParent() != null) {
                this.mReferenceIds = null;
                addRscID(view.getId());
                requestLayout();
                return;
            }
            int i3 = values + 63;
            toString = i3 % 128;
            if (i3 % 2 == 0) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            super.hashCode();
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void removeView(View view) {
        int i;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.mReferenceIds = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mCount) {
                break;
            }
            int i3 = values + 23;
            toString = i3 % 128;
            int i4 = i3 % 2;
            if (this.mIds[i2] == id) {
                while (true) {
                    i = this.mCount - 1;
                    if (i2 >= i) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i5 = i2 + 1;
                    iArr[i2] = iArr[i5];
                    int i6 = toString + 45;
                    values = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = i5;
                }
                this.mIds[i] = 0;
                this.mCount = i;
                int i8 = values + 69;
                toString = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i2++;
            }
        }
        requestLayout();
    }

    public int[] getReferencedIds() {
        try {
            int i = values + 75;
            try {
                toString = i % 128;
                if ((i % 2 != 0 ? 'D' : (char) 11) != 11) {
                    int[] copyOf = Arrays.copyOf(this.mIds, this.mCount);
                    Object[] objArr = null;
                    int length = objArr.length;
                    return copyOf;
                }
                return Arrays.copyOf(this.mIds, this.mCount);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setReferencedIds(int[] iArr) {
        int i = toString + 25;
        values = i % 128;
        int i2 = i % 2;
        Object[] objArr = null;
        this.mReferenceIds = null;
        this.mCount = 0;
        int i3 = toString + 89;
        values = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (!(i5 < iArr.length)) {
                break;
            }
            addRscID(iArr[i5]);
            i5++;
        }
        int i6 = values + 111;
        toString = i6 % 128;
        if (i6 % 2 != 0) {
            int length = objArr.length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r6 == getId()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6 = androidx.constraintlayout.widget.ConstraintHelper.values + 63;
        androidx.constraintlayout.widget.ConstraintHelper.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r6 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        r0 = r5.mCount;
        r1 = r5.mIds;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
        if ((r0 + 1) <= r1.length) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        r0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r0 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r0 == 15) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        r5.mIds = java.util.Arrays.copyOf(r1, r1.length * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        r0 = r5.mIds;
        r1 = r5.mCount;
        r0[r1] = r6;
        r5.mCount = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r6 == getId()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addRscID(int r6) {
        /*
            r5 = this;
            int r0 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r0 = r0 + 11
            int r1 = r0 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L1c
            int r0 = r5.getId()     // Catch: java.lang.Exception -> L1a
            if (r6 != r0) goto L3d
            goto L25
        L1a:
            r6 = move-exception
            throw r6
        L1c:
            int r0 = r5.getId()
            r3 = 44
            int r3 = r3 / r1
            if (r6 != r0) goto L3d
        L25:
            int r6 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r6 = r6 + 63
            int r0 = r6 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L32
            goto L33
        L32:
            r1 = 1
        L33:
            if (r1 == 0) goto L36
            return
        L36:
            r6 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r6 = move-exception
            throw r6
        L3d:
            int r0 = r5.mCount
            int[] r1 = r5.mIds
            int r0 = r0 + r2
            int r3 = r1.length
            r4 = 15
            if (r0 <= r3) goto L4a
            r0 = 15
            goto L4c
        L4a:
            r0 = 20
        L4c:
            if (r0 == r4) goto L4f
            goto L58
        L4f:
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r5.mIds = r0
        L58:
            int[] r0 = r5.mIds
            int r1 = r5.mCount
            r0[r1] = r6
            int r1 = r1 + r2
            r5.mCount = r1
            return
        L62:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.addRscID(int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = values + 27;
        toString = i3 % 128;
        int i4 = i3 % 2;
        try {
            if ((this.mUseViewMeasure ? 'Y' : 'a') != 'a') {
                int i5 = values + 81;
                try {
                    toString = i5 % 128;
                    boolean z = i5 % 2 != 0;
                    super.onMeasure(i, i2);
                    if (!z) {
                        return;
                    }
                    Object[] objArr = null;
                    int length = objArr.length;
                    return;
                } catch (Exception e) {
                    throw e;
                }
            }
            setMeasuredDimension(0, 0);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void validateParams() {
        int i = values + 33;
        toString = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            Helper helper = this.mHelperWidget;
            super.hashCode();
            if (helper == null) {
                return;
            }
        } else {
            try {
                if (this.mHelperWidget == null) {
                    return;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(!(layoutParams instanceof ConstraintLayout.LayoutParams))) {
            int i2 = values + 105;
            toString = i2 % 128;
            if ((i2 % 2 != 0 ? 'B' : '=') == 'B') {
                ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
                int length = objArr.length;
                return;
            }
            try {
                ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private void addID(String str) {
        if (str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                if (this.myContext == null) {
                    int i = toString + 63;
                    values = i % 128;
                    int i2 = i % 2;
                    return;
                }
                try {
                    String trim = str.trim();
                    if (getParent() instanceof ConstraintLayout) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
                    }
                    int findId = findId(trim);
                    if (findId != 0) {
                        int i3 = values + 53;
                        toString = i3 % 128;
                        if ((i3 % 2 != 0 ? '9' : (char) 27) != '9') {
                            this.mMap.put(Integer.valueOf(findId), trim);
                            addRscID(findId);
                            return;
                        }
                        this.mMap.put(Integer.valueOf(findId), trim);
                        addRscID(findId);
                        Object[] objArr = null;
                        int length = objArr.length;
                        return;
                    }
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    int i4 = values + 41;
                    toString = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
        if (r7 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (r6.getId() == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        android.util.Log.w("ConstraintHelper", "to use ConstraintTag view " + r6.getClass().getSimpleName() + " must have an ID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
        addRscID(r6.getId());
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addTag(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.addTag(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? '#' : ':') != '#') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if ((!(getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findId(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r0 = r0 + 121
            int r1 = r0 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L26
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 25
            int r5 = r5 / r4
            r5 = 35
            if (r0 == 0) goto L1f
            r0 = 35
            goto L21
        L1f:
            r0 = 58
        L21:
            if (r0 == r5) goto L33
            goto L3a
        L24:
            r9 = move-exception
            throw r9
        L26:
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L30
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 == r3) goto L3a
        L33:
            android.view.ViewParent r0 = r8.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L3b
        L3a:
            r0 = r2
        L3b:
            boolean r5 = r8.isInEditMode()
            r6 = 65
            if (r5 == 0) goto L46
            r5 = 65
            goto L48
        L46:
            r5 = 97
        L48:
            if (r5 == r6) goto L4b
            goto L6a
        L4b:
            if (r0 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r0.getDesignInformation(r4, r9)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L6a
            int r6 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r6 = r6 + 103
            int r7 = r6 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r7
            int r6 = r6 % r1
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L6b
        L6a:
            r5 = 0
        L6b:
            if (r5 != 0) goto L8a
            if (r0 == 0) goto L70
            r3 = 0
        L70:
            if (r3 == 0) goto L73
            goto L8a
        L73:
            int r3 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r3 = r3 + 43
            int r5 = r3 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r5
            int r3 = r3 % r1
            if (r3 == 0) goto L86
            int r5 = r8.findId(r0, r9)
            int r0 = r2.length     // Catch: java.lang.Throwable -> L84
            goto L8a
        L84:
            r9 = move-exception
            throw r9
        L86:
            int r5 = r8.findId(r0, r9)
        L8a:
            if (r5 != 0) goto L98
            java.lang.Class<androidx.constraintlayout.widget.R$id> r0 = androidx.constraintlayout.widget.R.id.class
            java.lang.reflect.Field r0 = r0.getField(r9)     // Catch: java.lang.Exception -> L97
            int r5 = r0.getInt(r2)     // Catch: java.lang.Exception -> L97
            goto L98
        L97:
        L98:
            if (r5 != 0) goto Lc3
            android.content.Context r0 = r8.myContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r2 = r8.myContext
            java.lang.String r2 = r2.getPackageName()
            int r3 = android.view.View.MeasureSpec.getMode(r4)
            int r3 = r3 + 36
            byte r3 = (byte) r3
            char[] r5 = new char[r1]
            r5 = {x00c4: FILL_ARRAY_DATA  , data: [2, 3} // fill-array
            int r4 = android.graphics.Color.argb(r4, r4, r4, r4)
            int r1 = r1 - r4
            java.lang.String r1 = toString(r3, r5, r1)
            java.lang.String r1 = r1.intern()
            int r5 = r0.getIdentifier(r9, r1, r2)
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.findId(java.lang.String):int");
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        if (str != null && constraintLayout != null) {
            Resources resources = this.myContext.getResources();
            if (resources == null) {
                int i = toString + 103;
                values = i % 128;
                int i2 = i % 2;
                return 0;
            }
            int childCount = constraintLayout.getChildCount();
            try {
                int i3 = toString + 5;
                try {
                    values = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 0;
                    while (true) {
                        if ((i5 < childCount ? (char) 24 : 'Z') != 24) {
                            break;
                        }
                        View childAt = constraintLayout.getChildAt(i5);
                        if (childAt.getId() != -1) {
                            String str2 = null;
                            try {
                                str2 = resources.getResourceEntryName(childAt.getId());
                            } catch (Resources.NotFoundException unused) {
                            }
                            if (str.equals(str2)) {
                                int i6 = toString + 85;
                                values = i6 % 128;
                                int i7 = i6 % 2;
                                return childAt.getId();
                            }
                        }
                        i5++;
                        int i8 = toString + 5;
                        values = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return 0;
    }

    protected void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        this.mCount = 0;
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (!(indexOf != -1)) {
                int i2 = toString + 85;
                values = i2 % 128;
                int i3 = i2 % 2;
                addID(str.substring(i));
                int i4 = values + 33;
                toString = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            addID(str.substring(i, indexOf));
            i = indexOf + 1;
        }
    }

    protected void setReferenceTags(String str) {
        try {
            int i = toString + 85;
            values = i % 128;
            int i2 = i % 2;
            this.mReferenceTags = str;
            if (str == null) {
                return;
            }
            int i3 = 0;
            this.mCount = 0;
            int i4 = toString + 103;
            values = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                int indexOf = str.indexOf(44, i3);
                if ((indexOf == -1 ? '2' : (char) 30) != 30) {
                    try {
                        addTag(str.substring(i3));
                        int i6 = toString + 83;
                        values = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                addTag(str.substring(i3, indexOf));
                i3 = indexOf + 1;
                i4 = values + 111;
                toString = i4 % 128;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 21 ? '\n' : '3') != '3') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r5 = getElevation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 91) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyLayoutFeatures(androidx.constraintlayout.widget.ConstraintLayout r11) {
        /*
            r10 = this;
            int r0 = androidx.constraintlayout.widget.ConstraintHelper.toString     // Catch: java.lang.Exception -> L8c
            int r0 = r0 + 115
            int r1 = r0 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r1     // Catch: java.lang.Exception -> L8c
            int r0 = r0 % 2
            r1 = 0
            r2 = 21
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L21
            int r0 = r10.getVisibility()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 91
            if (r5 < r6) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L37
            goto L32
        L21:
            int r0 = r10.getVisibility()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 51
            if (r5 < r2) goto L2e
            r5 = 10
            goto L30
        L2e:
            r5 = 51
        L30:
            if (r5 == r6) goto L37
        L32:
            float r5 = r10.getElevation()
            goto L38
        L37:
            r5 = 0
        L38:
            r6 = 0
        L39:
            int r7 = r10.mCount
            r8 = 90
            if (r6 >= r7) goto L42
            r7 = 90
            goto L44
        L42:
            r7 = 81
        L44:
            if (r7 == r8) goto L47
            return
        L47:
            int[] r7 = r10.mIds
            r7 = r7[r6]
            android.view.View r7 = r11.getViewById(r7)
            if (r7 == 0) goto L53
            r8 = 1
            goto L54
        L53:
            r8 = 0
        L54:
            if (r8 == 0) goto L89
            r7.setVisibility(r0)     // Catch: java.lang.Exception -> L8c
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 <= 0) goto L89
            int r8 = androidx.constraintlayout.widget.ConstraintHelper.toString     // Catch: java.lang.Exception -> L87
            int r8 = r8 + 85
            int r9 = r8 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r9     // Catch: java.lang.Exception -> L8c
            int r8 = r8 % 2
            if (r8 != 0) goto L6b
            r8 = 0
            goto L6c
        L6b:
            r8 = 1
        L6c:
            if (r8 == 0) goto L73
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L89
            goto L7e
        L73:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 100
            if (r8 < r9) goto L7b
            r8 = 1
            goto L7c
        L7b:
            r8 = 0
        L7c:
            if (r8 == 0) goto L89
        L7e:
            float r8 = r7.getTranslationZ()
            float r8 = r8 + r5
            r7.setTranslationZ(r8)
            goto L89
        L87:
            r11 = move-exception
            throw r11
        L89:
            int r6 = r6 + 1
            goto L39
        L8c:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.applyLayoutFeatures(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if ((parent != null ? 'D' : (char) 19) == 'D') {
            try {
                int i = values + 73;
                try {
                    toString = i % 128;
                    int i2 = i % 2;
                    if (parent instanceof ConstraintLayout) {
                        int i3 = values + 105;
                        toString = i3 % 128;
                        if (i3 % 2 == 0) {
                            applyLayoutFeatures((ConstraintLayout) parent);
                        } else {
                            applyLayoutFeatures((ConstraintLayout) parent);
                            Object[] objArr = null;
                            int length = objArr.length;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i4 = values + 55;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
        r2 = r7.mMap.get(java.lang.Integer.valueOf(r2));
        r4 = findId(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r4 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r6 == true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        r7.mIds[r1] = r4;
        r7.mMap.put(java.lang.Integer.valueOf(r4), r2);
        r3 = r8.getViewById(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r8) {
        /*
            r7 = this;
            int r0 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r0 = r0 + 73
            int r1 = r0 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r1
            int r0 = r0 % 2
            boolean r0 = r7.isInEditMode()
            r1 = 67
            if (r0 == 0) goto L15
            r0 = 89
            goto L17
        L15:
            r0 = 67
        L17:
            if (r0 == r1) goto L1e
            java.lang.String r0 = r7.mReferenceIds
            r7.setIds(r0)
        L1e:
            androidx.constraintlayout.solver.widgets.Helper r0 = r7.mHelperWidget
            if (r0 != 0) goto L34
            int r8 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r8 = r8 + 57
            int r0 = r8 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r0
            int r8 = r8 % 2
            if (r8 != 0) goto L33
            r8 = 0
            int r8 = r8.length     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r8 = move-exception
            throw r8
        L33:
            return
        L34:
            r0.removeAllIds()
            r0 = 0
            r1 = 0
        L39:
            int r2 = r7.mCount
            r3 = 52
            if (r1 >= r2) goto L42
            r2 = 92
            goto L44
        L42:
            r2 = 52
        L44:
            if (r2 == r3) goto Lb2
            int r2 = androidx.constraintlayout.widget.ConstraintHelper.toString     // Catch: java.lang.Exception -> Lb0
            int r2 = r2 + 101
            int r3 = r2 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r3     // Catch: java.lang.Exception -> Lb0
            int r2 = r2 % 2
            if (r2 != 0) goto L62
            int[] r2 = r7.mIds
            r2 = r2[r1]
            android.view.View r3 = r8.getViewById(r2)
            r4 = 80
            int r4 = r4 / r0
            if (r3 != 0) goto L95
            goto L6c
        L60:
            r8 = move-exception
            throw r8
        L62:
            int[] r2 = r7.mIds
            r2 = r2[r1]
            android.view.View r3 = r8.getViewById(r2)
            if (r3 != 0) goto L95
        L6c:
            java.util.HashMap<java.lang.Integer, java.lang.String> r4 = r7.mMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.findId(r8, r2)
            r5 = 1
            if (r4 == 0) goto L81
            r6 = 0
            goto L82
        L81:
            r6 = 1
        L82:
            if (r6 == r5) goto L95
            int[] r3 = r7.mIds
            r3[r1] = r4
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r7.mMap
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r2)
            android.view.View r3 = r8.getViewById(r4)
        L95:
            if (r3 == 0) goto Lad
            int r2 = androidx.constraintlayout.widget.ConstraintHelper.values
            int r2 = r2 + 81
            int r4 = r2 % 128
            androidx.constraintlayout.widget.ConstraintHelper.toString = r4
            int r2 = r2 % 2
            androidx.constraintlayout.solver.widgets.Helper r2 = r7.mHelperWidget     // Catch: java.lang.Exception -> Lab
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.getViewWidget(r3)     // Catch: java.lang.Exception -> Lab
            r2.add(r3)     // Catch: java.lang.Exception -> Lb0
            goto Lad
        Lab:
            r8 = move-exception
            throw r8
        Lad:
            int r1 = r1 + 1
            goto L39
        Lb0:
            r8 = move-exception
            throw r8
        Lb2:
            androidx.constraintlayout.solver.widgets.Helper r0 = r7.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8 = r8.mLayoutWidget
            r0.updateConstraints(r8)
            int r8 = androidx.constraintlayout.widget.ConstraintHelper.toString
            int r8 = r8 + 95
            int r0 = r8 % 128
            androidx.constraintlayout.widget.ConstraintHelper.values = r0
            int r8 = r8 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        int i = 0;
        int i2 = toString + 95;
        values = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if ((i < this.mCount ? '[' : '\b') == '\b') {
                return;
            }
            try {
                int i4 = values + 19;
                toString = i4 % 128;
                if (i4 % 2 != 0) {
                    helper.add(sparseArray.get(this.mIds[i]));
                    i += 115;
                } else {
                    helper.add(sparseArray.get(this.mIds[i]));
                    i++;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] getViews(ConstraintLayout constraintLayout) {
        int i = toString + 125;
        values = i % 128;
        int i2 = i % 2;
        View[] viewArr = this.mViews;
        if ((viewArr != null ? 'A' : (char) 3) == 3 || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        int i3 = 0;
        while (true) {
            if ((i3 < this.mCount ? '?' : 'O') != 'O') {
                this.mViews[i3] = constraintLayout.getViewById(this.mIds[i3]);
                i3++;
                int i4 = toString + 15;
                values = i4 % 128;
                int i5 = i4 % 2;
            } else {
                return this.mViews;
            }
        }
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
            int i = toString + 75;
            values = i % 128;
            int i2 = i % 2;
        } else if (!(constraint.layout.mReferenceIdString == null)) {
            int i3 = values + 85;
            toString = i3 % 128;
            int i4 = i3 % 2;
            if (!(constraint.layout.mReferenceIdString.length() <= 0)) {
                try {
                    constraint.layout.mReferenceIds = convertReferenceString(this, constraint.layout.mReferenceIdString);
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        helperWidget.removeAllIds();
        if (constraint.layout.mReferenceIds != null) {
            for (int i5 = 0; i5 < constraint.layout.mReferenceIds.length; i5++) {
                try {
                    ConstraintWidget constraintWidget = sparseArray.get(constraint.layout.mReferenceIds[i5]);
                    if (constraintWidget != null) {
                        int i6 = values + 77;
                        toString = i6 % 128;
                        int i7 = i6 % 2;
                        helperWidget.add(constraintWidget);
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    private int[] convertReferenceString(View view, String str) {
        int i = values + 41;
        toString = i % 128;
        int i2 = i % 2;
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i3 = values + 77;
        toString = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= split.length) {
                break;
            }
            int findId = findId(split[i5].trim());
            if (findId != 0) {
                iArr[i6] = findId;
                i6++;
            }
            i5++;
        }
        if (i6 != split.length) {
            int i7 = values + 33;
            toString = i7 % 128;
            char c = i7 % 2 != 0 ? '?' : '<';
            iArr = Arrays.copyOf(iArr, i6);
            if (c == '?') {
                int i8 = 63 / 0;
            }
        }
        return iArr;
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = values + 109;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.setTag(i, obj);
        if ((obj == null) && this.mReferenceIds == null) {
            addRscID(i);
            int i4 = values + 97;
            toString = i4 % 128;
            int i5 = i4 % 2;
        }
        try {
            int i6 = toString + 93;
            values = i6 % 128;
            if ((i6 % 2 == 0 ? (char) 18 : 'D') != 18) {
                return;
            }
            Object obj2 = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ag$a;
            char c = valueOf;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}

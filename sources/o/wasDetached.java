package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
/* loaded from: classes5.dex */
public class wasDetached extends RecyclerView.ItemDecoration {
    private static final int[] values = {16843284};
    private Drawable ah$a;
    private int valueOf;

    public wasDetached(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(values);
        this.ah$a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        ah$a(3);
    }

    public void valueOf(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.ah$a = drawable;
    }

    public void ah$a(int i) {
        this.valueOf = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        valueOf(canvas, recyclerView);
        values(canvas, recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!valueOf() && !values()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<setViewId> HaptikSDK$d = flexboxLayoutManager.HaptikSDK$d();
        ag$a(rect, childAdapterPosition, flexboxLayoutManager, HaptikSDK$d, flexboxLayoutManager.values());
        ah$a(rect, childAdapterPosition, flexboxLayoutManager, HaptikSDK$d);
    }

    private void ah$a(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<setViewId> list) {
        if (list.size() == 0 || flexboxLayoutManager.toString(i) == 0) {
            return;
        }
        if (flexboxLayoutManager.getSignupData()) {
            if (!valueOf()) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            rect.top = this.ah$a.getIntrinsicHeight();
            rect.bottom = 0;
        } else if (values()) {
            if (flexboxLayoutManager.HaptikWebView()) {
                rect.right = this.ah$a.getIntrinsicWidth();
                rect.left = 0;
                return;
            }
            rect.left = this.ah$a.getIntrinsicWidth();
            rect.right = 0;
        }
    }

    private void ag$a(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<setViewId> list, int i2) {
        if (ag$a(i, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.getSignupData()) {
            if (!values()) {
                rect.left = 0;
                rect.right = 0;
            } else if (flexboxLayoutManager.HaptikWebView()) {
                rect.right = this.ah$a.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.ah$a.getIntrinsicWidth();
                rect.right = 0;
            }
        } else if (!valueOf()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i2 == 3) {
            rect.bottom = this.ah$a.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.ah$a.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    private void values(Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        FlexboxLayoutManager flexboxLayoutManager;
        int max;
        int bottom;
        int i;
        int min;
        int top;
        if (values()) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop();
            int paddingTop = recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom();
            int paddingBottom = recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int values2 = flexboxLayoutManager2.values();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager2.HaptikWebView()) {
                    intrinsicWidth = childAt.getRight() + layoutParams.rightMargin;
                    left = this.ah$a.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - layoutParams.leftMargin;
                    intrinsicWidth = left - this.ah$a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.getSignupData()) {
                    max = childAt.getTop() - layoutParams.topMargin;
                    bottom = childAt.getBottom();
                    i = layoutParams.bottomMargin;
                    flexboxLayoutManager = flexboxLayoutManager2;
                } else if (values2 == 3) {
                    flexboxLayoutManager = flexboxLayoutManager2;
                    min = Math.min(childAt.getBottom() + layoutParams.bottomMargin + this.ah$a.getIntrinsicHeight(), bottom2 + paddingBottom);
                    top = childAt.getTop() - layoutParams.topMargin;
                    this.ah$a.setBounds(intrinsicWidth, top, left, min);
                    this.ah$a.draw(canvas);
                    i2++;
                    flexboxLayoutManager2 = flexboxLayoutManager;
                } else {
                    flexboxLayoutManager = flexboxLayoutManager2;
                    max = Math.max((childAt.getTop() - layoutParams.topMargin) - this.ah$a.getIntrinsicHeight(), top2 - paddingTop);
                    bottom = childAt.getBottom();
                    i = layoutParams.bottomMargin;
                }
                min = bottom + i;
                top = max;
                this.ah$a.setBounds(intrinsicWidth, top, left, min);
                this.ah$a.draw(canvas);
                i2++;
                flexboxLayoutManager2 = flexboxLayoutManager;
            }
        }
    }

    private void valueOf(Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        FlexboxLayoutManager flexboxLayoutManager;
        int left;
        int right;
        int i;
        int i2;
        int i3;
        if (valueOf()) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int values2 = flexboxLayoutManager2.values();
            int left2 = recyclerView.getLeft();
            int paddingLeft = recyclerView.getPaddingLeft();
            int right2 = recyclerView.getRight();
            int paddingRight = recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (values2 == 3) {
                    intrinsicHeight = childAt.getBottom() + layoutParams.bottomMargin;
                    top = this.ah$a.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - layoutParams.topMargin;
                    intrinsicHeight = top - this.ah$a.getIntrinsicHeight();
                }
                if (flexboxLayoutManager2.getSignupData()) {
                    if (flexboxLayoutManager2.HaptikWebView()) {
                        flexboxLayoutManager = flexboxLayoutManager2;
                        i3 = Math.min(childAt.getRight() + layoutParams.rightMargin + this.ah$a.getIntrinsicWidth(), right2 + paddingRight);
                        i2 = childAt.getLeft() - layoutParams.leftMargin;
                        this.ah$a.setBounds(i2, intrinsicHeight, i3, top);
                        this.ah$a.draw(canvas);
                        i4++;
                        flexboxLayoutManager2 = flexboxLayoutManager;
                    } else {
                        flexboxLayoutManager = flexboxLayoutManager2;
                        left = Math.max((childAt.getLeft() - layoutParams.leftMargin) - this.ah$a.getIntrinsicWidth(), left2 - paddingLeft);
                        right = childAt.getRight();
                        i = layoutParams.rightMargin;
                    }
                } else {
                    flexboxLayoutManager = flexboxLayoutManager2;
                    left = childAt.getLeft() - layoutParams.leftMargin;
                    right = childAt.getRight();
                    i = layoutParams.rightMargin;
                }
                int i5 = right + i;
                i2 = left;
                i3 = i5;
                this.ah$a.setBounds(i2, intrinsicHeight, i3, top);
                this.ah$a.draw(canvas);
                i4++;
                flexboxLayoutManager2 = flexboxLayoutManager;
            }
        }
    }

    private boolean valueOf() {
        return (this.valueOf & 1) > 0;
    }

    private boolean values() {
        return (this.valueOf & 2) > 0;
    }

    private boolean ag$a(int i, List<setViewId> list, FlexboxLayoutManager flexboxLayoutManager) {
        int flexboxLayoutManager2 = flexboxLayoutManager.toString(i);
        if ((flexboxLayoutManager2 == -1 || flexboxLayoutManager2 >= flexboxLayoutManager.invoke().size() || flexboxLayoutManager.invoke().get(flexboxLayoutManager2).HaptikSDK$a != i) && i != 0) {
            return list.size() != 0 && list.get(list.size() - 1).invoke == i - 1;
        }
        return true;
    }
}

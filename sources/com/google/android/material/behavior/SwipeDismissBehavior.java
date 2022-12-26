package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
/* loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private boolean HaptikSDK$b;
    SwipeDismissBehavior$ag$a ah$b;
    ViewDragHelper invoke;
    private boolean values;
    private float HaptikSDK$c = 0.0f;
    int HaptikSDK$a = 2;
    float ah$a = 0.5f;
    float ag$a = 0.0f;
    float toString = 0.5f;
    private final ViewDragHelper.Callback valueOf = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.4
        private int valueOf;
        private int values = -1;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.values;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.toString(view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            this.values = i;
            this.valueOf = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.this.ah$b != null) {
                SwipeDismissBehavior.this.ah$b.values(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            this.values = -1;
            int width = view.getWidth();
            if (valueOf(view, f)) {
                int left = view.getLeft();
                int i2 = this.valueOf;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.valueOf;
                z = false;
            }
            if (SwipeDismissBehavior.this.invoke.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new values(view, z));
            } else if (!z || SwipeDismissBehavior.this.ah$b == null) {
            } else {
                SwipeDismissBehavior.this.ah$b.ah$a(view);
            }
        }

        private boolean valueOf(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.valueOf) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.ah$a);
            }
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.HaptikSDK$a == 2) {
                return true;
            }
            if (SwipeDismissBehavior.this.HaptikSDK$a == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (SwipeDismissBehavior.this.HaptikSDK$a == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.HaptikSDK$a == 0) {
                if (z) {
                    width = this.valueOf - view.getWidth();
                    width2 = this.valueOf;
                } else {
                    width = this.valueOf;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (SwipeDismissBehavior.this.HaptikSDK$a != 1) {
                width = this.valueOf - view.getWidth();
                width2 = view.getWidth() + this.valueOf;
            } else if (z) {
                width = this.valueOf;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.valueOf - view.getWidth();
                width2 = this.valueOf;
            }
            return SwipeDismissBehavior.toString(width, i, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.valueOf + (view.getWidth() * SwipeDismissBehavior.this.ag$a);
            float width2 = this.valueOf + (view.getWidth() * SwipeDismissBehavior.this.toString);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.toString(0.0f, 1.0f - SwipeDismissBehavior.values(width, width2, f), 1.0f));
            }
        }
    };

    static float values(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean toString(View view) {
        return true;
    }

    public void ag$a(SwipeDismissBehavior$ag$a swipeDismissBehavior$ag$a) {
        this.ah$b = swipeDismissBehavior$ag$a;
    }

    public void ah$a(int i) {
        this.HaptikSDK$a = i;
    }

    public void ag$a(float f) {
        this.ag$a = toString(0.0f, f, 1.0f);
    }

    public void values(float f) {
        this.toString = toString(0.0f, f, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            values(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.values;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.values = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.values = false;
        }
        if (z) {
            values((ViewGroup) coordinatorLayout);
            return this.invoke.shouldInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.invoke;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    private void values(ViewGroup viewGroup) {
        ViewDragHelper create;
        if (this.invoke == null) {
            if (this.HaptikSDK$b) {
                create = ViewDragHelper.create(viewGroup, this.HaptikSDK$c, this.valueOf);
            } else {
                create = ViewDragHelper.create(viewGroup, this.valueOf);
            }
            this.invoke = create;
        }
    }

    /* loaded from: classes5.dex */
    class values implements Runnable {
        private final boolean ag$a;
        private final View ah$a;

        values(View view, boolean z) {
            this.ah$a = view;
            this.ag$a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwipeDismissBehavior.this.invoke != null && SwipeDismissBehavior.this.invoke.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.ah$a, this);
            } else if (!this.ag$a || SwipeDismissBehavior.this.ah$b == null) {
            } else {
                SwipeDismissBehavior.this.ah$b.ah$a(this.ah$a);
            }
        }
    }

    private void values(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (toString(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.5
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(View view2, AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z = false;
                    if (SwipeDismissBehavior.this.toString(view2)) {
                        boolean z2 = ViewCompat.getLayoutDirection(view2) == 1;
                        if ((SwipeDismissBehavior.this.HaptikSDK$a == 0 && z2) || (SwipeDismissBehavior.this.HaptikSDK$a == 1 && !z2)) {
                            z = true;
                        }
                        int width = view2.getWidth();
                        if (z) {
                            width = -width;
                        }
                        ViewCompat.offsetLeftAndRight(view2, width);
                        view2.setAlpha(0.0f);
                        if (SwipeDismissBehavior.this.ah$b != null) {
                            SwipeDismissBehavior.this.ah$b.ah$a(view2);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    static float toString(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int toString(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public int values() {
        ViewDragHelper viewDragHelper = this.invoke;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }
}

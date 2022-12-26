package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
/* loaded from: classes6.dex */
public class ViewHierarchyUtil {
    public static Pair<View, Integer> getDeepestLeaf(View view) {
        LinkedList linkedList = new LinkedList();
        Pair<View, Integer> pair = new Pair<>(view, 1);
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair<View, Integer> pair2 = (Pair) linkedList.poll();
            if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            if (pair2.first instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) pair2.first;
                int intValue = ((Integer) pair2.second).intValue();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(i), Integer.valueOf(intValue + 1)));
                }
            }
        }
        return pair;
    }
}

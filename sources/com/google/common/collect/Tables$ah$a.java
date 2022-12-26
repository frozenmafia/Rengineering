package com.google.common.collect;

import o.getUnfilteredChildAt;
import o.recycleUpdateOp;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class Tables$ah$a<R, C, V> implements getUnfilteredChildAt.valueOf<R, C, V> {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getUnfilteredChildAt.valueOf) {
            getUnfilteredChildAt.valueOf valueof = (getUnfilteredChildAt.valueOf) obj;
            return recycleUpdateOp.values(getRowKey(), valueof.getRowKey()) && recycleUpdateOp.values(getColumnKey(), valueof.getColumnKey()) && recycleUpdateOp.values(getValue(), valueof.getValue());
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(getRowKey(), getColumnKey(), getValue());
    }

    public String toString() {
        String valueOf = String.valueOf(getRowKey());
        String valueOf2 = String.valueOf(getColumnKey());
        String valueOf3 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(")=");
        sb.append(valueOf3);
        return sb.toString();
    }
}

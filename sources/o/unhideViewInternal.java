package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes7.dex */
public final class unhideViewInternal {
    public static int toString(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <K, V> void toString(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void toString(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        valueOf(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void valueOf(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <E> void ah$a(refreshData<E> refreshdata, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(refreshdata.entrySet().size());
        for (refreshData$ag$a<E> refreshdata_ag_a : refreshdata.entrySet()) {
            objectOutputStream.writeObject(refreshdata_ag_a.getElement());
            objectOutputStream.writeInt(refreshdata_ag_a.getCount());
        }
    }

    public static <E> void ah$a(refreshData<E> refreshdata, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        values(refreshdata, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void values(refreshData<E> refreshdata, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            refreshdata.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void toString(requestTiles<K, V> requesttiles, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(requesttiles.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : requesttiles.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    public static <K, V> void valueOf(requestTiles<K, V> requesttiles, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ag$a(requesttiles, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void ag$a(requestTiles<K, V> requesttiles, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = requesttiles.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static <T> valueOf<T> ah$a(Class<T> cls, String str) {
        try {
            return new valueOf<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* loaded from: classes7.dex */
    public static final class valueOf<T> {
        private final Field ah$a;

        private valueOf(Field field) {
            this.ah$a = field;
            field.setAccessible(true);
        }

        public void ag$a(T t, Object obj) {
            try {
                this.ah$a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public void values(T t, int i) {
            try {
                this.ah$a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}

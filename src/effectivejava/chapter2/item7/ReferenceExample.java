package effectivejava.chapter2.item7;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {
    public static void main(String[] args) {
        // 创建一个强引用对象
        Object strongObj = new Object();
        System.out.println("Strong Reference Object: " + strongObj);

        // 创建一个软引用对象
        Object softObj = new Object();
        SoftReference<Object> softRef = new SoftReference<>(softObj);
        System.out.println("Soft Reference Object: " + softRef.get());

        // 创建一个弱引用对象
        Object weakObj = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(weakObj);
        System.out.println("Weak Reference Object: " + weakRef.get());

        // 创建一个虚引用对象
        Object phantomObj = new Object();
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        PhantomReference<Object> phantomRef = new PhantomReference<>(phantomObj, queue);
        System.out.println("Phantom Reference Object: " + phantomRef.get());

        // 触发垃圾回收器回收对象
        strongObj = null;
        softObj = null;
        weakObj = null;
        phantomObj = null;
        System.gc();

        // 等待一段时间，以便垃圾回收器完成回收操作
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出引用对象是否被回收
        System.out.println("Strong Reference Object is null: " + (strongObj == null));
        System.out.println("Soft Reference Object is null: " + (softRef.get() == null));
        System.out.println("Weak Reference Object is null: " + (weakRef.get() == null));
        System.out.println("Phantom Reference Object is null: " + (phantomRef.get() == null));
    }
}
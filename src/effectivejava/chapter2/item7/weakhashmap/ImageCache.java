package effectivejava.chapter2.item7.weakhashmap;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

// 案例：缓存图片
// 使用 WeakHashMap 存储图片和图片的名称之间的映射关系
public class ImageCache {

    private Map<String, SoftReference<Bitmap>> cacheMap = new WeakHashMap<>();

    public Bitmap get(String key) {
        SoftReference<Bitmap> reference = cacheMap.get(key);
        if (reference != null) {
            Bitmap bitmap = reference.get();
            if (bitmap != null) {
                return bitmap;
            }
        }
        return null;
    }

    public void put(String key, Bitmap value) {
        cacheMap.put(key, new SoftReference<>(value));
    }

    public void clear() {
        cacheMap.clear();
    }
}

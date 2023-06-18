package effectivejava.chapter2.item7.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

// 案例一：缓存系统
// 使用 WeakHashMap 存储缓存键值对
public class Cache {

    private Map<String, Object> cacheMap = new WeakHashMap<>();

    public Object get(String key) {
        return cacheMap.get(key);
    }

    public void put(String key, Object value) {
        cacheMap.put(key, value);
    }

    public void clear() {
        cacheMap.clear();
    }
}


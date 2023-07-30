package effectivejava.chapter4.item20;

interface Singer {
    void sing();
}

interface Songwriter {
    void writeSongs();
}
// 骨架实现类，实现 Singer 和 Songwriter 接口,模拟多重继承的案例。
public abstract class SingerSongwriter {
    // Singer 接口的实现委托给 singerDelegate 对象
    private final Singer singerDelegate = new Singer() {
        @Override
        public void sing() {
            // 调用子类实现的 actuallySing 方法
            SingerSongwriter.this.actuallySing();
        }
    };

    // Songwriter 接口的实现委托给 songwriterDelegate 对象
    private final Songwriter songwriterDelegate = new Songwriter() {
        @Override
        public void writeSongs() {
            // 调用子类实现的 actuallyWriteSongs 方法
            SingerSongwriter.this.actuallyWriteSongs();
        }
    };

    // 返回一个 Singer 接口的实现对象
    public Singer asSinger() {
        return singerDelegate;
    }

    // 返回一个 Songwriter 接口的实现对象
    public Songwriter asSongwriter() {
        return songwriterDelegate;
    }

    // 由子类实现具体的唱歌逻辑
    public abstract void actuallySing();

    // 由子类实现具体的写歌逻辑
    public abstract void actuallyWriteSongs();
}


// 实现 SingerSongwriter 类，并实现其抽象方法
 class BobDylan extends SingerSongwriter {
    @Override
    public void actuallySing() {
        System.out.println("Bob Dylan is singing"); // Bob Dylan 唱歌
    }

    @Override
    public void actuallyWriteSongs() {
        System.out.println("Bob Dylan is writing songs"); // Bob Dylan 写歌
    }
}

 class Example {
    public static void main(String[] args) {
        BobDylan bob = new BobDylan(); // 创建 BobDylan 对象
        bob.asSinger().sing(); // 调用 Singer 接口的方法
        bob.asSongwriter().writeSongs(); // 调用 Songwriter 接口的方法
    }
}
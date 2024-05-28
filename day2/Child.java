public class Child {

    private static ThreadLocal<Child> threadLocal = new ThreadLocal<>();

    private static Child child;

    private Child() {
    }


//    public static synchronized Child getInstance() {
//        return child;
//    }
//
//    public static synchronized Child getInstance2() {
//        // 双重检查锁定
//        if (child == null) {
//            synchronized (Child.class) {
//                if (child == null) {
//                    child = new Child();
//                }
//            }
//        }
//
//        return child;
//    }

    public static synchronized Child getInstance() {
        if (threadLocal.get() == null){
            synchronized (Child.class){
                if (child == null){
                    child = new Child();
                }
            }
            threadLocal.set(child);
        }

        return threadLocal.get();
    }


}

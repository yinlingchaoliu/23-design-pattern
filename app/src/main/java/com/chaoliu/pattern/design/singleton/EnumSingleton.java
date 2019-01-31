package com.chaoliu.pattern.design.singleton;

/**
 *
 * 枚举法式单例
 * @author chentong
 * 枚举默认线程安全
 * 防止反序列化重新创建新的对象
 *
 */
public enum  EnumSingleton {

    INSTANCE;

    public void doSomething(){
    }

    /**
     * 使用示例
     */
    public static class SingleDemo {
        public static void main(String[] args) {
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            singleton.doSomething();
        }
    }

}


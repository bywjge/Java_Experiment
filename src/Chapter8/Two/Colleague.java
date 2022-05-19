package Chapter8.Two;

public interface Colleague {// 中介者模式中的同事（Colleague）
        void giveMess(String mess);
        void receiverMess(String mess);
        void setName(String name);
        String getName();
}


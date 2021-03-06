package ch02.sec06;

public class NetworkDemo {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network tooter = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.new Member("Wilma");
            // 네트워크에 등록되지 않은 객체다.
            // 이 문제를 피하려면 생성자를 비공개로 만들어야 한다.
        fred.addFriend(wilma);

        Network.Member barney = tooter.enroll("Barney");
        fred.addFriend(barney);
        //Class 인스턴스 메서드인 toString()을 먼저 갔다가 members.toString()을 만나
        //members가 내부클래스인 Member의 리스트 이기 때문에, 내부클래스인 Member의 toString() 인스턴스 메스드를 수행한다.
        System.out.println(myFace);
            // 다른 네트워크에 속한 친구를 추가할 수 없게 하려면
            // belongsTo를 호출해야 한다.
        System.out.println(barney.belongsTo(myFace));
        System.out.println(barney.belongsTo(tooter));
    }
}

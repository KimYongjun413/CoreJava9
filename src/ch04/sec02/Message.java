package ch04.sec02;

import java.util.ArrayList;

/*
* clone 메서더는 오버라이드하기 복잡할 뿐만 아니라 필요한 경우도 드물다.
* 그러므로 마땅한 이유가 없다면 clone을 오버라이드하지 말아야 한다.
*
* clone 메서드의 목적은 객체의 '복제본(원본가 상태가 같은 별개의 객체)'을 만드는 것이다.
* 두 객체 중 하나의 상태를 변경하더라도 나머지 하나는 변하지 않는다.
* */
public class Message {
    private String sender;
    private ArrayList<String> recipients;
    private String text;

    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    public void setRecipients(ArrayList<String> recipients) {
        this.recipients = recipients;
    }

    // Message 클래스는 Cloneable이자 final이며, ArrayList.clone은 CloneNotSupportedException을 던지지 않는다.
    // 그러므로 이 구현에서는 CloneNotSupportedException이 일어날 수 없다.
    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients
                    = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients;
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}

package org.example;

public class House {

    // public final String location; // final은 상수이기에 항상 지정해준다
    // public final String location = "동대문구 이문동 12길"; // 변할 수 없는 수가 상수이다. 상수를 모방한 변수이다.
    public final String location; // 밑에서 지정해주면 값을 넣어주면 안된다.
    public String[] people; //여기서는 변수타입엳다가 배열을 붙인다
    public int color;

    //public House(String location, int color, String[] people) {
    public House(String location, int color, String ... people) { //...으로 하면 new String[]{"은교", "은수"}으로 아해도 됨
        // location = location; //이 값은 바로 위 location에 저장됨. 이름을 바꾸거나 해야한다
        this.location = location; //this는 현재 인스턴스를 가르킨다

        this.color = color;
        this.people = people;
    }
}

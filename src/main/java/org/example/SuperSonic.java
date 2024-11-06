package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SuperSonic {
    public static void main(String[] args) {

        // 기본 세팅
        Scanner inputvalue = new Scanner(System.in);

        // 가사 space 단위로 짜르기
        String lyrics = "언제든 Day and night Hit me hit me up Hit me hit me up now oh 네 맘속 Delight Show me right now yeah Show me right now woo Super Super Supersonic Supersonic uh Super Super Supersonic Supersonic uh By my side Show me right now yeah Show me oh Supersonic Heat and sweat 단숨에 후 세게 Blow We got that 이대로 Go with the flow 달라진 온도 차오른 설렘 Overload 자 지금부터 뛰어들어 Ready set you go";
        String[] splitlyr = lyrics.split(" ");

        // 이상한 가사 space 단위로 짜르기
        String errorlyrics = inputvalue.nextLine();
        String[] splitList = errorlyrics.split(" "); // 그냥 짜르기만 한 배열
        // 리스트화
        List<String> spliterrList = new ArrayList<>(Arrays.asList(splitList));




        // 이상한 문자 탐색
        for (String string : splitList) {
            // 스파소닉 가사 문자 개수
            for (String s : splitlyr) {
                // 문자열 탐색(가사에 없는 문자열을 탐색)
                if (string.equals(s)) {
                    spliterrList.remove(string); // 정상 문자 제거
                }
            }
        }
        // 이상만 문자만 추출
        String[] spliterr = spliterrList.toArray(String[]::new); // 이상한 문자 배열

        // 올바른 문자열 저장
        String[] CorrectText;

        // 이상한 문자열과 비슷한 문자열 검사 후 CorrectText에 출력 저장
        for (String string : spliterr) {
            System.out.print(string + "  -> ");
            for (String s : splitlyr) {
                
            }
            System.out.println();
        }

        // 올바른 배열 생성
        String[] Correctlyr;

        // correctlyr에 처음 splitList에 이상한 문자를 고친 문자로 바꿔서 저장


        // 출력!!
        ////////////  System.out.println(Correctlyr);

    }
}

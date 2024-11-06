package org.example;
import java.util.Scanner;

public class JinJaruGgaJaru {
    public static void main(String[] args){
        int count = 0;

        Scanner jingga = new Scanner(System.in);

        // 숫자 입력
        int n = jingga.nextInt();
        String remove = jingga.nextLine();

        //진짜루 가짜루 입력 입력
        String scanJin = jingga.nextLine();

        // 공백 기준으로 나누기
        String[] song = scanJin.split(" ");

        int countGga = 0;
        for(int j =0;j < n;j ++){
            if(song[j].equalsIgnoreCase("JinJaru")){
                //jinjaru 증감
                count++;
                countGga = 0;
            } else if(song[j].equalsIgnoreCase("GgaJaru")){
                if(countGga % 2 == 0){
                    countGga++;
                    count--;
                    if(j != n-1){
                        if(song[j+1].equalsIgnoreCase("GgaJaru")){
                            count++;
                        }
                    }

                }else if(countGga % 2 == 1){
                    countGga++;
                    count++;
                    if(j != n-1){
                        if(song[j+1].equalsIgnoreCase("GgaJaru")){
                            count--;
                        }
                    }

                }
            }
        }


        System.out.println(count);

        jingga.close();
    }
}
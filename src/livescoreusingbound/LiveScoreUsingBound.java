/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingbound;

import java.util.Scanner;

/**
 *
 * @author kotchanika
 */
public class LiveScoreUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean livescore = new LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Subscriber sub3 = new Subscriber();
        livescore.addPropertyChangeListener(sub1);
        livescore.addPropertyChangeListener(sub2);
        livescore.addPropertyChangeListener(sub3);
        String scoreLine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while(!scoreLine.equals("")){
            livescore.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
    }
}


/**
 * Write a description of class problemset3b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class problemset3b {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        System.out.print("You:");
        String response = scr.nextLine();
        response = response.toLowerCase();
        String playerchoice;

        int stringlength = response.length();
        int find = response.lastIndexOf(".");
        int winner;
        

        playerchoice = response.substring(find+1,response.length());
        System.out.println(playerchoice);

        if(stringlength < 50){
            if(playerchoice.equals("rock")){
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose PAPER!");
                System.out.println(result(1));
            }
            else if(playerchoice.equals("paper")){
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose CROSSBLADES!");
                System.out.println(result(1));
            }
            else if(playerchoice.equals("crossblades")){
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose ROCK!");
                System.out.println(result(1));
            }
            else {
                System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
                System.out.println(result(1));
            }
        }
        if(stringlength > 50){

            if(playerchoice.equals("rock") && computerchoice().equals("crossblades")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(0));
            }
            else if(playerchoice.equals("paper") && computerchoice().equals("rock")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());
                System.out.println(result(0));
            }
            else if(playerchoice.equals("crossblades") && computerchoice().equals("paper")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(0));
            }
            else if(playerchoice.equals("rock") && computerchoice().equals("paper")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(1));
            }
            else if(playerchoice.equals("paper") && computerchoice().equals("crossblades")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(1));
            }
            else if(playerchoice.equals("crossblades") && computerchoice().equals("rock")){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(1));
            }
            else if(playerchoice.equals(computerchoice())){
                System.out.println("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + computerchoice());

                System.out.println(result(2));
            }
            else {
                System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
                System.out.println(result(1));
            }
        }
    }

    public static String computerchoice(){
        int choice = (int) (Math.random()*2);
        String computerchoice;
        if(choice == 0){
            computerchoice = "rock";
            return "rock";
        }
        else if(choice == 1){
            computerchoice = "paper";
            return "paper";
        }
        else {
            computerchoice = "crossblades";
            return "crossblades";
        }

    }

    public static String result(int winner){
        if(winner == 0){
            return "Result: You have won this time.";
        }
        else if(winner == 1){
            return "Result: As I predicted, I have won this battle. The kingdom is MINE!";
        }
        else {
            return "Result: Unbelievable! We have tied! *Eye twitches*";
        }
    }

}

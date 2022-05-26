package problems.daily_problems.problem_10__pending;

import java.util.Timer;

public class Problem10 {

    /*

    Implement a job scheduler which takes in a function f
    and an integer n, and calls f after n milliseconds.

     */

    //ref:- https://www.youtube.com/watch?v=2NasuwQaQes

    public static void main(String[] args) {

    solution(new command() {
        @Override
        public void execute() {
            System.out.println("Hello World");
        }
    },1000);


    solution(()-> System.out.println("Hello World"), 5000);

    }

    private static void solution(command command, int i)
    {
        Timer timer = new Timer();


        timer.schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                command.execute();
            }
        },                                               i);

    }

    interface command{
        void execute();
    }


}

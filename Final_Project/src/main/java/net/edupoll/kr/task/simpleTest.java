package net.edupoll.kr.task;

import java.text.SimpleDateFormat;

public class simpleTest {
    

    public void printTime()
    {
        System.out.println("task executed..");
    }

    public void printAnyThing()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        String time = sdf.format(System.currentTimeMillis());
        System.out.println(time + "task excuted..");
    }
}

package com.senacor.devcon.schedule.printer;

import com.senacor.devcon.schedule.Schedule;

public class ConsolePrinter implements SchedulePrinter {

    @Override
    public void print(Schedule schedule) {
        System.out.println(schedule.toString());
    }
}

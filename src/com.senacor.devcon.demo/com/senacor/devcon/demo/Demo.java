package com.senacor.devcon.demo;

import com.senacor.devcon.schedule.Schedule;
import com.senacor.devcon.schedule.printer.ConsolePrinter;
import com.senacor.devcon.schedule.printer.SchedulePrinter;

import java.io.Console;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by mblume on 11.06.17.
 */
public class Demo {

    public static void main(String[] args){
        Schedule schedule = Schedule.create();
        new ConsolePrinter().print(schedule);
    }
}

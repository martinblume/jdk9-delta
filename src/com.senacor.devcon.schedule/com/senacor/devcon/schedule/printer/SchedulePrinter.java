package com.senacor.devcon.schedule.printer;

import com.senacor.devcon.schedule.Schedule;

/**
 * Prints instances of {@link com.senacor.devcon.schedule.Schedule}.
 */
public interface SchedulePrinter {

    void print(Schedule schedule);
}

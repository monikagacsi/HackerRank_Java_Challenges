package com.hackerrank;

import javax.xml.transform.Result;
import java.io.*;
import java.util.Calendar;
import java.util.Locale;

public class JavaDateAndTime {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

        public static String findDay(int month, int day, int year) {
            Calendar myCalendar = Calendar.getInstance();
            myCalendar.set(Calendar.MONTH,month-1);
            myCalendar.set(Calendar.DAY_OF_MONTH,day);
            myCalendar.set(Calendar.YEAR,year);
            String dayOfWeek = myCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
            return dayOfWeek;


        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


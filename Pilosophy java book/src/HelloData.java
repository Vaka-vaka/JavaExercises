/*
 *Java
 *
 *@autor Valentin Mozul
 *@version from 15.09.2021
 */

import java.text.*;
import java.util.*;

public class HelloData {

    public static void main(String[] args) {
        System.out.println("Hello, today - " + new SimpleDateFormat
                ("dd.MM.yyyy").format(new Date()) + " :)");
    }
}

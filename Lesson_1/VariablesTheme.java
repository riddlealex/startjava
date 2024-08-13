class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера\n");

        byte cores = 8; // количество ядер
        short ram = 16; // объем оперативной памяти в ГБ
        int hdd = 512; // объем жесткого диска в ГБ
        long cpuFrequency = 3500L; // частота процессора
        float temperature = 45.5f; // температура процессора
        double batteryLife = 10.5; // время работы от батареи в часах

        System.out.println("Количество ядер: " + cores);
        System.out.println("Оперативная память: " + ram + " ГБ");
        System.out.println("Объем жесткого диска: " + hdd + " ГБ");
        System.out.println("Частота процессора: " + cpuFrequency + " МГц");
        System.out.println("Температура процессора: " + temperature + " °C");
        System.out.println("Время работы от батареи: " + batteryLife + " часов");

        // Задание 2: Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;

        double totalPrice = penPrice + bookPrice;
        double discountAmount = totalPrice * discount;
        double priceWithDiscount = totalPrice - discountAmount;

        System.out.println("Стоимость товаров без скидки: " + totalPrice + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + priceWithDiscount + " руб.");

        // Задание 3: Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        // Задание 4: Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        System.out.println("byte: " + byteValue);
        System.out.println("byte после инкремента: " + (++byteValue));
        System.out.println("byte после декремента: " + (--byteValue));

        System.out.println("short: " + shortValue);
        System.out.println("short после инкремента: " + (++shortValue));
        System.out.println("short после декремента: " + (--shortValue));

        System.out.println("int: " + intValue);
        System.out.println("int после инкремента: " + (++intValue));
        System.out.println("int после декремента: " + (--intValue));

        System.out.println("long: " + longValue);
        System.out.println("long после инкремента: " + (++longValue));
        System.out.println("long после декремента: " + (--longValue));

        // Задание 5: Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        // С помощью третьей переменной
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Перестановка с третьей переменной: a = " + a + ", b = " + b);

        // С помощью арифметических операций
        a = 2; // восстанавливаем начальные значения
        b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Перестановка с арифметическими операциями: a = " + a + ", b = " + b);

        // С помощью побитовой операции ^
        a = 2; // восстанавливаем начальные значения
        b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Перестановка с побитовой операцией: a = " + a + ", b = " + b);

        // Задание 6: Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");
        char dollar = 36;
        char asterisk = 42;
        char atSign = 64;
        char pipe = 124;
        char tilde = 126;

        System.out.println((int)dollar + " - " + dollar);
        System.out.println((int)asterisk + " - " + asterisk);
        System.out.println((int)atSign + " - " + atSign);
        System.out.println((int)pipe + " - " + pipe);
        System.out.println((int)tilde + " - " + tilde);

        // Задание 7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openBracket + " " + closeBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        // Задание 8: Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа\n");
        int number = 543;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        System.out.printf("Число %d содержит:\n", number);
        System.out.printf("  сотен - %d\n", hundreds);
        System.out.printf("  десятков - %d\n", tens);
        System.out.printf("  единиц - %d\n", units);
        System.out.printf("Сумма разрядов = %d\n", sum);
        System.out.printf("Произведение разрядов = %d\n", product);

        // Задание 9: Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
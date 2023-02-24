package Section_6_Control_Flow.CodingExercise_13_to_29.Ex_29_PaintJob;

public class Main {
    public static void main(String[] args) {

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));

        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}

/*
Paint Job
Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many
buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also
knows the area that he can cover with one bucket of paint.

1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double.
This parameter represents the width of the wall.

The second parameter should be named height of type double. This parameter represents the height of the wall.

The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one
bucket of paint.

The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going
to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the
method needs to return -1 to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.



Examples of input/output:

getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid

getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of
1.5 and Bob has 2 extra buckets home.

getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area
of 2.5 and Bob has 1 extra bucket at home.





2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.

Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket
(all of type double).

This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before
going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to
indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.



Examples of input/output:

getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid

getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area
of 1.5.

getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an
area of 2.35.



3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you
to write another method.

Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type
double).

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before
going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an
invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.



Examples of input/output:

getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area
of 0.75 .

Do your best to help Bob .



NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before
returning the value from the methods.

NOTE: All methods should be defined as public static like we have been doing so far in the course.

NOTE: Do not add the main method to the solution code.

***************************************TRANSLATE TO UKRAINIAN********************************************************************

Фарбування стін

Боб є майстром по фарбуванню стін і він потребує вашої допомоги. Вам потрібно написати програму, яка допоможе
Бобу розрахувати, скільки відра фарби йому потрібно купити перед роботою. Також у Боба можуть бути додаткові
відра вдома. Він також знає площу, яку можна покрити одним відром фарби.

1)
Напишіть метод з назвою getBucketCount з 4 параметрами. Перший параметр повинен мати назву width типу double.
Цей параметр представляє ширину стіни.
Другий параметр повинен мати назву height типу double. Цей параметр представляє висоту стіни.

Третій параметр повинен мати назву areaPerBucket. Цей параметр представляє площу, яку можна покрити одним відром фарби.

Четвертий параметр повинен мати назву extraBuckets. Цей параметр представляє кількість відер, які є у Боба вдома.

Метод повинен повернути значення типу int, яке представляє кількість відер, які Боб повинен купити перед тим,
як розпочати роботу. Для розрахунку кількості відер дивіться нотатки нижче.

Якщо один з параметрів width, height або areaPerBucket менший або рівний 0, або extraBuckets менше 0, метод повинен
повернути -1, щоб позначити недійсне значення.

Якщо всі параметри дійсні, метод повинен розрахувати кількість відер та повернути її.

Приклади вводу/виводу:
getBucketCount(-3.4, 2.1, 1.5, 2); → повинно повернути -1, оскільки параметр ширини є недійсним

getBucketCount(3.4, 2.1, 1.5, 2); → повинно повернути 3, оскільки площа стіни становить 7.14, один відро може покрити
площу 1.5, а Боб має 2 додаткових відра вдома.

getBucketCount(2.75, 3.25, 2.5, 1); → повинно повернути 3, оскільки площа стіни становить 8.9375, один відро може
покрити площу 2.5, а Боб має 1 додаткове відро вдома.

2)
Боб не хоче вводити 0 для параметра extraBuckets, тому йому потрібен ще один метод.
Напишіть ще один перевантажений метод з назвою getBucketCount з трьома параметрами: width, height і areaPerBucket
(всі типу double).

Цей метод повинен повернути значення типу int, яке представляє кількість відра, які Боб повинен купити до того,
як піти на роботу. Для обчислення кількості відер дивіться нижче нотатки.

Якщо один з параметрів width, height або areaPerBucket менше або дорівнює 0, метод повинен повернути -1, щоб
показати недійсне значення.

Якщо всі параметри є дійсними, метод повинен обчислити кількість відер і повернути її.

Приклади введення / виведення:

getBucketCount(-3.4, 2.1, 1.5); → повинно повернути -1, оскільки параметр width є недійсним

getBucketCount(3.4, 2.1, 1.5); → повинно повернути 5, оскільки площа стіни складає 7,14, а одне відро може
покрити площу 1,5.

getBucketCount(7.25, 4.3, 2.35); → повинно повернути 14, оскільки площа стіни складає 31,175, а одне відро може
покрити площу 2,35.

3)
У деяких випадках Боб не знає ширини і висоти стіни, але знає її площу. Він потребує, щоб ви написали
ще один метод.
Напишіть ще один перевантажений метод з назвою getBucketCount з двома параметрами: площею та areaPerBucket
(обидва типу double).

Метод повинен повернути значення типу int, яке представляє кількість відра, які Боб повинен купити, перш ніж
йти на роботу. Для розрахунку кількості відра, дивіться нотатки нижче.

Якщо один з параметрів площі або areaPerBucket менше або дорівнює 0, метод повинен повернути -1, щоб
показати недійсне значення.

Якщо всі параметри дійсні, метод повинен розрахувати кількість відра та повернути її.

Приклади введення/виведення:

getBucketCount(3.4, 1.5); → повинен повернути 3, оскільки площа становить 3.4, а одне відро може покрити площу 1.5

getBucketCount(6.26, 2.2); → повинен повернути 3, оскільки площа стіни становить 6.26, а одне відро може покрити площу 2.2.

getBucketCount(3.26, 0.75); → повинен повернути 5, оскільки площа стіни становить 3.26, а одне відро може покрити площу 0.75 .

Робіть все можливе, щоб допомогти Бобу.

ПРИМІТКА: Використовуйте метод Math.ceil для округлення кількості розрахованих відер (double), потім конвертуйте її в int перед
поверненням значення методів.

ПРИМІТКА: Усі методи повинні бути визначені як public static, як ми робили до цього в курсі.

ПРИМІТКА: Не додавайте головний метод до рішення.


*/
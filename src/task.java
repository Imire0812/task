Задача
Дано трехзначное число. Найдите сумму его цифр.
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите трехзначное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int m = 1;
        
        for (int i = 0; i<3; i++) {
        
        s += (n % 10);
        n /= 10;
        }
        
        System.out.println(s);
        
        
    }
}
Задача
Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        r=n-n%2+2;
        
        System.out.println(r);
        
        
    }
}

Задача
Дано число n. С начала суток прошло n минут. Определите, сколько часов и минут будут показывать электронные часы в этот момент. Программа должна вывести два числа: количество часов (от 0 до 23) и количество минут (от 0 до 59). Учтите, что число n может быть больше, чем количество минут в сутках.
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a; 
        int b;
        int c;
        
        a = n/(60*24); //сутки
        b = (n/60)-((a*24)*60);//часы
        c = n-((b*60)+((a*24)*60));//минуты
        
        System.out.println("Сутки "+a+ ";" + "часы " +b+ ";" + " минуты " + c+ ".");
        
        
    }
}

Задача.
Напишите программу, которая считывает значения двух целочисленных переменных a и b, затем меняет их значения местами (то есть в переменной a должно быть записано то, что раньше хранилось в b, а в переменной b записано то, что раньше хранилось в a). Затем выведите значения переменных.
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число b: ");

        int b = sc.nextInt();
        
        int c; 
        
        c = a;
        a = b;
        b = c;
        
        System.out.println(a + " ; " + b);
        
        
    }
}

Задача.
В некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут. Определите, когда заканчивается указанный урок.
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число от 1 до 12: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int a = 540 + s*45+(s/2)*5+((s-1)/2)*15;
        int m = a%60;
        int h = a/60;
        
        
        System.out.println(h + ":" + m);
        
        
    }
}

 Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите цену через пробел: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Введите колличество пирожков: ");
        int n = sc.nextInt();
        
        int m = a*n + (b*n)/100;
        int h = (b*n)%100;
        
        
        System.out.println(m + "." + h +" " + n + " пирожки");
        
        
    }
}


Задача. 
Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из моментов времени. Известно, что второй момент времени наступил не раньше первого. Определите, сколько секунд прошло между двумя моментами времени.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите цифры через пробел: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
                
        int m = (s2-s1)+(((m2-m1)+((h2-h1)*60))*60);
        
        System.out.println("sek: "+m);
        
    }
}


Задача

За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут длиной m километров?

При решении этой задачи нельзя пользоваться условной инструкцией if и циклами.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите цифры через пробел: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        
        int m=((s1-1)/s2)+1;
        
        System.out.println("vrema: "+m);
        
    }
}
Задача
 n школьников делят k яблок “поровну”, то есть так, чтобы количество яблок, доставшихся любым двум школьникам, отличалось бы не более, чем на 1. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Колличество яблок: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        System.out.println("Колличество школьников: "); 
        int s2 = sc.nextInt();
        
        int a = s1/s2;
        int b= s1-a*s2;
        int x = (s2 - b)%s2;
        
        System.out.println(x);
        
    }
}


Задача
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа 3 шт: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int h1 = h-a;
        int b1 = a-b;
        int s = (b1 - h1%b1)%b1;
        int d = 1 + (h1+s)/b1;
        System.out.println(d);
        
    }
}

Задача. 
 Дано четырехзначное число. Определите, является ли его десятичная запись симметричной. Если число симметричное, то выведите 1, иначе выведите любое другое целое число. Число может иметь меньше четырех знаков, тогда нужно считать, что его десятичная запись дополняется слева незначащими нулями.

При решении этой задачи нельзя пользоваться условной инструкцией if и циклами :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int d = (((n / 1000) - (n % 10)) * ((n / 1000) - (n % 10))) + (((n / 100 % 10) - (n / 10 % 10)) * ((n / 100 % 10) - (n / 10 % 10)))+ 1;
        System.out.println(d);
        
    }
}
Задача
 Даны два натуральных числа n и m. Если одно из них делится на другое нацело, выведите 1, иначе выведите любое другое целое число.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int d = ((n / m) +(n % m)*(m % n)+(m / n))/((n / m)+ (m / n));
        System.out.println(d);
        
    }
}


Задача
Напишите программу, которая считывает два целых числа a и b и выводит наибольшее значение из них. Числа — целые от 1 до 1000.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int d = ((((n / m))*n)+(((m / n))*m))/(((n / m))+((m / n)));;
        System.out.println(d);
        
    }
}
22 задачи, перехожу к следующему блоку



Задача
 Входные данные
Даны два целых числа, каждое число записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a<b) {
            System.out.println(b);
        }else {
            System.out.println(a);
        }
            
    }
}


Задача
Требуется определить, является ли данный год високосным. (Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)

Входные данные
Вводится единственное число - номер года (целое, положительное, не превышает 30000).

Выходные данные
Требуется вывести слово YES, если год является високосным и NO - в противном случае.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a%400==0) {
            System.out.println("Yes");
        } else if (a%4==0 && a%100!=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
            
    }
}
Задача
В условии одной из задач на этом сайте написано: “Если данное четырехзначное число является симметричным, выведите 1, иначе выведите любое другое целое число”. Для проверки задачи используются заранее подготовленные примеры и правильные ответ на них

Школьнику кажется, что он решил эту задачу, но тестирующая система почему-то не принимает его решение. Школьник думает, что это происходит оттого, что он выводит не то любое другое число, которое записано в правильных ответах.

Напишите программу, которая по ответу, записанному в тестирующей системе и по ответу школьника определяет, верно ли школьник решил задачу.

Входные данные
Программа получает на вход два числа: ответ, записанный в тестирующей системе и ответ школьника.

Выходные данные
Программа должна вывести YES, если школьник дал верный ответ и NO в противном случае.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if ((n1!=1 && n2!=1) || (n1 == 1 && n2 ==1)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
            
    }
}
Задача
В математике функция sign(x) (знак числа) определена так: 
sign(x) = 1,   если x > 0, 
sign(x) = -1, если x < 0, 
sign(x) = 0,   если x = 0.

Для данного числа x выведите значение sign(x).:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        
        if (n1<0) {
            System.out.println(-1);
        }else if(n1>0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
            
    }
}
Задача
 Входные данные
Даны два целых числа, каждое записано в отдельной строке.

Выходные данные
Программа должна вывести число 1, если первое число больше второго, число 2, если второе больше первого, или число 0, если они равны.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if (n1>n2) {
            System.out.println(1);
        }else if (n1<n2) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
        
            
    }
}


Задача
Входные данные
Даны три целых числа, каждое записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).:comet:
Решение 1
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int answer = Math.max(Math.max(n1, n2), Math.max(n3, n3));
        System.out.println(answer);
            
    }
}
Решение 2
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int x=0;
        
        if ((n1<n2) && (n1<n3)){
            System.out.println(n1+" Наименьшее");
            } else if((n2 < n1) && (n2 < n3)){
                System.out.println(n2+" Наименьшее");
                }else if ((n3 < n1)&&(n3 < n2)) {
                    System.out.println(n3+" Наименьшее");
                    }
            
    }
}
Задача
Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int dx = x1-x2;
        int dy = y1-y2;
        
        if (dx < 0)
            dx = dx - dx;
        
        if (dy < 0)
            dy = dx - dy;
        
        if (x1 == x2 || y1 ==y2 || dx == dy) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
}
}


Задача
:comet: Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        if (k <= m*n && (k%n == 0 || k % m == 0)) {
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
}
}


В каждую крайнюю клетку квадратной доски поставили по фишке. Могло ли оказаться, что выставлено ровно k фишек? (Например, если доска 22, то выставлено 4 фишки, а если 66 - то 20).

Входные данные
Вводится одно натуральное число k, не превосходящее 30000

Выходные данные
Программа должна вывести слово YES, если существует такой размер доски, на который будет выставлено ровно (не больше, и не меньше) k фишек, в противном случае - вывести слово NO. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                
        if (n<4) {
            System.out.println("очень мало фишек");
        } else if (n % 4 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
}
}

Задача
:comet: Решить в целых числах уравнение ax + b = 0.

Входные данные
Вводятся 2 целых числа: a и b. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x=-b/a;
        if (b <= 0) {
            System.out.println("пш пш пш");
        }else {
            System.out.println(x);
        }
        
}
}


Задача
:comet: Решить в целых числах уравнение ( ax + b ) : ( cx + d ) = 0.

Входные данные
Вводятся 4 числа: a, b, c и d; c и d не равны нулю одновременно.

Выходные данные
Необходимо вывести все решения, если их число конечно, “NO” (без кавычек), если решений нет, и “INF” (без кавычек), если решений бесконечно много.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (c==0 || d==0) {
            System.out.println("no");
        } else if (a==0 || b==0) {
            System.out.println("inf");
        } else if (a==0) {
            System.out.println("no");
        } else if (c==0) {
            System.out.println(-b/a);
        } else if ((b/a)==(d/c)) {
            System.out.println("no");
        } else {
            System.out.println(-b/a);
        }
}
}


Задача. 
:comet: Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?

Входные данные
Вводятся 4 числа: a, b, c и d.

Выходные данные
Необходимо вывести 2 числа: e и f, число рублей и копеек, соответственно. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int e = (100*c+d-100*a)/100;
        int f = (100*c +d-100*a-b)%100;
        
        if (a<=0 || b <= 0) {
            System.out.println("Noooooo");
        } else {
            System.out.println(e + " руб." + f + " коп.");
        }
}
}


Задача
:comet: В кафе мороженое продают по три шарика и по пять шариков. Можно ли купить ровно k шариков мороженого?

Входные данные
Вводится число k (целое,положительное)

Выходные данные
Программа должна вывести слово YES, если при таких условиях можно набрать ровно k шариков (не больше и не меньше), в противном случае - вывести NO. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        if (k<3||k==4||k==7) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
}
}


Задача
:comet: На сковородку одновременно можно положить k котлет. Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно. За какое наименьшее время удастся поджарить с обеих сторон n котлет?

Входные данные
Вводятся 3 числа: k, m и n. Все числа не превосходят 32000.

Выходные данные
Вывести время, за которое все котлеты будут обжарены. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        if (n<=k) {
            System.out.println(m*(n*2/k));
        } else if ((n*2%k)==0) {
            System.out.println(m*(n*2/k));
        } else {
            System.out.println(m*(1+(n*2/k)));
        }
}
}
Задача
:comet: Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).

Входные данные
Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).

Выходные данные
Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if ((x1*x2>0) || (y2*y2>0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }    
}
}


Задача
:comet: Входные данные
Даны три натуральных числа a, b, c, записанные в отдельных строках. Определите, существует ли неворожденный треугольник с такими сторонами.

Выходные данные
Если треугольник существует, выведите строку YES, иначе выведите строку NO. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a+b>c)||(a+c>b)||(b+c>a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
            
}
}



Задача
:comet: Входные данные
Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.

Выходные данные
Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = 0;
        
        if (a==b && a==c && b==c) {
            System.out.println('3');
        } else if (a!=b && a!=c && b!=c) {
            System.out.println('0');
        } else {
            System.out.println('2');
        }
}
}


Задача
:comet: Даны действительные числа a, b, c. Найдите все решения квадратного уравнения ax2 + bx + c = 0.

Входные данные
Даны три действительных числа, a не равно 0.

Выходные данные
Выведите два действительных числа, если уравнение имеет два корня, одно действительное число – при наличии одного корня. При отсутствии действительных корней ничего выводить не нужно.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double r1 = ((-b-Math.sqrt(Math.sqrt(b)-4*a*c))/(2*a));
        double r2 = ((-b+Math.sqrt(Math.sqrt(b)-4*a*c))/(2*a));
        double r3 = (-b/(2*a));
        if ((Math.sqrt(b)-4*a*c)>0) {
            System.out.println(r1+ " " + r2); 
        } else if (Math.sqrt(b)-4*a*c==0) {
        System.out.println(r3);
        }
}
}



Задача
:comet: Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.

Входные данные
Даны три натуральных числа – стороны треугольника.

Выходные данные
Необходимо вывести одно из слов: right для прямоугольного треугольника, acute для остроугольного треугольника, obtuse для тупоугольного треугольника или impossible, если входные числа не образуют треугольника.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a>b+c)||(b>a+c)||(c>a+b)) {
            System.out.println("impossible");
        } else if ((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)) {
            System.out.println("right");
        } else if ((a*a>b*b+c*c)||(b*b>a*a+c*c)||(c*c>a*a+b*b)) {
            System.out.println("obtuse");
        }
}
}


Задача
:comet: По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений: "n коров", "n корова", "n коровы", правильно склоняя слово "корова".

Входные данные
Дано число n (n<100).

Выходные данные
Программа должна вывести введенное число n и одно из слов (на латинице): korov, korova или korovy, например, 1 korova, 2 korovy, 5 korov. Между числом и словом должен стоять ровно один пробел.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n%10==0 || (n%10>=5 && n%10<=9)||(n>=11 && n<=14)) {
            System.out.println(n + " коров");
        } else if (n%10==1) {
            System.out.println(n + " корова");
        } else {
            System.out.println(n + " коровы");
        }
        
}
}


Задача
:comet: Билет на одну поездку в метро стоит 15 рублей, билет на 10 поездок стоит 125 рублей, билет на 60 поездок стоит 440 рублей. Пассажир планирует совершить n поездок. Определите, сколько билетов каждого вида он должен приобрести, чтобы суммарное количество оплаченных поездок было не меньше n, а общая стоимость приобретенных билетов – минимальна.

Входные данные
Дано одно число n - количество поездок.

Выходные данные
Выведите три целых числа, равные необходимому количеству билетов на 1, на 10, на 60 поездок.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int y1=0; int y2=0; int y3=0;
        
        y3=x/60;
        x-=y3*60;
        
        if(x>=35) {
            y3++;
        } else {
            y2=x/10;
            x-=y2*10;
            if(x==9) {
                y2++;
            } else {
                y1=x;
            }
        }
        System.out.println(y1+" "+y2+" "+y3);
        
}
}

Задача
:comet: Для клетки с координатами (x, y) в таблице размером M × N выведите координаты ее соседей. Соседними называются клетки, имеющие общую сторону.

Входные данные
Даны натуральные числа M, N, x, y (1 ≤ x ≤ M ≤ 109, 1 ≤ y ≤ N ≤ 109).

Выходные данные
В выходной файл выведите пары координат соседей этой клетки в произвольном порядке.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        
        if (n>1) {
            if (y==1) {
                System.out.println(x + " " + (y+1));
            } else if (y==n) {
                System.out.println(x + " " + (y-1));
            } else {
                System.out.println(x + " " + (y-1));
                System.out.println(x + " " + (y+1));
            }
        }
        if (m>1) {
            if (x==1) {
                System.out.println((x+1) + " " + y);
            } else if (x==m) {
                System.out.println((x-1) + " " + y);
            }else {
                System.out.println((x-1) + " " + y);
                System.out.println((x+1) + " " + y);
            }
        }
}
}



Задача
:comet: Бизнесмен Василий после прочтения известной книги решил открыть новый бизнес – отгружать апельсины бочками. Партнерам важно знать сколько именно бочек апельсинов отгружается каждый день.

Мобильный телефон Василия поддерживает только транслит, поэтому он передает сообщения вида "N bochek" . Например, "3 bochki" или "1 bochka" .

Напишите программу, которая выбирает правильное слово (из "bochka" , "bochek" , "bochki" ) в зависимости от N.

Входные данные
Одно число N (0 ≤ N ≤ 1000).

Выходные данные
Фраза на транслите:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if (n%10==0 || (n%10>=5 && n%10<=9)||(n>=11 && n<=14)) {
            System.out.println(n + " bochek");
        } else if (n%10==1) {
            System.out.println(n + " bochka");
        } else {
            System.out.println(n + " bochki");
        }
        
}
}


Задача
:comet: Даны три целых числа A, B, C. Определить, есть ли среди них хотя бы одно четное и хотя бы одно нечетное.

Входные данные
Числа A, B, C, не превышающие по модулю 10000.

Выходные данные
Одна строка – "YES" или "NO". :comet:


	
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (((a % 2 == 0) ||(b % 2 ==0) || (c % 2 == 0)) && ((a % 2 == 1) || 
                (b % 2 == 1) || (c % 2 == 1))) {
            System.out.println("YES\n");
        } else {
            System.out.println("NO\n");
        }
        
}
}



Задача
:comet: Дано число X. Требуется перевести это число в римскую систему счисления.

Входные данные
Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).

Выходные данные
Выведите X в римской системе счисления.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int k1, k2;
        
        if (x == 100) {
            System.out.println("C");
        }
        
        k1 = x/10; 
        k2 = x%10;
        
        switch (k1) {
        case 1:
            System.out.println("X");
            break;
        case 2:
            System.out.println("XX");
            break;
        case 3:
            System.out.println("XXX");
            break;
        case 4:
            System.out.println("XL");
            break;
        case 5:
            System.out.println("L");
            break;
        case 6:
            System.out.println("LX");
            break;
        case 7:
            System.out.println("LXX");
            break;
        case 8:
            System.out.println("LXXX");
            break;
        case 9:
            System.out.println("XC");
            break;
        }
        switch (k2) {
        case 1:
            System.out.println("I");
            break;
        case 2:
            System.out.println("II");
            break;
        case 3:
            System.out.println("III");
            break;
        case 4:
            System.out.println("IV");
            break;
        case 5:
            System.out.println("V");
            break;
        case 6:
            System.out.println("VI");
            break;
        case 7:
            System.out.println("VII");
            break;
        case 8:
            System.out.println("VIII");
            break;
        case 9:
            System.out.println("IX");
            break;
        }
}
}


Задача
:comet: Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания. Программа должна считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.

Входные данные
Вводятся три числа, каждое записано в отдельной строке.

Выходные данные
Выведите ответ на задачу. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a>=b)&&(b>=c)) {
            System.out.println(a +"," + b + "," + c);
        } else if ((a>=c) && (c>=b)) {
            System.out.println(a +"," + c + "," + b);
        } else if ((b>=a)&&(a>=c)) {
            System.out.println(b +"," + a + "," + c);
        } else if ((b>=c) && (c>=a)) {
            System.out.println(b +"," + c + "," + a);
        } else if ((c>=a) && (a>=b)) {
            System.out.println(c +"," + a + "," + b);
        } else {
            System.out.println(c +"," + b + "," + a);
        }
    }}



Задача
:comet: Входные данные
Вводятся целые числа a и b. Гарантируется, что a не превосходит b

Выходные данные
Выведите (через пробел) все четные числа от a до b (включительно).:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = (a+1)/2; i*2<=b; ++i) {
            System.out.println(i*2);
        }
        
        
    }}


Задача
:comet: Входные данные
Вводятся 4 числа: a, b, c и d. 

Выходные данные
Выведите все числа на отрезке от a до b, дающие остаток c при делении на d. Если таких чисел не существует, то ничего выводить не нужно.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        for (int i=a; i<=b; i++) {
            if (i%d == c) {
                System.out.println(i+" ");
            }
        }
        
        
        
    }}



Задача 
:comet: Найдите самый маленький натуральный делитель числа x, отличный от 1 (2 <= x <= 30000).

Входные данные
Вводится натуральное число x.

Выходные данные
Выведите наименьший делитель числа x, отличный от 1. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i; 
        

        for (i=2; i<=x; i++) {
            if (x%i == 0) {
                System.out.println(i);
                break;
            }
        }
        
    }}


Задача
:comet: Выведите все натуральные делители числа x в порядке возрастания (включая 1 и само число).

Входные данные
Вводится натуральное число x

Выходные данные
Выведите все делители числа x :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i; 
        
        for (i=1; i<=x; i++) {
            if (x%i==0) {
                System.out.println(i + " ");
            }
        }
        
    }}



Задача
:comet: Подсчитайте количество натуральных делителей числа x (включая 1 и само число; x2109).

Входные данные
Вводится натуральное число x.

Выходные данные
Выведите единственное число - количество делителей числа x. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int k = sc.nextInt();
        
        for ( int i = 1; i <=x; i++) {
            if (x%i ==0) {
                System.out.println(k++);
            }
        }
        
    }}



Задача 
:comet: Вычислите сумму данных 100 натуральных чисел.

Входные данные
Вводятся 100 чисел, сумму которых необходимо посчитать.

Выходные данные
Программа должна вывести единственное число - полученную сумму. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите числа: ");
        int m = sc.nextInt();
        
        int sum = 1;
        
        for (int i = 0; i < n; i++) {
            sum += m;
        }
        System.out.println("Сумма чисел: " + sum);
        
    }}

Задача 
:comet: Входные данные
Вводятся 4 числа: a, b, c и d.

Выходные данные
Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000] и выведите их в порядке возрастания.  Если на данном отрезке нет ни одного решения, то ничего выводить не нужно.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите 4 числа: ");
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        int c = sr.nextInt();
        int d = sr.nextInt();
        int x;
        for (x=0; x < 1000; x++) {
            if ((a*x*x*x+b*x*x+c*x+d)<=1e-7) {
                System.out.println(x);
            }
        }
        
        
    }}



Задача
:comet: Выведите все точные квадраты натуральных чисел, не превосходящие данного числа N.

Входные данные
Задано единственное целое число N

Выходные данные
Необходимо вывести  все точные квадраты натуральных чисел, не превосходящие данного числа N.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.println("Введите числа: ");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        
        int value = 1;
        int curSqr = value*value;
        while (curSqr<=n) {
            value++;
            curSqr = value*value;
            System.out.println(curSqr);
        }
        
    }}


Задача
:comet: Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.:comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        if (n > 2) System.out.println(findDivisor(n));
    }
     
    
    public static int findDivisor (int n){
        for (int i = 2; i < Integer.MAX_VALUE; i++){
            if (n % i == 0) return i;
        }
        return 0;
        
    }}


Задача
:comet: По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.

Операцией возведения в степень пользоваться нельзя!

Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу. :comet:
import java.util.Scanner;

public class Test {
    public static void main(String[] args) { 
                
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=1;
        while (m<n) {
            System.out.println(m);
            m=m*2;
        }
        
    }}



Задача
:comet: Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.

Операцией возведения в степень пользоваться нельзя!:comet:
import java.util.Scanner;

public class Test {

    public static void f (int n) {
        
        if (n==2) {
            System.out.println("YES");
        } else if (n<2){
            System.out.println("NO");
        } else if (n>2) {
            f(n/2);
        }
        
    }
    public static void main(String[] args) { 
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            f(a);    
}}


Задача
:comet: По данному натуральному числу N выведите такое наименьшее целое число k, что 2k≥N.

Операцией возведения в степень пользоваться нельзя!

Входные данные
Вводится натуральное число N.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int p=1; 
        int k = 0;
        
        while (p < n) {
            p<<=1;
            k++;
        }
        
        System.out.println(k);
        
    }}



Задача
:comet: Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше. Определите, через сколько лет вклад составит не менее y рублей.

Входные данные
Программа получает на вход три натуральных числа: x, p, y.

Выходные данные
Программа должна вывести одно целое число.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = sc.nextInt();
        int y = sc.nextInt();
        int years = 0;
        
        while (x<y) {
            x *= (1+p/100.0);
            x *= 100;
            x = (int) x;
            x /= 100;
            years++;
        }
        System.out.println(years);
        
    }}


Задача
:comet: Последовательность Фибоначчи определяется так:

φ0=0,  φ1=1, ..., φn=φn-1+φn-2.

По данному числу n определите n-е число Фибоначчи φn.

Входные данные
Вводится натуральное число n. :comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
        
        int i = 2; int f1 = 0; int f2 = 1; int cur = 0;
        
            
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (i <= n) {
            cur = f1 + f2;
            f1 = f2;
            f2 = cur;
            i++;
        }
        
        if (n<=1) {
            System.out.println(n);
        } else {
            System.out.println(cur);

        }
        
    }}


Задача
:comet: Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является, то есть выведите такое число n, что φn=A. Если А не является числом Фибоначчи, выведите число -1.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
        
        int i = 1; int f1 = 0; int f2 = 1; int cur = 0;
        
            
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        while (cur < a) {
            cur = f1 + f2;
            f1 = f2;
            f2 = cur;
            i++;
        }
        
        if (cur == a) {
            System.out.println(i);
        } else {
            System.out.println(-1);

        }
        
    }}


Задача 
:comet: Исполнитель “Раздвоитель” преобразует натуральные числа. У него есть две команды: “Вычесть 1” и “Разделить на 2”, первая команда уменьшает число на 1, вторая команда уменьшает число в два раза, если оно чётное, иначе происходит ошибка.

Входные данные
Дано два натуральных числа A и B (A>B).

Выходные данные
Напишите алгоритм для Развоителя, который преобразует число A в число B и при этом содержит минимальное число команд. Команды алгоритма нужно выводить по одной в строке, первая команда обозначается, как -1, вторая команда как :2.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while (a>b) {
            if (a%2 ==0 && a/2 >=b) {
                System.out.println(":2");
                a /= 2;
            } else {
                System.out.println(-1);
                a--;
            }
        }


        
Задача
:comet: У исполнителя “Водолей” есть два сосуда, первый объемом A литров, второй объемом B литров, а также кран с водой. Водолей может выполнять следующие операции:

Наполнить сосуд A (обозначается >A).
Наполнить сосуд B (обозначается >B).
Вылить воду из сосуда A (обозначается A>).
Вылить воду из сосуда B (обозначается B>).
Перелить воду из сосуда A в сосуд B (обозначается как A>B).
Перелить воду из сосуда B в сосуд A (обозначается как B>A).
Команда переливания из одного сосуда в другой приводят к тому, что либо первый сосуд полностью опустошается, либо второй сосуд полность наполняется.

Входные данные
Программа получает на вход три натуральных числа A, B, N, не превосходящих 104.

Выходные данные
Необходимо вывести алгоритм действий Водолея, который позволяет получить в точности N литров в одном из сосудов, если же такого алгоритма не существует, то программа должна вывести текст Impossible.

Количество операций в алгоритме не должно превышать 105. Гарантируется, что если задача имеет решение, то есть решение, которое содержит не более, чем 105 операций.

Тесты к этой задаче закрытые. :comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        final double limit = 1e5 + 10;
        
        char min = 'A';
        char max = 'B';
        
        if (b > a) {
            a = min;
            b = max;
        }
        
        int bV = 0;
        int aV = 0;
        int k = 0;
        
        boolean real = false;
        
        do {
            k++;
            k++;
            
            if (b - bV >= a) {
                bV += a;
            } else {
                bV = a - (b - bV);
                k++;
                k++;
            }
            
            if (n == bV) {
                real = true;
                break;
            }
            
        } while (k <= limit);
        
        if (real) {
            bV = 0;
            do {
                System.out.println(min);
                System.out.println(min +", " + max);
                
                if (b - bV >= a) {
                    bV += a;
                } else {
                    bV = a - (b - bV);
                    System.out.println(max);
                    System.out.println(min + ", " + max);
                } 
                if (n == bV) {
                    break;
                }
                
            }  while (true);
        } else {
            System.out.println("Impossible");
        }
        
    }

}



Задача
:comet: Сумму всех целых чисел от 1 до 100 можно посчитать при помощи хитрого приема. Разобьем все числа по парам 1 и 100, 2 и 99, 3 и 98 и т.д. Сумма каждой пары 101. Пар всего 100 пополам (50). Поэтому сумма равна 2(1+100)100.

Для нечетного количества слагаемых работает та же формула: например, 1+2+3=2(1+3)3=6.

Входные данные
Одно целое число N. Гарантируется, что ответ "помещается" в тип int64 (Паскаль) / long long (в Си) / long (в Java).

Выходные данные
Одно число – сумма всех целых чисел от 1 до N.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        
        if (n >=1) {
            if (n%2 != 0) {
                res = (1 + n)/2 * n;
            }else {
                res = n/2 * (1 + n);
            }
        }else {
            if (n%2 != 0) {
                res = (1+n)/2*(Math.abs(n)+2);
            } else {
                res = (Math.abs(n) + 2)/2 * (1+n);
            }
        }
        System.out.println(res);
        
    }

}



Задача
:comet: Идёт k-я секунда суток. Определите, сколько целых часов h и целых минут m прошло с начала суток. Например, если

k=13257=33600+4060+57,

то h=3 и m=40.

Входные данные
На вход программе подается целое число k (0k86399).

Выходные данные
Выведите на экран фразу:

It is ... hours ... minutes.

Вместо многоточий программа должна выводить значения h и m, отделяя их от слов ровно одним пробелом. :comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h; 
        int m;
        
        s--;
        
        h = s/3600;
        m = (s % 3600)/60; 
        
        System.out.println("It is " + h + " hours " + m + " minutes.");
        
    }

}


Задача
:comet: Часовая стрелка повернулась с начала суток на d градусов. Определите, сколько сейчас целых часов h и целых минут m.

Входные данные
На вход программе подается целое число d (0d360).

Выходные данные
Выведите на экран фразу:

It is ... hours ... minutes.

Вместо многоточий программа должна выводить значения h и m, отделяя их от слов ровно одним пробелом. :comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h; 
        int m;
        
        m = d * 2;
        h = m / 60;
        m %= 60;
        
        System.out.println("It is " + h + " hours " + m + " minutes.");
        
    }

}


Задача
:comet: В книге на одной странице помещается k строк. Таким образом, на 1-й странице печатаются строки с 1-й по k-ю, на второй — с (k+1)-й по (2k)-ю и т. д. Напишите программу, по номеру строки в тексте определяющую номер страницы, на которой будет напечатана эта строка, и порядковый номер этой строки на странице.

Входные данные
На вход программе подаются число k — количество строк на странице и число n — номер строки в тексте (1k200, 1n20000).
Выходные данные
Выведите два числа — номер страницы, на которой будет напечатана эта строка, и номер строки на этой странице:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt(); 
        int p; 
        int l;
        
        p = (n - 1) / k + 1;
        l = (n - 1) % k + 1;
        
        System.out.println(p + " " + l);
        
    }

}


Задача
:comet: Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, потом минуты и секунды для каждого из моментов времени. Известно, что второй момент времени наступил не раньше первого. Определите, сколько секунд прошло между двумя моментами времени.

Входные данные
В первой строке входных данных находятся три целых числа — часы, минуты и секунды первого момента времени. Во второй строке — три числа, характеризующие второй момент времени. Число часов лежит в диапазоне от 0 до 23, число минут и секунд — от 0 до 59.

Выходные данные
Выведите число секунд между двумя моментами времени.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt(); 
        int s1 = sc.nextInt();
        
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        
        s1 = s1 + m1*60 + h1*3600;
        s2 = s2 + m2*60 + h2*3600;
        
        System.out.print( s2 - s1 );
    }

}



Задача
:comet: Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0. Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

Входные данные
Сначала задано число N — количество элементов в массиве (1N100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все элементы массива с чётными номерами.:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Длина массива: ");
        
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        
        int array[] = new int[size]; // Создаём массив int размером в size
        
        System.out.println("Элементы массива:");
        
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        
        System.out.print ("Inserted array elements:");
        
        for (int i = 0; i < size; i+=2) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }

}


Задача
:comet: Дан массив, состоящий из целых чисел. Напишите программу, которая выводит те элементы массива, которые являются чётными числами.

Входные данные
Сначала задано число N — количество элементов в массиве (1N100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все четные элементы массива (то есть те элементы, которые являются четными числами).:comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Длина массива: ");
        
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        
        int array[] = new int[size]; // Создаём массив int размером в size
        
        System.out.println("Элементы массива:");
        
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        
        for (int i = 0; i < size; i++) {
            if (array[i]%2==0) 
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }

    }

}



Задача
:comet: Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитывает количество положительных чисел среди элементов массива.

Входные данные
Сначала задано число N — количество элементов в массиве (1N10000). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо единственное число - количество положительных элементов в массиве. :comet:
import java.util.Scanner;

public class Test {

    public static void main(String[] args) { 
                    
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Длина массива: ");
        
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        
        int array[] = new int[size]; // Создаём массив int размером в size
        
        System.out.println("Элементы массива:");
        
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            if (array[i] > 0)
                counter += 1;
        } 
        System.out.print (counter); 
    }

}



:comet: Задача:comet: 
Напишите функцию int min (int a, int b, int c, int d) (C/C++), static int min (int a, int b, int c, int d) (Java) function min (a,b,c,d: integer):integer (Pascal), находящую наименьшее из четырех данных чисел.

Входные данные
Вводится четыре числа.

Выходные данные
Необходимо вывести  наименьшее из 4-х данных чисел.
вариант первый, он мне нравится своей простотой

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        
        System.out.print("Введите 4 числa: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int f = Math.min(a, b);
        int g = Math.min(c, d);
        int s = Math.min(f, g);
        
        System.out.println(s);
    }
}
(изменено)
вариант второй


import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        
        System.out.print("Введите 4 числa: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(min(a,b,c,d));
    }
    
    public static int min (int a, int b, int c, int d) {
        if (a < b && a< c && a < d) {
            return a;
        } else if (b < a && b < c && b < d) {
            return b;
        } else if (c < a && c < b && c < d) {
            return c;
        } else {
            return d;
        }
    }
    }


третий вариант
дополнила, выбор минимального и максимального числа с введенного массива
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Длина массива: ");
        
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        
        int array[] = new int[size]; // Создаём массив int размером в size
        
        System.out.println("Элементы массива:");
        
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for (int i = 0; i < size; i++) {
            if (array[i] > max)
                max = array[i];
            
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        
    }
    }



:comet: Задача:comet: 
Проверьте, является ли число простым.

Входные данные
Вводится одно натуральное число n не превышающее 2000000000 и не равное 1.

Выходные данные
Необходимо вывести  строку prime, если число простое, или composite, если число составное.
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in); 
        System.out.println("Введите число: ");
        
        int n = a.nextInt();
        
        int i;
        
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("composite ");
        } else {
            System.out.println("prime ");
        }
        
        
    }
    }



Задача

Даны целые числа 1≤n≤10^18 и 2≤m≤10^5, необходимо найти остаток от деления n-го числа Фибоначчи на m.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Testing {

        public static long getFibonacciHuge(long n, long m) {

            List<Integer> modulos = new ArrayList<>();
            modulos.add(0);
            modulos.add(1);
            int i = 0;

            while(! (i > 0 && modulos.get(i) == 0 && modulos.get(i + 1) == 1)) {
                modulos.add((int) ((
                        modulos.get(  i  ) % m +
                        modulos.get(i + 1) % m ) % m));
                i++;
            }
            return modulos.get((int) (n % i));
        }

        public static long getFibonacciHuge_BZ(long n, long m) {
            long fi = 0, fj = 1; 
            long i = 0, tmp = 0;
            while(! (i > 0 && fi % m == 0 && fj % m == 1)) {
                tmp = fi + fj;
                fi = fj;
                fj = tmp;
                i++;
            }
            
            return (n % i) % m;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long n = scan.nextLong();
            long m = scan.nextLong();
                        
            System.out.println(getFibonacciHuge(n, m));
            
    }
    }



:comet: Задача:comet: 
Напишите программу, которая определяет, сколько раз встречается заданное число x в данном массиве.

Входные данные
В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.

Во второй строке вводятся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).

В третьей строке содержится одно целое число x , не превосходящее по модулю 1000.

Выходные данные
Вывести одно число – сколько раз встречается x в данном массиве.
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) { 
        
        int counter,num, item, array[];
        
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер размера: ");
        
        num = input.nextInt();
        
        //создаем пустой массив, определенного выше размера
        array = new int[num];
        
        System.out.println("Введите " + num + " чисел");
        
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
        
        System.out.println("Введите число которое надо найти: ");
        
        item = input.nextInt();
        int sum = 0;
        
        for (int i = 0; i < num; i++) {
            if(array[i] == item) {
                ++sum;    
            }
        }
        System.out.println(sum);
}}



:comet: Задача :comet: 
Напишите программу, которая определяет, встречается ли заданное число x в данном массиве.

Входные данные
В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.

Во второй строке вводятся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).

В третьей строке содержится одно целое число x, не превосходящее по модулю 1000.

Выходные данные
Вывести YES , если число x встречается в данном массиве, и NO в противном случае.
 
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) { 
        
        int counter,num, item, array[];
        
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер размера: ");
        
        num = input.nextInt();
        
        //создаем пустой массив, определенного выше размера
        array = new int[num];
        
        System.out.println("Введите " + num + " чисел");
        
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
        
        System.out.println("Введите число которое надо найти: ");
        
        item = input.nextInt();
        int sum = 0;
        
        for (int i = 0; i < num; i++) {
            if(array[i] == item) {
                System.out.println("Yes");    
            } else {
                System.out.println("No");
            }
            break;
        }
}}


:comet: Задача на программирование: число инверсий :comet: 
﻿

Первая строка содержит число 1≤n≤105, вторая — массив A[1…n], содержащий натуральные числа, не превосходящие 109. Необходимо посчитать число пар индексов 1≤i<j≤n, для которых A[i]>A[j]. (Такая пара элементов называется инверсией массива. Количество инверсий в массиве является в некотором смысле его мерой неупорядоченности: например, в упорядоченном по неубыванию массиве инверсий нет вообще, а в массиве, упорядоченном по убыванию, инверсию образуют каждые два элемента.)
java 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        mergesort(a);
    }

    private static long inv = 0;

    private static void mergesort(int[] a) {
        int sz = (int)Math.round(a.length / 2.0);

        int[] q = new int[sz * 2];

        int n = a.length;

        int[] b = new int[a.length];

        int k = 0;

        for (int i = 0; i < n - 1; i += 2) {
            int x = a[i];

            int y = a[i + 1];

            if (x > y) {
                a[i] = y;

                a[i + 1] = x;

                inv++;
            }

            q[k++] = i;

            q[k++] = i + 1;
        }

        if (k < q.length - 1) {
            int idx = n - 1;

            q[k++] = idx;

            q[k] = idx;
        }

        int head = 0;

        int tail = q.length;

        int[] src = a;

        int[] dest = b;

        int prevxlen = 2;
        while (sz > 1) {
            int xl = q[head++];

            int xr = q[head++];

            if (tail == q.length)
                tail = 0;

            if (head == q.length) {
                head = 0;
            }

            int yl = q[head++];

            int yr = q[head++];

            int xlen = (xr - xl + 1);

            int ylen = (yr - yl + 1);

            if (xlen < ylen) {
                head -= 2;

                System.arraycopy(src, xl, dest, xl, xlen);

                q[tail++] = xl;

                q[tail++] = xr;

                if (tail == q.length)
                    tail = 0;

                continue;
            }

            if (head == q.length) {
                head = 0;
            }

            if (xlen > prevxlen) {
                int[] swap = src;

                src = dest;

                dest = swap;
            }

            prevxlen = xlen;

            assert xr == yl - 1;

            merge(xl, xr, yl, yr, src, dest);

            q[tail++] = xl;

            q[tail++] = yr;

            if (tail == q.length)
                tail = 0;

            sz--;
        }

        System.out.println(inv);
    }
  private static void merge(int xl, int xr, int yl, int yr, int[] src, int[] dest) {
        int i = xl, j = yl, k = 0;

        while (i <= xr && j <= yr) {
            if (src[i] <= src[j])
                dest[xl + k++] = src[i++];
            else {
                dest[xl + k++] = src[j++];

                inv += (xr - i + 1);
            }
        }

        if (i <= xr)
            System.arraycopy(src, i, dest, xl + k, xr - i + 1);

        if (j <= yr)
            System.arraycopy(src, j, dest, xl + k, yr - j + 1);
    }
}

